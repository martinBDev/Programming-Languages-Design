package codegenerator;

import ast.Program;
import ast.definition.Definition;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.Expression;
import ast.expression.FunctionInvocation;
import ast.statement.*;
import ast.type.FunctionType;
import ast.type.Type;
import ast.type.Void;
import visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractCodeGeneratorVisitor<Void,Object> {

    private ValueCGVisitor value;
    private AddressCGVisitor address;
    private CodeGenerator cg;

    public ExecuteCGVisitor(CodeGenerator cg){

        this.cg = cg;
        this.value = new ValueCGVisitor(cg);
        this.address = new AddressCGVisitor(cg);

        value.setAddress(address);
        address.setValue(value);

    }

    /**
     * execute[[Program : program --> definition*]]() =
     *          <call main>
     *          <halt>
     *          for(Definition def : definition*){
     *              execute[[def]]
     *          }
     * @param program
     * @param param
     * @return
     */
    @Override
    public Void visit(Program program , Object param){

        cg.mainProgram();

        //Primero variables globales
        cg.comment("# GLOBAL VARIABLES");
        for( Definition def : program.getDefinitions()){

            if(def instanceof VariableDefinition){
                def.accept(this,param);
            }

        }

        //Después funciones
        cg.comment("# FUNCTIONS");

        for( Definition def : program.getDefinitions()){

            if(def instanceof FunctionDefinition){
                def.accept(this,param);
            }

        }
        return null;
    }


    /**
     * execute[[Assignment : statement --> exp1 exp2]]() =
     *          address[[exp1]]
     *          value[[exp2]]
     *          <store> exp1.type.suffix()
     * @param assignment
     * @param param
     * @return
     */
    @Override
    public Void visit(Assignment assignment, Object param){


        cg.writeLine(assignment.getLine());
        cg.comment("    * Assignment statement");

        assignment.getLeftExpr().accept(this.address,param);
        assignment.getRightExpr().accept(this.value,param);
        cg.store(assignment.getLeftExpr().getType());

        return null;
    }


    /**
     * execute[[Print : statement --> expresion*]]() =
     *        for(Expression exp : expresion*){
     *            VALUE[[exp]]
     *            <out> exp.type.suffix()
     *        }
     * @param print
     * @param param
     * @return
     */
    @Override
    public Void visit(Print print, Object param){



        for(Expression exp : print.getExpressions()){
            cg.writeLine(print.getLine());
            cg.comment("    * Print statement");
            exp.accept(this.value,param);
            cg.out(exp.getType());
        }

        return null;
    }

    /**
     * execute[[Input : statement --> expresion*]]() =
     *        for(Expression exp : expresion*){
     *            address[[exp]]
     *            <in> exp.type.suffix()
     *            <store> exp.type.suffix()
     *        }
     * @param input
     * @param param
     * @return
     */
    @Override
    public Void visit(Input input, Object param){


        for(Expression exp : input.getExpressions()){
            cg.writeLine(input.getLine());

            cg.comment("    * Input statement");
            exp.accept(this.address,param);
            cg.in(exp.getType());
            cg.store(exp.getType());
        }

        return null;
    }


    /**
     * execute[[VariableDefinition : definition --> type ID]]() =
     *          <' * > type.toString  definition.getName() <(offset: > definition.offset <)>
     *
     * @param varDef
     * @param param
     * @return
     */
    @Override
    public Void visit(VariableDefinition varDef , Object param){

        cg.comment(" * " + varDef.getType().toString() + " " + varDef.getName() + " (offset: " + varDef.getOffset() + ")");

        return null;
    }


    /**
     * execute[[FunctionDefinition : definition --> type ID variableDefinition* statement*]]() =
     *
     *   <ID:>
     *
     *   <' * Locals: >
     *   variableDefinition*.forEach( varDef -> { execute[[varDef]] });
     *   int byteLocals = variableDefinition*.isEmpty() ? 0 : variableDefinition*.get(variableDefinition*.size() -1).offset
     *
     *   <enter > byteLocals
     *
     *   //type is casted to FunctionType
     *
     *   int bytesParameters = 0;
     *   for(VariableDefinitions def : type.parameters){
     *       bytesParameters += def.type.numberOfBytes();
     *   }
     *
     *   int bytesReturn = type.getReturningType().numberOfBytes();
     *
     *   statement*.forEach(stmt -> { execute[[stmt]] })
     *
     *   if(type.getReturningType().equals( Void.getInstance() )){
     *       <ret > bytesReturn , bytesLocals , bytesParams
     *   }
     *
     *
     * @param funcDef
     * @param param
     * @return
     */
    @Override
    public Void visit(FunctionDefinition funcDef , Object param){

        cg.comment(" * FunctionDefinition: "); // ' * locals:
        cg.label(funcDef.getName()); //<label:>
        cg.comment(" * Locals: "); // ' * locals:
        funcDef.getVariableDefinitions().forEach(def -> {def.accept(this,param);});

        //LOCAL VARIABLES' BYTES
        int byteLocals = funcDef.getVariableDefinitions()
                .isEmpty() ? 0 : - funcDef.getVariableDefinitions().get(
                        funcDef.getVariableDefinitions().size() -1).getOffset();

        cg.enter(byteLocals);

        //PARAMETER'S BYTES

        FunctionType funcType = (FunctionType)funcDef.getType();

        int bytesParameters = funcType.getBytesOfParams();


        //RETURN'S PARAMETERS
        int bytesReturn = funcType.getReturningType().numberOfBytes();


        //EXECUTE FUNCTION'S STATEMENTS
        //Array with bytesLocal and bytesParameters passed as param as INHERITED ATTRIBUTE
        //to allow visit(Return) to know how many bytes to clean


        funcDef.getStatements().forEach(stmt -> { stmt.accept(this, funcDef); });

        //IF IT RETURNS VOID, THERE IS NO RETURN STATEMENT EXECUTED IN LINE ABOVE THIS ONE
        //SO IT IS STILL NECESSARY TO INVOKE RET TO CLEAN THE STACK
        if(funcType.getReturningType().equals(Void.getInstance())){
            cg.ret(bytesReturn,byteLocals,bytesParameters);
        }

        return null;
    }



    /**
     * execute[[While : statement1 --> expression statement2* ]]() =
     *          int condition = codegenerato.getLabelCounter();
     *          int end = codegenerator.getLabelCounter();
     *
     *          <label_> condition < :>
     *          value[[expression]]
     *          <jz label_> end
     *          statement2*.forEach( stmt -> { execute[[stmt]] })
     *          <jmp label_> condition
     *          <label_>end< :>
     *
     * @param whileStmt
     * @param param
     * @return
     */
    @Override
    public Void visit(While whileStmt , Object param){

        cg.writeLine(whileStmt.getLine());
        cg.comment("    * While statement");

        int condition = cg.getLabelCounter();
        int end = cg.getLabelCounter();

        cg.label(condition);
        whileStmt.getExpression().accept(this.value,param);
        cg.jz("label_" + end);
        whileStmt.getStatements().stream().forEach(stmt -> {stmt.accept(this,param);});
        cg.jmp("label_" + condition);
        cg.label(end);

        return null;
    }

    /**
     * execute[[If : statement1 --> expression statement2* statement3* ]]() =
     *          int elseStmt = cg.getLabelCounter();
     *          int end = cg.getLabelCounter();
     *
     *          boolean hasElse = statement3*.size() >= 0; //Si no hay else
     *          value[[expression]]
     *
     *          if(hasElse){
     *              <jz label_>elseStmt
     *          }else{
     *              <jz label_>end
     *          }
     *
     *          statement2*.forEach( stmt -> {execute[[stmt]] })
     *
     *          <jmp label_>end
     *
     *          if(hasElse){
     *              <label_>elseStmt < :>
     *              statement3*.forEach(stmt -> {execute[[stmt]]});
     *          }
     *
     *          <label_>end < :>
     *
     *
     *
     * @param ifStmt
     * @param param
     * @return
     */
    @Override
    public Void visit(If ifStmt , Object param){

        cg.writeLine(ifStmt.getLine());
        cg.comment("    * If statement");

        int elseStmt = cg.getLabelCounter();
        int end = cg.getLabelCounter();
        boolean hasElse = ifStmt.getStatementsWhenFalse().size() > 0; //Si no hay else

        ifStmt.getCondition().accept(this.value,param);


        if(hasElse){
            cg.jz("label_" + elseStmt);
        }else{
            cg.jz("label_" + end);
        }

        ifStmt.getStatementsWhenTrue().stream().forEach(stmt -> {stmt.accept(this,param);});
        cg.jmp("label_" + end);

        if(hasElse){
            cg.label(elseStmt);
            ifStmt.getStatementsWhenFalse().stream().forEach(stmt -> {stmt.accept(this,param);});
        }

        cg.label(end);

        return null;
    }


    /**
     * execute[[FunctionInvocation : statement -> exp1 exp2*]]() =
     *         value[[(Expression)statement]]
     *          Type returningType = ((FunctionType) ((FunctionInvocation)statement).getDefinition().getType()).getReturningType();
     *         if( ! returningType instanceof Void ){
     *             <pop> returningType.suffix
     *         }
     *
     * @param func
     * @param param
     * @return
     */
    @Override
    public Void visit(FunctionInvocation func, Object param){

        cg.writeLine(func.getLine());
        cg.comment("    * Function Invocation");

        ((Expression)func).accept(this.value,param);
        Type returningType = ((FunctionType) func.getDefinition().getType()).getReturningType();
        if(! returningType.equals(Void.getInstance()) ){
            cg.pop(returningType);
        }

        return null;
    }


    /**
     * execute[[ Return : statement --> expression]](functionDefinition)=
     *          <ret >expression.getType.numberOfBytes() <,>
     *                  functionDefinition.getBytesOfLocals() <,>
     *                  ((FunctionType)functionDefinition.getType()).getBytesOfParams()
     *
     * @param returnStmt
     * @param param
     * @return
     */
    @Override
    public Void visit(Return returnStmt, Object param){

        cg.writeLine(returnStmt.getLine());
        cg.comment("    * Return");

        returnStmt.getExprToReturn().accept(this.value,param);

        FunctionDefinition funcDef = (FunctionDefinition) param;
        cg.ret( returnStmt.getExprToReturn().getType().numberOfBytes() ,
                funcDef.getBytesOfLocals() ,
                ((FunctionType)funcDef.getType()).getBytesOfParams());


        return null;
    }

}

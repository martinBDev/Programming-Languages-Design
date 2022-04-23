package codegenerator;

import ast.Program;
import ast.definition.Definition;
import ast.definition.VariableDefinition;
import ast.expression.Expression;
import ast.statement.Assignment;
import ast.statement.Input;
import ast.statement.Print;
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

        for( Definition def : program.getDefinitions()){
            def.accept(this,param);
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

        assignment.getLeftExpr().accept(this.address,param);
        assignment.getRightExpr().accept(this.value,param);
        cg.load(assignment.getLeftExpr().getType());

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
            exp.accept(this.value,param);
            cg.out(exp.getType());
        }

        return null;
    }

    /**
     * execute[[Input : statement --> expresion*]]() =
     *        for(Expression exp : expresion*){
     *            VALUE[[exp]]
     *            <in> exp.type.suffix()
     *        }
     * @param input
     * @param param
     * @return
     */
    @Override
    public Void visit(Input input, Object param){

        for(Expression exp : input.getExpressions()){
            exp.accept(this.value,param);
            cg.in(exp.getType());
        }

        return null;
    }

}

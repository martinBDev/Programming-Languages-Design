package semantic;

import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import ast.type.Double;
import ast.type.Integer;
import ast.type.Void;
import visitor.AbstractVisitor;

import java.util.ArrayList;
import java.util.List;


public class TypeCheckingVisitor extends AbstractVisitor<Type,Type> {

    @Override
    public Type visit(Arithmetic a , Type param){

        a.setLValue(false);
        a.getRight().accept(this,param);
        a.getLeft().accept(this,param);

        a.setType(
                a.getRight().getType().arithmetic(
                        a.getLeft().getType()
                        ,a));


        return null;
    }

    @Override
    public Type visit(ArrayAccess a , Type param){

        a.setLValue(true);
        a.getLeftExpr().accept(this,param);
        a.getRightExpr().accept(this,param);

        a.setType(
                a.getLeftExpr().getType().squareBrackets( a.getRightExpr().getType(), a)
        );

        return null;

    }



    @Override
    public Type visit(Cast c , Type param){

        c.setLValue(false);
        c.getToTypeCast().accept(this,param);
        c.getExpression().accept(this,param);

        c.setType(
                c.getExpression().getType().canBeCasted(c.getToTypeCast(),c)
        );

        return null;
    }

    @Override
    public Type visit(CharLiteral c , Type param){
        c.setLValue(false);
        c.setType(
                Char.getInstance()
        );
        return null;
    }

    @Override
    public Type visit(Comparison c , Type param){
        c.setLValue(false);
        c.getRightExpr().accept(this,param);
        c.getLeftExpr().accept(this,param);

        c.setType(
                c.getLeftExpr().getType().comparison( c.getRightExpr().getType(),c)
        );

        return null;
    }

    @Override
    public Type visit(DoubleLiteral dl , Type param){
        dl.setLValue(false);

        dl.setType(
                Double.getInstance()
        );
        return null;
    }

    @Override
    public Type visit(FieldAccess fa , Type param){
        fa.setLValue(true);
        fa.getExpression().accept(this,param);

        fa.setType(
                fa.getExpression().getType().dot(fa.getFieldName(),fa)
        );

        return null;
    }

    @Override
    public Type visit(FunctionInvocation fi , Type param){
        fi.setLValue(false);
        fi.getExpressions().stream().forEach((Expression e)->{e.accept(this,param);});

        List<Type> typesParams = new ArrayList<Type>();

        for(Expression ex : fi.getExpressions()){
            typesParams.add(ex.getType());
        }

        //This check is to avoid repeated errors. if for example the function has not been defined, its type will be error,
        //and a message will appear, without this check, the message appears, and then errorTyoe call parenthesis(), and
        //in the abstract visitor it will throw another error
        if(!fi.getDefinition().getType().isErrorType()) {
            fi.setType(
                    fi.getDefinition().getType().parenthesis( typesParams, fi)
            );
        }else{
            fi.setType(
                    fi.getDefinition().getType()
            );
        }


        return null;
    }

    @Override
    public Type visit(IntLiteral i , Type param){
        i.setLValue(false);
        i.setType(
                Integer.getInstance()
        );
        return null;
    }

    @Override
    public Type visit(Logical lo , Type param){
        lo.setLValue(false);
        lo.getRightExpr().accept(this,param);
        lo.getLeftExpr().accept(this,param);

        lo.setType(
                lo.getLeftExpr().getType().logical( lo.getRightExpr().getType(), lo)
        );

        return null;
    }

    @Override
    public Type visit(UnaryMinus um , Type param){
        um.setLValue(false);
        um.getExpression().accept(this,param);

        um.setType(
                um.getExpression().getType().unaryMinus(um)
        );

        return null;
    }


    @Override
    public Type visit(UnaryNot un , Type param){
        un.setLValue(false);
        un.getExpression().accept(this,param);

        un.setType(
                un.getExpression().getType().unaryNegation(un)
        );

        return null;
    }




    @Override
    public Type visit(Variable va , Type param){
        va.setLValue(true);

        va.setType(
                va.getDefinition().getType()
        );

        return null;
    }


    @Override
    public Type visit(Assignment a, Type param){
        a.getLeftExpr().accept(this,param);
        a.getRightExpr().accept(this,param);

        if( !a.getLeftExpr().getLValue() )
        {
            new ErrorType(
                a.getLeftExpr().getLine(),
                a.getLeftExpr().getColumn(),
                "Invalid expression on left hand side of an assignment, must be Lvalue");
        }

        a.getLeftExpr().setType(
                a.getRightExpr().getType().promotesTo(a.getLeftExpr().getType(),a)
        );

        return null;
    }

    @Override
    public Type visit(Print printStmnt , Type param){

        printStmnt.getExpressions().stream().forEach(exp -> {exp.accept(this,param);});

        int count = 0;
        for(Expression exp : printStmnt.getExpressions()){

            //Just to generate errors referring to INPUT only where an error has been raised before
            if(!exp.getType().isErrorType() ) {

                //IF EXP IS NOT LVALUE OR CHAR OR DOUBLE OR INT
                if(!exp.getLValue()
                        && !exp.getType().equals(Char.getInstance())
                        && !exp.getType().equals(Integer.getInstance())
                        && !exp.getType().equals(Double.getInstance())){


                    new ErrorType(printStmnt.getLine(),printStmnt.getColumn(),
                            "Expression number " + count + " on Print statement has to be an LValue");
                }

                //IF EXP HAS NOT NUILT IN TYPE
                if(!exp.getType().isBuiltIn() ){
                    new ErrorType(printStmnt.getLine(),printStmnt.getColumn(),
                            "Expression number " + count + " on Print statement has to be built in type");
                }


            }
        }

        return null;
    }

    @Override
    public Type visit(Input inputStmnt , Type param){

        inputStmnt.getExpressions().stream().forEach(exp -> {exp.accept(this,param);});

        int count = 0;
        for(Expression exp : inputStmnt.getExpressions()){


            //Just to generate errors referring to INPUT only where an error has been raised before
            if(!exp.getType().isErrorType() ) {

                //IF EXP IS NOT LVALUE
                if(!exp.getLValue() ){


                    new ErrorType(inputStmnt.getLine(),inputStmnt.getColumn(),
                            "Expression number " + count + " on Input statement has to be an LValue");
                }

                //IF EXP HAS NOT NUILT IN TYPE
                if(!exp.getType().isBuiltIn() ){
                    new ErrorType(inputStmnt.getLine(),inputStmnt.getColumn(),
                            "Expression number " + count + " on Input statement has to be built in type");
                }


            }


            count++;
        }

        return null;
    }

    @Override
    public Type visit(While whileStmnt , Type param){

        whileStmnt.getExpression().accept(this,param);
        whileStmnt.getStatements().stream().forEach(stm -> {stm.accept(this,param);});

        if(!whileStmnt.getExpression().getType().isLogical()){
            new ErrorType(whileStmnt.getLine(),whileStmnt.getColumn(),
                    "Condition on while statement must be logical.");
        }


        return null;
    }

    @Override
    public Type visit(FunctionDefinition f, Type param) {


        Type retStatementType = Void.getInstance();
        Type accepted = null;
        for(Statement s : f.getStatements()){
            //SI se espera return, pero no hay, queda como tipo Void
            //We pass the type as param, so visit(ReturnStatement) can use it
             accepted = s.accept(this,f.getType());
            if( accepted != null && ! accepted.equals(Void.getInstance())){
                retStatementType = accepted;
            }
        }

        f.getVariableDefinitions().stream().forEach((VariableDefinition s)->{s.accept(this,param);});

        Type resultOfExec = retStatementType.promotesTo(
                ((FunctionType)f.getType()).getReturningType()  , f
        );


        //Check that last statement is a return if its needed
        if( !( ((FunctionType)f.getType()).getReturningType().equals(Void.getInstance())) &&
                !(f.getStatements().get(f.getStatements().size()-1) instanceof Return)){
            new ErrorType(f.getLine(),f.getColumn(),"Cannot be an statement aftr the last return");
        }

        return null;
    }



    //TODO
    @Override
    public Type visit(Return returnStmnt , Type param){

        FunctionType retType = (FunctionType) param;
        returnStmnt.getExprToReturn().accept(this,retType.getReturningType());

        //If type of return expr is different from defined on function definition, the type of return changes to error
        returnStmnt.getExprToReturn().setType(
                returnStmnt.getExprToReturn().getType().promotesTo(retType.getReturningType(),returnStmnt)
        );

        //Return upwards the type of the return to check if there is a return inside a function
        return returnStmnt.getExprToReturn().getType();
    }
    //TODO
    @Override
    public Type visit(If ifStmnt , Type param){

        //Visit children
        super.visit(ifStmnt,param);

        if(!ifStmnt.getCondition().getType().isLogical()){
            new ErrorType(ifStmnt.getLine(), ifStmnt.getColumn(),
                    "If statements's condition must be logical");
        }


        return null;
    }


}

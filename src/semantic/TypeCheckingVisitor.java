package semantic;

import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import ast.type.Double;
import ast.type.Integer;
import visitor.AbstractVisitor;

import java.lang.Void;
import java.util.ArrayList;
import java.util.List;


public class TypeCheckingVisitor extends AbstractVisitor<java.lang.Void,Type> {

    @Override
    public Void visit(Arithmetic a , Type param){

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
    public Void visit(ArrayAccess a , Type param){

        a.setLValue(true);
        a.getLeftExpr().accept(this,param);
        a.getRightExpr().accept(this,param);

        a.setType(
                a.getLeftExpr().getType().squareBrackets( a.getRightExpr().getType(), a)
        );

        return null;

    }



    @Override
    public Void visit(Cast c , Type param){

        c.setLValue(false);
        c.getToTypeCast().accept(this,param);
        c.getExpression().accept(this,param);

        c.setType(
                c.getExpression().getType().canBeCasted(c.getToTypeCast(),c)
        );

        return null;
    }

    @Override
    public Void visit(CharLiteral c , Type param){
        c.setLValue(false);
        c.setType(
                Char.getInstance()
        );
        return null;
    }

    @Override
    public Void visit(Comparison c , Type param){
        c.setLValue(false);
        c.getRightExpr().accept(this,param);
        c.getLeftExpr().accept(this,param);

        c.setType(
                c.getLeftExpr().getType().comparison( c.getRightExpr().getType(),c)
        );

        return null;
    }

    @Override
    public Void visit(DoubleLiteral dl , Type param){
        dl.setLValue(false);

        dl.setType(
                Double.getInstance()
        );
        return null;
    }

    @Override
    public Void visit(FieldAccess fa , Type param){
        fa.setLValue(true);
        fa.getExpression().accept(this,param);

        fa.setType(
                fa.getExpression().getType().dot(fa.getFieldName(),fa)
        );

        return null;
    }

    @Override
    public Void visit(FunctionInvocation fi , Type param){
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
    public Void visit(IntLiteral i , Type param){
        i.setLValue(false);
        i.setType(
                Integer.getInstance()
        );
        return null;
    }

    @Override
    public Void visit(Logical lo , Type param){
        lo.setLValue(false);
        lo.getRightExpr().accept(this,param);
        lo.getLeftExpr().accept(this,param);

        lo.setType(
                lo.getLeftExpr().getType().logical( lo.getRightExpr().getType(), lo)
        );

        return null;
    }

    @Override
    public Void visit(UnaryMinus um , Type param){
        um.setLValue(false);
        um.getExpression().accept(this,param);

        um.setType(
                um.getExpression().getType().unaryMinus(um)
        );

        return null;
    }


    @Override
    public Void visit(UnaryNot un , Type param){
        un.setLValue(false);
        un.getExpression().accept(this,param);

        un.setType(
                un.getExpression().getType().unaryNegation(un)
        );

        return null;
    }




    @Override
    public Void visit(Variable va , Type param){
        va.setLValue(true);

        va.setType(
                va.getDefinition().getType()
        );

        return null;
    }


    @Override
    public Void visit(Assignment a, Type param){
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
    public Void visit(Print printStmnt , Type param){

        printStmnt.getExpressions().stream().forEach(exp -> {exp.accept(this,param);});

        int count = 0;
        for(Expression exp : printStmnt.getExpressions()){

            //Just to generate errors referring to INPUT only where an error has been raised before
            if(!exp.getType().isErrorType() ) {

                //IF EXP IS NOT LVALUE
                if(!exp.getLValue() ){


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
    public Void visit(Input inputStmnt , Type param){

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
    public Void visit(While whileStmnt , Type param){

        whileStmnt.getExpression().accept(this,param);
        whileStmnt.getStatements().stream().forEach(stm -> {stm.accept(this,param);});

        if(!whileStmnt.getExpression().getType().isLogical()){
            new ErrorType(whileStmnt.getLine(),whileStmnt.getColumn(),
                    "Condition on while statement must be logical.");
        }


        return null;
    }

    @Override
    public Void visit(FunctionDefinition f, Type param) {

        //We pass the type as param, so visit(ReturnStatement) can use it
        f.getStatements().stream().forEach((Statement s)->{s.accept(this,f.getType());});
        f.getVariableDefinitions().stream().forEach((VariableDefinition s)->{s.accept(this,param);});
        return null;
    }



    //TODO
    @Override
    public Void visit(Return returnStmnt , Type param){

        FunctionType retType = (FunctionType) param;
        returnStmnt.getExprToReturn().accept(this,retType.getReturningType());

        //If type of return expr is different from defined on function definition, the type of return changes to error
        returnStmnt.getExprToReturn().setType(
                returnStmnt.getExprToReturn().getType().promotesTo(retType.getReturningType(),returnStmnt)
        );


        return null;
    }
    //TODO
    @Override
    public Void visit(If ifStmnt , Type param){

        //Visit children
        super.visit(ifStmnt,param);

        if(!ifStmnt.getCondition().getType().isLogical()){
            new ErrorType(ifStmnt.getLine(), ifStmnt.getColumn(),
                    "If statements's condition must be logical");
        }


        return null;
    }


}

package semantic;

import ast.expression.*;
import ast.statement.*;
import ast.type.ErrorType;
import ast.type.Type;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Void,Type> {

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
        return null;

    }

    @Override
    public Void visit(Cast c , Type param){

        c.setLValue(false);
        c.getType().accept(this,param);
        c.getExpression().accept(this,param);
        return null;
    }

    @Override
    public Void visit(CharLiteral c , Type param){
        c.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Comparison c , Type param){
        c.setLValue(false);
        c.getRightExpr().accept(this,param);
        c.getLeftExpr().accept(this,param);
        return null;
    }

    @Override
    public Void visit(DoubleLiteral dl , Type param){
        dl.setLValue(false);
        return null;
    }

    @Override
    public Void visit(FieldAccess fa , Type param){
        fa.setLValue(true);
        fa.getExpression().accept(this,param);
        return null;
    }

    @Override
    public Void visit(FunctionInvocation fi , Type param){
        fi.setLValue(false);
        fi.getExpressions().stream().forEach((Expression e)->{e.accept(this,param);});
        return null;
    }

    @Override
    public Void visit(IntLiteral i , Type param){
        i.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Logical lo , Type param){
        lo.setLValue(false);
        lo.getRightExpr().accept(this,param);
        lo.getLeftExpr().accept(this,param);
        return null;
    }

    @Override
    public Void visit(UnaryMinus um , Type param){
        um.setLValue(false);
        um.getExpression().accept(this,param);
        return null;
    }


    @Override
    public Void visit(UnaryNot un , Type param){
        un.setLValue(false);
        un.getExpression().accept(this,param);
        return null;
    }

    @Override
    public Void visit(Variable va , Type param){
        va.setLValue(true);
        return null;
    }

    @Override
    public Void visit(Assignment a, Type param){
        a.getLeftExpr().accept(this,param);
        a.getRightExpr().accept(this,param);
        if( !a.getLeftExpr().getLValue() ) new ErrorType(
                a.getLeftExpr().getLine(),
                a.getLeftExpr().getColumn(),
                "Cannot use an assignment on the left hand side of another assignment");



        return null;
    }

    @Override
    public Void visit(Print printStmnt , Type param){

        return null;
    }

    @Override
    public Void visit(Input inputStmnt , Type param){

        return null;
    }

    @Override
    public Void visit(While whileStmnt , Type param){

        return null;
    }

    @Override
    public Void visit(Return returnStmnt , Type param){

        return null;
    }

    @Override
    public Void visit(If ifStmnt , Type param){

        //Visit children
        super.visit(ifStmnt,param);



        return null;
    }


}

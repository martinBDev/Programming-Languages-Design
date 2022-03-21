package semantic;

import ast.expression.*;
import ast.statement.Assignment;
import ast.type.ErrorType;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Object,Object> {

    @Override
    public Object visit(Arithmetic a , Object param){

        a.setLValue(false);
        a.getRight().accept(this,param);
        a.getLeft().accept(this,param);
        return null;

    }

    @Override
    public Object visit(ArrayAccess a , Object param){

        a.setLValue(true);
        a.getLeftExpr().accept(this,param);
        a.getRightExpr().accept(this,param);
        return null;

    }

    @Override
    public Object visit(Cast c , Object param){

        c.setLValue(false);
        c.getType().accept(this,param);
        c.getExpression().accept(this,param);
        return null;
    }

    @Override
    public Object visit(CharLiteral c , Object param){
        c.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Comparison c , Object param){
        c.setLValue(false);
        c.getRightExpr().accept(this,param);
        c.getLeftExpr().accept(this,param);
        return null;
    }

    @Override
    public Object visit(DoubleLiteral dl , Object param){
        dl.setLValue(false);
        return null;
    }

    @Override
    public Object visit(FieldAccess fa , Object param){
        fa.setLValue(true);
        fa.getExpression().accept(this,param);
        return null;
    }

    @Override
    public Object visit(FunctionInvocation fi , Object param){
        fi.setLValue(false);
        fi.getExpressions().stream().forEach((Expression e)->{e.accept(this,param);});
        return null;
    }

    @Override
    public Object visit(IntLiteral i , Object param){
        i.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Logical lo , Object param){
        lo.setLValue(false);
        lo.getRightExpr().accept(this,param);
        lo.getLeftExpr().accept(this,param);
        return null;
    }

    @Override
    public Object visit(UnaryMinus um , Object param){
        um.setLValue(false);
        um.getExpression().accept(this,param);
        return null;
    }


    @Override
    public Object visit(UnaryNot un , Object param){
        un.setLValue(false);
        un.getExpression().accept(this,param);
        return null;
    }

    @Override
    public Object visit(Variable va , Object param){
        va.setLValue(true);
        return null;
    }

    @Override
    public Object visit(Assignment a, Object param){
        a.getLeftExpr().accept(this,param);
        a.getRightExpr().accept(this,param);
        if( !a.getLeftExpr().getLValue() ) new ErrorType(
                a.getLeftExpr().getLine(),
                a.getLeftExpr().getColumn(),
                "Cannot use an assignment on the left hand side of another assignment");



        return null;
    }


}

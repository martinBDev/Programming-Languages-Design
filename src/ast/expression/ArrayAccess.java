package ast.expression;

import visitor.Visitor;

public class ArrayAccess extends AbstractExpression{

    private Expression leftExpr;
    private Expression rightExpr;

    public ArrayAccess(int line, int column, Expression leftExpr, Expression rightExpr) {
        super(line, column);
        this.leftExpr = leftExpr;
        this.rightExpr= rightExpr;
    }

    public Expression getLeftExpr(){
        return this.leftExpr;
    }

    public Expression getRightExpr(){
        return this.rightExpr;
    }

    @Override
    public String toString(){

        return "ArrayAccess: " + leftExpr.toString()
                + '['
                + rightExpr.toString()
                +']';

    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}

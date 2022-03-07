package ast.expression;

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
}

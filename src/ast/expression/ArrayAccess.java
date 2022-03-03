package ast.expression;

public class ArrayAccess extends AbstractExpression{

    private Expression leftExpr;
    private Expression rigthExpr;

    public ArrayAccess(int line, int column, Expression leftExpr, Expression rigthExpr) {
        super(line, column);
        this.leftExpr = leftExpr;
        this.rigthExpr= rigthExpr;
    }

    public Expression getLeftExpr(){
        return this.leftExpr;
    }

    public Expression getRigthExpr(){
        return this.rigthExpr;
    }
}

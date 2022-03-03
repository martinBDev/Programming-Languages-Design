package ast.expression;

public class Logical extends AbstractExpression{

    private Expression leftExpr;
    private Expression rightExpr;
    private String operand;

    public Logical(int line, int column, Expression left, Expression right, String operand) {

        super(line, column);
        this.leftExpr=left;
        this.rightExpr=right;
        this.operand = operand;
    }



    public Expression getRightExpr() {
        return rightExpr;
    }

    public Expression getLeftExpr() {
        return leftExpr;
    }

    public String getOperand() {
        return operand;
    }
}

package ast.expression;

import visitor.Visitor;

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

    @Override
    public String toString(){

        return "Logical: "
                + " - Left Expression: "
                + this.leftExpr.toString()
                + " - Operand: "
                + this.operand
                + " - Right Expression"
                + this.rightExpr.toString();

    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}

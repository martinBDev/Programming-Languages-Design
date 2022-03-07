package ast.statement;

import ast.expression.Expression;

public class Assignment extends AbstractStatement{

    private Expression leftExpr;
    private Expression rightExpr;

    public Assignment(int line, int column, Expression leftExpr, Expression rightExpr) {

        super(line, column);
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }

    public Expression getLeftExpr(){
        return this.leftExpr;
    }

    public Expression getRightExpr(){
        return this.rightExpr;
    }

    @Override
    public String toString(){
        return "Assignment: "
                + " - Left Expression: "
                +this.leftExpr.toString()
                +" - Right Expression "
                +this.rightExpr.toString();
    }


}

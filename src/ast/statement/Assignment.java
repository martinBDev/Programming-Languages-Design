package ast.statement;

import ast.expression.Expression;

public class Assignment extends AbstractStatement{

    private Expression leftExpr;
    private Expression rigthExpr;

    public Assignment(int line, int column, Expression leftExpr, Expression rigthExpr) {

        super(line, column);
        this.leftExpr = leftExpr;
        this.rigthExpr = rigthExpr;
    }

    public Expression getLeftExpr(){
        return this.leftExpr;
    }

    public Expression getRigthExpr(){
        return this.rigthExpr;
    }
}

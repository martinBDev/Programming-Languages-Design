package ast.statement;

import ast.expression.Expression;

public class Assignment extends AbstractStatement{

    private Expression leftExpr;
    private Expression rigthExpr;

    public Assignment(int line, int column) {
        super(line, column);
    }
}

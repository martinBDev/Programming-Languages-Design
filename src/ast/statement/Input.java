package ast.statement;

import ast.expression.Expression;

import java.util.List;

public class Input   extends AbstractStatement {
    private List<Expression> expressions;

    public Input(int line, int column) {
        super(line, column);
    }
}

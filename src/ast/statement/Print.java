package ast.statement;

import ast.expression.Expression;

import java.util.List;

public class Print   extends AbstractStatement{

    private List<Expression> expressions;

    public Print(int line, int column) {
        super(line, column);
    }
}

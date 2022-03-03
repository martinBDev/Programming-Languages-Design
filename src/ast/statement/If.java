package ast.statement;

import ast.expression.Expression;

import java.util.List;

public class If   extends AbstractStatement
{
    private List<Statement> whenTrue;
    private List<Statement> whenFalse;

    private Expression condition;

    public If(int line, int column) {
        super(line, column);
    }
}

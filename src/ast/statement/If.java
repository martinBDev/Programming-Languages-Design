package ast.statement;

import ast.expression.Expression;
import ast.node.AstNodeImpl;

import java.util.List;

public class If extends AstNodeImpl implements Statement
{
    private List<Statement> whenTrue;
    private List<Statement> whenFalse;

    private Expression condition;

    public If(int line, int column) {
        super(line, column);
    }
}

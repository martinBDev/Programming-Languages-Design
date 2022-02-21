package ast.statement;

import ast.expression.Expression;
import ast.node.AstNodeImpl;

import java.util.List;

public class Input extends AstNodeImpl implements Statement {
    private List<Expression> expressions;

    public Input(int line, int column) {
        super(line, column);
    }
}

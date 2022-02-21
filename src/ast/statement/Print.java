package ast.statement;

import ast.expression.Expression;
import ast.node.AstNodeImpl;

import java.util.List;

public class Print extends AstNodeImpl implements Statement{

    private List<Expression> expressions;

    public Print(int line, int column) {
        super(line, column);
    }
}

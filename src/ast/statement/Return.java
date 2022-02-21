package ast.statement;

import ast.expression.Expression;
import ast.node.AstNodeImpl;

public class Return extends AstNodeImpl implements Statement, Expression {

    private Expression exprToReturn;

    public Return(int line, int column) {
        super(line, column);
    }
}

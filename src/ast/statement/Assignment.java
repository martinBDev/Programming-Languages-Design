package ast.statement;

import ast.expression.Expression;
import ast.node.AstNodeImpl;

public class Assignment extends AstNodeImpl implements Statement{

    private Expression leftExpr;
    private Expression rigthExpr;

    public Assignment(int line, int column) {
        super(line, column);
    }
}

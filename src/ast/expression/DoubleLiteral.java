package ast.expression;

import ast.node.AstNodeImpl;

public class DoubleLiteral extends AstNodeImpl implements Expression {
    public DoubleLiteral(int line, int column) {
        super(line, column);
    }
}

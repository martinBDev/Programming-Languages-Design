package ast.expression;

import ast.node.AstNodeImpl;

public class IntLiteral extends AstNodeImpl implements Expression {
    public IntLiteral(int line, int column) {
        super(line, column);
    }
}

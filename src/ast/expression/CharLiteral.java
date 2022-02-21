package ast.expression;

import ast.node.AstNodeImpl;

public class CharLiteral extends AstNodeImpl implements Expression {
    public CharLiteral(int line, int column) {
        super(line, column);
    }
}

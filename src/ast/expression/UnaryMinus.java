package ast.expression;

import ast.node.AstNodeImpl;

public class UnaryMinus extends AstNodeImpl implements Expression{

    private Expression expr;

    public UnaryMinus(int line, int column) {
        super(line, column);
    }
}

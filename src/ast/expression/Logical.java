package ast.expression;

import ast.node.AstNodeImpl;

public class Logical extends AstNodeImpl implements Expression{
    public Logical(int line, int column) {
        super(line, column);
    }
}

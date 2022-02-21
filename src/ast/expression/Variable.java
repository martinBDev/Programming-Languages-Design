package ast.expression;

import ast.node.AstNodeImpl;

public class Variable extends AstNodeImpl implements Expression {
    public Variable(int line, int column) {
        super(line, column);
    }
}

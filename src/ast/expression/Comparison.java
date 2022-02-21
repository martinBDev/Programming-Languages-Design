package ast.expression;

import ast.node.AstNodeImpl;

public class Comparison extends AstNodeImpl implements Expression{


    public Comparison(int line, int column) {
        super(line, column);
    }
}

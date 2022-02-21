package ast.type;

import ast.node.AstNodeImpl;

public class Array extends AstNodeImpl implements Type{

    private int size;
    private Type type;

    public Array(int line, int column) {
        super(line, column);
    }
}

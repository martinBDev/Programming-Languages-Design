package ast.type;

import ast.node.AstNodeImpl;

public class Void extends AstNodeImpl implements Type{
    public Void(int line, int column) {
        super(line, column);
    }
}

package ast.type;

import ast.node.AstNodeImpl;

public class Char extends AstNodeImpl implements Type{
    public Char(int line, int column) {
        super(line, column);
    }
}

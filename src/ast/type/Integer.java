package ast.type;

import ast.node.AstNodeImpl;

public class Integer extends AstNodeImpl implements Type{
    public Integer(int line, int column) {
        super(line, column);
    }
}

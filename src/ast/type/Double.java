package ast.type;

import ast.node.AstNodeImpl;

public class Double extends AstNodeImpl implements Type{
    public Double(int line, int column) {
        super(line, column);
    }
}

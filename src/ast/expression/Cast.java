package ast.expression;

import ast.node.AstNodeImpl;
import ast.type.Type;

public class Cast extends AstNodeImpl implements Expression{

    private Type type;
    private Expression expr;

    public Cast(int line, int column) {
        super(line, column);
    }
}

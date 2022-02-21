package ast.expression;

import ast.node.AstNodeImpl;

public class FieldAccess extends AstNodeImpl implements Expression{

    private String fieldName;
    private Expression expr;

    public FieldAccess(int line, int column) {
        super(line, column);
    }
}

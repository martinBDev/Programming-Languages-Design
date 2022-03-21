package ast.expression;

import ast.node.AstNode;

public interface Expression extends AstNode {

    boolean getLValue();
    void setLValue(boolean value);
}

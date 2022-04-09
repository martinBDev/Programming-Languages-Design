package ast.expression;

import ast.node.AstNode;
import ast.type.Type;

public interface Expression extends AstNode {

    boolean getLValue();
    void setLValue(boolean value);

    Type getType();
    void setType(Type t);
}

package ast.node;

import visitor.Visitor;

public interface AstNode {


    int getLine();
    int getColumn();
    <TR,TP> TR accept(Visitor<TR,TP> v, TP param);

}

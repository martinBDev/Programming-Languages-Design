package ast.node;

import visitor.Visitor;

public interface AstNode {


    int getLine();
    int getColumn();
    <TP,TR> TR accept(Visitor<TP,TR> v, TP param);

}

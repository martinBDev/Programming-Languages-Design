package ast.node;

import ast.node.AstNode;

public abstract class AstNodeImpl implements AstNode {


    private int line;
    private int column;

    public AstNodeImpl(int line, int column){
        this.line = line;
        this.column = column;
    }


    @Override
    public int getColumn() {
        return column;
    }

    @Override
    public int getLine(){
        return line;
    }
}

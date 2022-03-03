package ast;

import ast.node.AstNode;

public class Program implements AstNode {

    private int line;
    private int column;


    public Program(int line, int column) {
        this.line = line;
        this.column = column;

    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}

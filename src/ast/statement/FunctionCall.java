package ast.statement;

import ast.node.AstNodeImpl;

public class FunctionCall extends AstNodeImpl implements Statement {


    public FunctionCall(int line, int column) {
        super(line, column);
    }
}

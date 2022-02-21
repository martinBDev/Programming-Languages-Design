package ast.expression;

import ast.node.AstNodeImpl;
import ast.statement.Statement;

public class FunctionInvocation extends AstNodeImpl implements Expression {

    private Statement expr;
    private Variable name;

    public FunctionInvocation(int line, int column) {
        super(line, column);
    }
}

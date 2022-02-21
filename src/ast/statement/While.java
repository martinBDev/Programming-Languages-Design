package ast.statement;

import ast.expression.Expression;
import ast.node.AstNodeImpl;

import java.util.List;

public class While extends AstNodeImpl implements Statement{

    private List<Statement> statements;
    private List<Expression> expressions;


    public While(int line, int column) {
        super(line, column);
    }
}

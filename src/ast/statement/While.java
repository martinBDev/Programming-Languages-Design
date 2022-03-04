package ast.statement;

import ast.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class While   extends AbstractStatement{

    private List<Statement> statements;
    private Expression expression;


    public While(int line, int column, Expression expression ,List<Statement> statements)
    {
        super(line, column);
        this.statements = statements;
        this.expression = expression;
    }

    public List<Statement> getStatements(){
        return new ArrayList<>(this.statements);
    }

    public Expression getExpression(){
        return this.expression;
    }
}

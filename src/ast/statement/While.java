package ast.statement;

import ast.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class While   extends AbstractStatement{

    private List<Statement> statements;
    private List<Expression> expressions;


    public While(int line, int column) {
        super(line, column);
    }

    public List<Statement> getStatements(){
        return new ArrayList<>(this.statements);
    }

    public List<Expression> getExpressions(){
        return new ArrayList<>(this.expressions);
    }
}

package ast.statement;

import ast.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class If   extends AbstractStatement
{
    private List<Statement> whenTrue;
    private List<Statement> whenFalse;

    private Expression condition;

    public If(int line, int column, Expression condition) {

        super(line, column);
        this.condition = condition;
        this.whenFalse = new ArrayList<>();
        this.whenTrue = new ArrayList<>();
    }

    public void addAllStatementsTrue(List<Statement> stmns){
        this.whenTrue.addAll(stmns);
    }

    public void addAllStatementsFalse(List<Statement> stmns){
        this.whenFalse.addAll(stmns);
    }

    public void addStatementTrue(Statement stmn){
        this.whenFalse.add(stmn);
    }

    public void addStatementFalse(Statement stmn){
        this.whenFalse.add(stmn);
    }

}

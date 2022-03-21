package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

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
        return this.statements;
    }

    public Expression getExpression(){
        return this.expression;
    }

    @Override
    public String toString(){

        String str = "While - Condition Expression: "
                + this.expression.toString()
                + " - Statements: ";

        for(Statement s : statements){
            str += "\n" + s.toString();
        }

        return str;

    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}

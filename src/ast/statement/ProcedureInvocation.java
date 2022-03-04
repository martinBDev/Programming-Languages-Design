package ast.statement;

import ast.expression.Expression;
import ast.expression.Variable;

import java.util.ArrayList;
import java.util.List;

public class ProcedureInvocation extends AbstractStatement {


    private List<Expression> expressions;
    private Variable name;

    public ProcedureInvocation(int line, int column, Variable name) {
        super(line, column);
        this.expressions = new ArrayList<Expression>();
        this.name = name;
    }

    public void addExpression(Expression expr){
        this.expressions.add(expr);
    }

    public List<Expression> getExpressions(){
        return new ArrayList<>(this.expressions);
    }

    public Variable getName(){
        return this.name;
    }


}

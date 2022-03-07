package ast.expression;

import ast.statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation   extends AbstractExpression implements Statement{

    private List<Expression> expressions;
    private Variable name;

    public FunctionInvocation(int line, int column, Variable name) {
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

    @Override
    public String toString(){

        String str =  "Function Invocation: "
                + " - Variable: "
                + this.name.toString()
                + " - Expressions: ";

        for(Expression x : expressions){
            str += "\n" + x.toString();
        }

        return str;
    }
}

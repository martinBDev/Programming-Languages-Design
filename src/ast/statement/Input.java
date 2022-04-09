package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Input   extends AbstractStatement {
    private List<Expression> expressions;

    public Input(int line, int column) {

        super(line, column);
        expressions = new ArrayList<>();
    }


    public void addExpression(Expression expression){
        this.expressions.add(expression);
    }

    public List<Expression> getExpressions(){
        return this.expressions;
    }

    @Override
    public String toString(){

        String str = "Input: "
                + " - Expressions: ";


        for(Expression x : expressions){
            str += "\n\t" + x.toString();
        }


        return str;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }
}

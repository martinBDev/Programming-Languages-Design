package ast.statement;

import ast.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class Print   extends AbstractStatement{

    private List<Expression> expressions;

    public Print(int line, int column) {

        super(line, column);
        this.expressions = new ArrayList<>();
    }




    public void addExpression(Expression expression){
        this.expressions.add(expression);
    }

    public List<Expression> getExpressions(){
        return new ArrayList<>(this.expressions);
    }

}

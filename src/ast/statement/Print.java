package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

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
        return this.expressions;
    }

    @Override
    public String toString(){
        String str = "Print: - Expressions: ";
        for(Expression x : expressions){

            str += "\n"+x.toString();

        }


        return str;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }

}

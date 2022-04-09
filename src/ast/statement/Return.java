package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

public class Return extends AbstractStatement  {

    private Expression exprToReturn;

    public Return(int line, int column,Expression expression) {

        super(line, column);
        this.exprToReturn  = expression;
    }

    public Expression getExprToReturn(){
        return this.exprToReturn;
    }

    @Override
    public String toString(){
        return  "Return: - Expression to return: "
                + this.exprToReturn.toString();

    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }

}

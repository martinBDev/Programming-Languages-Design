package ast.statement;

import ast.expression.Expression;

public class Return extends AbstractStatement implements Expression {

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
}

package ast.statement;

import ast.expression.Expression;

public class Return extends AbstractStatement implements Expression {

    private Expression exprToReturn;

    public Return(int line, int column) {
        super(line, column);
    }

    public Expression getExprToReturn(){
        return this.exprToReturn;
    }
}

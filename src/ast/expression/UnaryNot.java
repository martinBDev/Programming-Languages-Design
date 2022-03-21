package ast.expression;

import visitor.Visitor;

public class UnaryNot extends AbstractExpression{

    private Expression expression;

    public UnaryNot(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString(){

        return "UnaryNot: "
                + " - Expression: "
                + this.expression.toString()
                ;

    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}

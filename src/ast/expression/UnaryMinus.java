package ast.expression;

import visitor.Visitor;

public class UnaryMinus   extends AbstractExpression{

    private Expression expression;

    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }


    public Expression getExpression(){
        return this.expression;
    }

    @Override
    public String toString(){

        return "UnaryMinus: "
                + " - Expression: "
                + this.expression.toString()
                ;

    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }
}

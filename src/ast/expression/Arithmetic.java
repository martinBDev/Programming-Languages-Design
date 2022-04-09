package ast.expression;

import visitor.Visitor;

public class Arithmetic extends AbstractExpression {

    private String operator;
    private Expression firstExpression;
    private Expression secondExpression;

    public Arithmetic(int line, int column,Expression firstExpression, String operator, Expression secondExpression) {
        super(line, column);
        this.operator = operator;
        this.secondExpression = secondExpression;
        this.firstExpression = firstExpression;
    }

    public Expression getLeft(){
        return this.firstExpression;
    }

    public Expression getRight(){
        return this.secondExpression;
    }

    @Override
    public String toString(){

        return "Arithmetic: " + firstExpression.toString()
                + this.operator
                + secondExpression.toString();

    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }
}

package ast.expression;

import visitor.Visitor;

public class DoubleLiteral extends AbstractExpression {
    public DoubleLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    private Double value;


    public Double getValue(){
        return this.value;
    }

    @Override
    public String toString(){

        return "DoubleLiteral: "
                + " - Value: "
                + this.value;

    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}

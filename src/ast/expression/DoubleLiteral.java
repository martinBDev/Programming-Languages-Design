package ast.expression;

public class DoubleLiteral extends AbstractExpression {
    public DoubleLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    private Double value;


    public Double getValue(){
        return this.value;
    }
}

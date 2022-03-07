package ast.expression;

public class IntLiteral   extends AbstractExpression {
    public IntLiteral(int line, int column,int value) {
        super(line, column);
        this.value = value;
    }

    private int value;

    public int getValue(){
        return this.value;
    }

    @Override
    public String toString(){

        return "IntLiteral: "
                + " - Value: "
                + this.value;

    }

}

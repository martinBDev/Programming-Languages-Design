package ast.expression;

public abstract class AbstractExpression implements Expression{

    private int line;
    private int column;

    public AbstractExpression(int line, int column){

        this.line = line;
        this.column = column;

    }


    @Override
    public int getLine() {
        return this.line;
    }

    @Override
    public int getColumn() {
        return this.line;
    }
}

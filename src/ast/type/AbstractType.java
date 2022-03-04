package ast.type;

public class AbstractType implements Type{


    private int line;
    private int column;

    public AbstractType(int line, int column){

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
package ast.type;

public class Array extends AbstractType{

    private int size;
    private Type type;

    public Array(int line, int column, int size, Type type) {

        super(line, column);
        this.size = size;
        this.type = type;
    }

    public int getSize(){
        return this.size;
    }

    public Type getType(){
        return this.type;
    }
}

package ast.type;

import visitor.Visitor;

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

    @Override
    public String toString(){
        return "Array \n- Size: " + this.size + " \n- Type: " + this.type;
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

}

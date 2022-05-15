package ast.type;

import ast.node.AstNode;
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
        return "Array - Size: " + this.size + " - Type: [" + this.type + "]";
    }


    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public String typeName() {
        return "[Array of ]" + type.typeName();
    }

    //a[b]
    @Override
    public Type squareBrackets(Type ofIndexB, AstNode node){

        if(ofIndexB.isErrorType()){
            return ofIndexB;
        }

        if(ofIndexB.equals(Integer.getInstance())){
            return this.type;
        }

        return new ErrorType(this.getLine(),this.getColumn()
                ,"Square access not allowed, only integers allowed inside brackets.");

    }



    @Override
    public int numberOfBytes(){
        return type.numberOfBytes() * size;
    }



}

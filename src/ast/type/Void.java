package ast.type;

import ast.node.AstNode;
import visitor.Visitor;

public class Void extends AbstractType{

    private static Void instance;
    private Void(int line, int column) {
        super(line, column);
    }



    public static Void getInstance(){
        if(instance == null) instance = new Void(0,0);

        return instance;
    }

    @Override
    public String toString(){
        return "Void";
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public String typeName() {
        return "Void";
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public Type promotesTo(Type otherType, AstNode node){
        if(otherType.equals(Void.getInstance())){
            return this;
        }

        if(otherType.isErrorType()){
            return otherType;
        }

        return new ErrorType(node.getLine(),node.getColumn()
                , "Void cannot promote to " +otherType.typeName());
    }

}

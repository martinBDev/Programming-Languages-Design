package ast.type;

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
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }


}

package ast.type;

import visitor.Visitor;

public class Char extends AbstractType{

    private static Char instance = null;

    public static Char getInstance(){
        if(instance == null){
            instance = new Char(0,0);
        }

        return instance;
    }

    private Char(int line, int column) {
        super(line, column);
    }


    @Override
    public String toString(){
        return "Char";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

}

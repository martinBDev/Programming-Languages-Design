package ast.type;

import visitor.Visitor;

public class Integer extends AbstractType{

    private static Integer instance = null;

    public static Integer getInstance(){
        if(instance == null){
            instance = new Integer(0,0);
        }
        return instance;
    }

    private Integer(int line, int column) {
        super(line, column);
    }


    @Override
    public String toString(){
        return "Integer";
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}

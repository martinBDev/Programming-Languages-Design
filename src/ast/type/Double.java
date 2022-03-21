package ast.type;

import visitor.Visitor;

public class Double extends AbstractType{

    private static Double instance = null;

    public static Double getInstance(){
        if(instance == null){
            instance = new Double(0,0);
        }
        return instance;
    }

    private Double(int line, int column) {
        super(line, column);
    }


    @Override
    public String toString(){
    return "Double";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

}

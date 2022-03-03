package ast.type;

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
}

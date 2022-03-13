package ast.type;

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

}

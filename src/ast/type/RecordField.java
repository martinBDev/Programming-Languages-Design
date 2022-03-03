package ast.type;

public class RecordField {

    private String name;
    private Type type;

    public RecordField(String name,Type type){
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }

    public Type getType(){
        return this.type;
    }
}

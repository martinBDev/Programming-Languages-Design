package ast.definition;

import ast.type.Type;

public abstract class AbstractDefinition implements Definition{

    private int line;
    private int column;
    private String name;
    private Type type;



    public AbstractDefinition(int line, int column, String name, Type type){
        this.line = line;
        this.column = column;
        this.name = name;
        this.type = type;
    }


    public void setType(Type type){
        this.type = type;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public Type getType(){
        return this.type;
    }

    @Override
    public int getLine(){
        return this.line;
    }
    @Override
    public int getColumn(){
        return this.column;
    }


}

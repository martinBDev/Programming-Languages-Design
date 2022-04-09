package ast.expression;

import ast.definition.Definition;
import visitor.Visitor;

public class Variable   extends AbstractExpression {
    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public Variable(int line, int column,
                    String name, Definition definition) {
        super(line, column);
        this.name = name;
        this.definition = definition;
    }

    private String name;

    private Definition definition;

    public String getName(){
        return this.name;
    }

    public void setDefinition(Definition def){
        this.definition = def;
    }

    public Definition getDefinition(){
        return this.definition;
    }

    @Override
    public String toString(){

        return "Variable: "
                + " - Name: "
                + this.name
                ;

    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }

}

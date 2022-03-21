package ast;

import ast.definition.Definition;
import ast.definition.VariableDefinition;
import ast.node.AstNode;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Program implements AstNode {

    private int line;
    private int column;


    private List<Definition> definitions;

    public Program(int line, int column) {
        this.line = line;
        this.column = column;
        this.definitions = new ArrayList<>();

    }

    public void addDefinition(Definition definition){
        this.definitions.add(definition);
    }

    public void addAllVariableDefinitions(List<VariableDefinition> defs){
        this.definitions.addAll(defs);
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }

    public List<Definition> getDefinitions(){
        return this.definitions;
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }


    @Override
    public String toString(){
        String st = "";
        for(Definition df : definitions){
            st += "\n - " + df.toString();
        }
        return  st;
    }

}

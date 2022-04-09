package ast.type;

import ast.definition.VariableDefinition;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType{
    private Type returningType;
    private List<VariableDefinition> params;

    public FunctionType(int line, int column,Type returningType ,  List<VariableDefinition> params) {
        super(line, column);
        this.returningType = returningType;
        this.params = params;
    }


    public List<VariableDefinition> getParams(){
        return this.params;
    }

    public Type getReturningType(){
        return this.returningType;
    }


    @Override
    public String toString(){
        String st =  "FunctionType: - Returning Type: " + this.returningType +
                " - Parameters: ";

        for(VariableDefinition vars : params){
            st += vars.toString() + ",";
        }


        return st;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }

}

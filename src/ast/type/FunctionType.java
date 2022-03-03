package ast.type;

import ast.definition.VariableDefinition;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType{
    private Type returningType;
    private List<VariableDefinition> variablesDefs;

    public FunctionType(int line, int column,Type returningType ,  List<VariableDefinition> variablesDefs) {
        super(line, column);
        this.returningType = returningType;
        this.variablesDefs = variablesDefs;
    }


    public List<VariableDefinition> getVariablesDefs(){
        return new ArrayList<>(this.variablesDefs);
    }

    public Type getReturningType(){
        return this.returningType;
    }



}

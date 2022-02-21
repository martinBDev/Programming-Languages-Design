package ast.type;

import ast.definition.VariableDefinition;
import ast.node.AstNodeImpl;

import java.util.List;

public class FunctionType extends AstNodeImpl implements Type{
    private Type returningType;
    private List<VariableDefinition> variablesDefs;

    public FunctionType(int line, int column) {
        super(line, column);
    }
}

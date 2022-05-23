package ast.definition;

import ast.expression.Expression;
import ast.type.Type;
import visitor.Visitor;

public class VariableDefinitionAssignment extends VariableDefinition{

    private Expression valueAssigned = null;

    public VariableDefinitionAssignment(int line, int column, String name, Type type, Expression valueAssigned) {
        super(line, column, name, type);
        this.valueAssigned = valueAssigned;
    }

    public Expression getValueAssigned(){
        return this.valueAssigned;
    }

    public void setValueAssigned(Expression valueAssigned){
        this.valueAssigned = valueAssigned;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }
}

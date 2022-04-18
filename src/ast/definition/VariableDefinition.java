package ast.definition;

import ast.statement.Statement;
import ast.type.Type;
import visitor.Visitor;

public class VariableDefinition extends AbstractDefinition implements Statement {


    private int scope;
    private int offset;

    public VariableDefinition(int line, int column, String name, Type type) {

        super(line, column,name,type);
    }


    public int getOffset(){
        return this.offset;
    }

    public void setOffset(int offset){
        this.offset = offset;
    }

    @Override
    public String toString(){
        return "Variable Definition - Type: "
                + super.getType().toString()
                + " - Name: "
                + super.getName();

    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }


    @Override
    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {
this.scope = scope;
    }
}

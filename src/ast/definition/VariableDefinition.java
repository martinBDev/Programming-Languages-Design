package ast.definition;

import ast.node.AstNodeImpl;
import ast.statement.Statement;
import ast.type.Type;

public class VariableDefinition extends AstNodeImpl implements Definition, Statement {


    private String name;
    private Type type;

    public VariableDefinition(int line, int column) {
        super(line, column);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Type getType() {
        return this.type;
    }
}

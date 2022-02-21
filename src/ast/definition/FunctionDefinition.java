package ast.definition;

import ast.node.AstNodeImpl;
import ast.statement.Statement;
import ast.type.Type;

import java.util.List;

public class FunctionDefinition extends AstNodeImpl implements Definition{


    private List<Statement> statements;
    private String name;
    private Type type;

    public FunctionDefinition(int line, int column) {
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

package ast.definition;

import ast.statement.Statement;
import ast.type.Type;

public class VariableDefinition extends AbstractDefinition implements Statement {



    public VariableDefinition(int line, int column, String name, Type type) {

        super(line, column,name,type);
    }




}

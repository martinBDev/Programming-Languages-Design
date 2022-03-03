package ast.definition;

import ast.statement.Statement;
import ast.type.Type;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition{


    private List<Statement> statements;


    public FunctionDefinition(int line, int column, String name, Type type, List<Statement> statements) {

        super(line, column,name,type);
        this.statements = statements;
    }



    public List<Statement> getStatements(){
        return new ArrayList<>(this.statements);
    }
}

package ast.definition;

import ast.statement.Statement;
import ast.type.Type;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition{


    private List<Statement> statements;
    private List<VariableDefinition> variableDefinitions;


    public FunctionDefinition(int line, int column, String name, Type type) {

        super(line, column,name,type);
        this.statements = new ArrayList<>();
        this.variableDefinitions = new ArrayList<>();


    }


    public void addVariableDefinition(VariableDefinition var){

        this.variableDefinitions.add(var);

    }


    public void addAllVariableDefinitions(List<VariableDefinition> newVariableDefs){
        this.variableDefinitions.addAll(newVariableDefs);
    }

    public void addStatement(Statement statement){
        this.statements.add(statement);
    }

    public void addAllStatements(List<Statement> newStatements){
        this.statements.addAll(newStatements);
    }

    public List<Statement> getStatements(){
        return new ArrayList<>(this.statements);
    }
}

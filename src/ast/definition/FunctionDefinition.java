package ast.definition;

import ast.expression.Expression;
import ast.statement.Statement;
import ast.type.Type;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition{


    private List<Statement> statements;
    private List<VariableDefinition> variableDefinitions;

    private int scope;


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
        return this.statements;
    }

    public List<VariableDefinition>  getVariableDefinitions(){
        return this.variableDefinitions;
    }

    @Override
    public String toString(){
        String str =  "Function Definition - Type: "
                + super.getType().toString() + " - Name: "
                + super.getName()
                + ":\n\t-Variable Definition:";

        for(VariableDefinition v : variableDefinitions){
            str += "\n\t\t" + v.toString();
        }

        str += "\n\t-Statement:";
        for(Statement s : statements){
            str += "\n\t\t" + s.toString();
        }


        return str;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public int getScope() {
        return this.scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope = scope;
    }
}

package semantic;

import ast.definition.Definition;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.FunctionInvocation;
import ast.expression.Variable;
import ast.statement.Statement;
import ast.type.ErrorType;
import errorhandler.EH;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Object,Object> {

    private SymbolTable table = new SymbolTable();


    @Override
    public Object visit(VariableDefinition vd, Object param){

       if(!table.insert(vd)){
           EH.getEH().addError(new ErrorType(vd.getLine(),vd.getColumn(),
                   "Error in definition of '"
                           + vd.getName()
                           + "' in scope " + vd.getScope()));
       }
        return null;
    }

    @Override
    public Object visit(Variable vd, Object param){

        vd.setDefinition(table.find(vd.getName()));
        return null;
    }

    @Override
    public Object visit(FunctionDefinition fd, Object param){


        table.set();

        for(Definition def : fd.getVariableDefinitions()){
            def.accept(this,param);
        }

        for(Statement st : fd.getStatements()){
            st.accept(this,param);
        }


        table.reset();
        return null;
    }



}

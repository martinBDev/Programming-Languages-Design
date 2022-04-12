package semantic;

import ast.definition.Definition;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.FunctionInvocation;
import ast.expression.Variable;
import ast.statement.Statement;
import ast.type.ErrorType;
import ast.type.FunctionType;
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

        Definition def = table.find(vd.getName());
        //If variable not defined, assigned to it a vardefinition of type ERROR
        if(def == null){

            ErrorType error = new ErrorType(vd.getLine(),
                                            vd.getColumn(),
                                            "Error: variable " + vd.getName() + " has not been defined.");
            vd.setDefinition(new VariableDefinition(vd.getLine(),vd.getColumn(),vd.getName(),error));
        }else{
            vd.setDefinition(def);
        }


        return null;
    }


    @Override
    public Object visit(FunctionInvocation fi, Object param){

        Definition def = table.find(fi.getName().getName());
        //If function not defined, assigned to it a funcdefinition of type ERROR
        if(def == null){

            ErrorType error = new ErrorType(fi.getLine(),
                    fi.getColumn(),
                    "Error: function " + fi.getName() + " has not been defined.");
            fi.setDefinition(new FunctionDefinition(fi.getLine(),fi.getColumn(),fi.getName().getName(),error));
        }else{
            fi.setDefinition(def);
        }


        return null;

    }

    @Override
    public Object visit(FunctionDefinition fd, Object param){


        table.set();

        fd.getType().accept(this,param);

        for(Definition def : fd.getVariableDefinitions()){
            def.accept(this,param);
        }

        for(Statement st : fd.getStatements()){
            st.accept(this,param);
        }


        table.reset();
        return null;
    }

    @Override
    public Object visit(FunctionType ft, Object param){

        ft.getReturningType().accept(this,param);
        ft.getParams().stream().forEach((VariableDefinition vd)->{vd.accept(this,param);});

        return null;
    }


}

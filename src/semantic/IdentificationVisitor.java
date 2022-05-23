package semantic;

import ast.definition.Definition;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.definition.VariableDefinitionAssignment;
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
           new ErrorType(vd.getLine(),vd.getColumn(),
                   "Error in definition of '"
                           + vd.getName()
                           + "' in scope " + vd.getScope()+ ". Variable already defined.");
       }
        return null;
    }

    //TODO
    //Same behaviour as VariableDefinition, but we need to visit
    //the expression too, because it can be a call to a function
    //not defined yet, or another variable...
    @Override
    public Object visit(VariableDefinitionAssignment va, Object param){

        if(!table.insert(va)){
            new ErrorType(va.getLine(),va.getColumn(),
                    "Error in definition of '"
                            + va.getName()
                            + "' in scope " + va.getScope()+ ". Variable already defined.");
        }
        va.getValueAssigned().accept(this,param);
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

        fi.getExpressions().stream().forEach(expression -> {expression.accept(this,param);});


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

        if(!table.insert(fd)){
            new ErrorType(fd.getLine(),fd.getColumn(),
                    "Error in definition of function '"
                            + fd.getName()
                            + "' in scope " + fd.getScope()+ ". Function already defined.");
        }


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

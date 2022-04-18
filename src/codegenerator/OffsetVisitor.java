package codegenerator;

import ast.definition.AbstractDefinition;
import ast.definition.VariableDefinition;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void, Object> {


    @Override
    public Void visit(VariableDefinition vd, Object param){

        if(vd.getScope() == 0){



        }else if(vd.getScope() == 1){



        }

        return null;
    }





}

package codegenerator;

import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.type.FunctionType;
import ast.type.RecordField;
import ast.type.Struct;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void, Object> {

    private int currentOffsetGlobals = 0;
    private int currentOffsetLocals = 0;

    @Override
    public Void visit(VariableDefinition vd, Object param){

        vd.getType().accept(this,param);
        if(vd.getScope() == 0){ //Global variables

            vd.setOffset(currentOffsetGlobals);
            currentOffsetGlobals += vd.getType().numberOfBytes();


        }else if(vd.getScope() == 1){ //Parameter or locals, but parameter's offset is calculated when visiting FUNTIONTYPE

            currentOffsetLocals -= vd.getType().numberOfBytes();
            vd.setOffset(currentOffsetLocals);


        }

        return null;
    }

    @Override
    public Void visit(FunctionDefinition fd, Object param){

       currentOffsetLocals = 0;
        super.visit(fd,param);
        fd.setBytesOfLocals(-currentOffsetLocals);
        currentOffsetGlobals = 0;
        return null;


    }

    @Override
    public Void visit(FunctionType ft, Object param){

        //prev BP and (IP+1) --> need 4 bytes; start adding from right to left: f(4,3,2,1)
        //offset of 1: 4 + itsSize; offset of 2: 4 + 1's size + its size....

        int offset = 4; //Starting with 4
        VariableDefinition currentParam = null;

        for(int i = ft.getParams().size() - 1 ; i < 0 ; i--){

            currentParam =  ft.getParams().get(i);
            currentParam.setOffset(offset);
            offset += currentParam.getType().numberOfBytes();

        }

        ft.setBytesOfParams(offset);


        return null;
    }

    @Override
    public Void visit(Struct struct, Object param){

        super.visit(struct,param);

        int offset = 0;

        for(RecordField currentField : struct.getFields()){


            currentField.setOffset(offset);
            offset += currentField.getType().numberOfBytes();

        }

        return null;
    }




}

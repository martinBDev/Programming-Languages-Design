package ast.type;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Struct extends AbstractType{

    private List<RecordField> fields;

    public Struct(int line, int column) {

        super(line, column);
        this.fields = new ArrayList<>();
    }


    public void addField(RecordField field){
        this.fields.add(field);
    }


    @Override
    public String toString(){
        String st = "Struct: - Fields: ";

        for(RecordField rf : fields){
            st += "\n - " + rf.toString();
        }
        return st;
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}

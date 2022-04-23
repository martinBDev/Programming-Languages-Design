package codegenerator;

import visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractCodeGeneratorVisitor<Void,Object> {

    private ValueCGVisitor value;
    private CodeGenerator cg;

    public ValueCGVisitor getValue() {
        return value;
    }

    public void setValue(ValueCGVisitor visitor){
        this.value = visitor;
    }

    public AddressCGVisitor(CodeGenerator cg){
        this.cg = cg;
    }
}

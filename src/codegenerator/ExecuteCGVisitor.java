package codegenerator;

import visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractVisitor<Void,Object> {

    private ValueCGVisitor value;
    private AddressCGVisitor address;
    private CodeGenerator cg;

    public ExecuteCGVisitor(CodeGenerator cg){

        this.cg = cg;
        this.value = new ValueCGVisitor();
        this.address = new AddressCGVisitor();

    }

}

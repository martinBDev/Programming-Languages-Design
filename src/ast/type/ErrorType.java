package ast.type;

import ast.node.AstNode;
import errorhandler.EH;
import visitor.Visitor;

public class ErrorType extends AbstractType{

    private String message;
    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        EH.getEH().addError(this);
    }

    public String toString(){
        return this.message
                + " - Line: " + this.getLine()
                + " - Column: " + this.getColumn();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public boolean isErrorType(){
        return true;
    }

    @Override
    public String typeName() {
        return "ErrorType";
    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {

        return this;
    }


    @Override
    public int numberOfBytes() {
        throw new IllegalStateException("Cannot get number of bytes of a ErrorType");

    }

}

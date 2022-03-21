package ast.type;

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
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}

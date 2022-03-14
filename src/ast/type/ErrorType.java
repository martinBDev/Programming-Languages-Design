package ast.type;

import errorhandler.EH;

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
}

package ast.type;

import ast.node.AstNode;
import visitor.Visitor;

public class BooleanType extends AbstractType{


    private static BooleanType instance = null;

    public static BooleanType getInstance(){
        if(instance == null){
            instance = new BooleanType(0,0);
        }
        return instance;
    }

    private BooleanType(int line, int column) {
        super(line, column);
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {

        return v.visit(this,param);
    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {

        if(otherType.equals(BooleanType.getInstance())){
            return this;
        }

        if(otherType.isErrorType()){
            return otherType;
        }

        return new ErrorType(node.getLine(),node.getColumn()
                , "Boolean cannot promote to " + otherType.typeName());
    }

    @Override
    public char suffix(){
        return 'i';
    }

    @Override
    public int numberOfBytes(){
        return 2;
    }

    @Override
    public Type unaryNegation(AstNode node){

        return BooleanType.getInstance();

    }

    @Override
    public boolean isLogical(){
        return  true;
    }

    @Override
    public boolean isBuiltIn(){
        return true;
    }

    @Override
    public Type logical(Type otherType, AstNode node){

        if(otherType instanceof ErrorType){
            return otherType;
        }

        if (otherType.isLogical()) {
            return BooleanType.getInstance();
        }

        return new ErrorType(node.getLine(),node.getColumn()
                ,"Cannot perform logical operation between logical and non-logical operands.");

    }

    @Override
    public String typeName() {
        return "Boolean";
    }
}

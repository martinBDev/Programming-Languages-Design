package ast.type;

import ast.node.AstNode;
import visitor.Visitor;

public class Double extends AbstractType{

    private static Double instance = null;

    public static Double getInstance(){
        if(instance == null){
            instance = new Double(0,0);
        }
        return instance;
    }

    private Double(int line, int column) {
        super(line, column);
    }


    @Override
    public String toString(){
    return "Double";
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public Type arithmetic(Type otherType, AstNode node){

        if(otherType.equals(Double.getInstance())){
            return Double.getInstance();
        }

        if(otherType instanceof ErrorType){
            return otherType;
        }

        return new ErrorType(node.getLine(), node.getColumn()
                , "Arithmetic operations only allowed between same built-in types: char, integer and double.");

    }

    @Override
    public Type unaryMinus(AstNode node){
        return Double.getInstance();
    }

    @Override
    public Type comparison(Type otherType, AstNode node){

        if(otherType.isErrorType()){
            return otherType;
        }

        if(otherType.equals(Double.getInstance())){
            return BooleanType.getInstance();
        }

        return new ErrorType(node.getLine(), node.getColumn()
                , "Cannot perform comparison between a double and something else different from a double.");
    }

    @Override
    public boolean isBuiltIn(){
        return true;
    }

    @Override
    public Type canBeCasted(Type otherType, AstNode node){


        if(otherType.isBuiltIn()){
            return otherType;
        }

        if(otherType.isErrorType()){
            return otherType;
        }

        return new ErrorType(node.getLine(), node.getColumn(),
                "Integer can only be casted to integer, char or double.");

    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {

        if(otherType.equals(Double.getInstance())){
            return this;
        }

        if(otherType.isErrorType()){
            return otherType;
        }


        return new ErrorType(node.getLine(),node.getColumn()
                , "Double cannot promote to " +otherType.typeName());
    }

    @Override
    public String typeName() {
        return "Double";
    }

    @Override
    public int numberOfBytes(){
        return 4;
    }

    @Override
    public char suffix(){
        return 'f';
    }

    @Override
    public String convertTo(Type type){
        if(type.equals(Integer.getInstance()) ){
            return "f2i";
        }else if(type.equals(Double.getInstance()) || type.equals(BooleanType.getInstance())){
            return "";
        }else if(type.equals(Char.getInstance())){
            return "f2i\ni2b";
        }

        throw new IllegalStateException("Double can only be converted to integer, you try to convert to: " + type.toString());

    }
}

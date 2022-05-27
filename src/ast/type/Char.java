package ast.type;

import ast.node.AstNode;
import visitor.Visitor;

public class Char extends AbstractType{

    private static Char instance = null;

    public static Char getInstance(){
        if(instance == null){
            instance = new Char(0,0);
        }

        return instance;
    }

    private Char(int line, int column) {
        super(line, column);
    }


    @Override
    public String toString(){
        return "Char";
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public Type arithmetic(Type otherType, AstNode node){

        if(otherType.equals(Char.getInstance())){
            return Integer.getInstance();
        }

        if(otherType instanceof ErrorType){
            return otherType;
        }

        return new ErrorType(node.getLine(), node.getColumn()
                , "Arithmetic operations only allowed between same built-in types: char, integer and double.");

    }

    @Override
    public Type unaryMinus(AstNode node){
        return Integer.getInstance();
    }

    @Override
    public Type comparison(Type otherType, AstNode node){

        if(otherType.isErrorType()){
            return otherType;
        }

        if(otherType.equals(Char.getInstance())){
            return BooleanType.getInstance();
        }

        return new ErrorType(node.getLine(), node.getColumn()
                , "Cannot perform comparison between a char and something else different from a char.");
    }

    @Override
    public boolean isBuiltIn(){
        return true;
    }

    @Override
    public Type canBeCasted(Type otherType, AstNode node){


        if(otherType.isErrorType()){
            return otherType;
        }

        if (otherType.isBuiltIn()) {
            return otherType;
        }

        /**
         * if(otherType.equals(Integer.getInstance())){
         *             return Integer.getInstance();
         *         }else if(otherType.equals(Char.getInstance())){
         *             return Char.getInstance();
         *         }
         */


        return new ErrorType(node.getLine(), node.getColumn(),
                "Char can only be casted to integer, char or double.");


    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {

        if(otherType.equals(Char.getInstance())){
            return this;
        }

        if(otherType.isErrorType()){
            return otherType;
        }

        return new ErrorType(node.getLine(),node.getColumn()
                , "Char cannot promote to " +otherType.typeName());
    }

    @Override
    public String typeName() {
        return "Char";
    }

    @Override
    public int numberOfBytes(){
        return 1;
    }

    @Override
    public char suffix(){
        return 'b';
    }

    @Override
    public String convertTo(Type type){
        if(type.equals(Integer.getInstance()) ){
            return "b2i";
        }else if(type.equals(Char.getInstance()) || type.equals(BooleanType.getInstance())){
            return "";
        }else if(type.equals(Double.getInstance())){
            return "b2i\ni2f";
        }

        throw new IllegalStateException("Char can only be converted to integer, you try to convert to: " + type.toString());

    }
}

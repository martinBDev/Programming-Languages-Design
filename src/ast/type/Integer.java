package ast.type;

import ast.node.AstNode;
import visitor.Visitor;

public class Integer extends AbstractType{

    private static Integer instance = null;

    public static Integer getInstance(){
        if(instance == null){
            instance = new Integer(0,0);
        }
        return instance;
    }

    private Integer(int line, int column) {
        super(line, column);
    }


    @Override
    public String toString(){
        return "Integer";
    }


    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public boolean isLogical(){
        return  true;
    }

    @Override
    public Type arithmetic(Type otherType, AstNode node){

        if(otherType instanceof ErrorType){
            return otherType;
        }

        if(otherType.equals(Integer.getInstance())){
            return Integer.getInstance();
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

        if(otherType.equals(Integer.getInstance())){
            return Integer.getInstance();
        }

        return new ErrorType(node.getLine(), node.getColumn()
                , "Cannot perform comparison between an Integer and something else different from an Integer.");
    }

    @Override
    public Type logical(Type otherType, AstNode node){

        if(otherType instanceof ErrorType){
            return otherType;
        }

        if (otherType.isLogical()) {
            return Integer.getInstance();
        }

        return new ErrorType(node.getLine(),node.getColumn()
                ,"Cannot perform logical operation between logical and non-logical operands.");

    }

    @Override
    public Type unaryNegation(AstNode node){

        return Integer.getInstance();

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
        if(otherType.isBuiltIn()){
            return otherType;
        }

        return new ErrorType(node.getLine(), node.getColumn(),
                "Integer can only be casted to integer, char or double.");

    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {

        if(otherType.equals(Integer.getInstance())){
            return this;
        }

        if(otherType.isErrorType()){
            return otherType;
        }

        return new ErrorType(node.getLine(),node.getColumn()
                , "Integer cannot promote to " + otherType.typeName());
    }

    @Override
    public String typeName() {
        return "Integer";
    }

}

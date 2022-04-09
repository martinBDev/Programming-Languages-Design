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
            return Double.getInstance();
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

        if(otherType.isErrorType()){
            return otherType;
        }

        if(!otherType.isBuiltIn()){
            return new ErrorType(node.getLine(), node.getColumn(),
                    "Casts can only be performed from a type to built-in types.");
        }

        if(otherType.equals(Integer.getInstance())){
            return Integer.getInstance();
        }

        return new ErrorType(node.getLine(), node.getColumn(),
                "Double can only be casted to integer.");


    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {

        if(otherType.equals(Double.getInstance())){
            return this;
        }

        return new ErrorType(node.getLine(),node.getColumn()
                , "Cannot promote to Double type.");
    }

}

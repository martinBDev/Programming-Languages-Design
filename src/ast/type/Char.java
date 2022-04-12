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
            return Integer.getInstance();
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

        super.canBeCasted(otherType,node);

        if(otherType.equals(Integer.getInstance())){
            return Integer.getInstance();
        }else if(otherType.equals(Char.getInstance())){
            return Char.getInstance();
        }

        return new ErrorType(node.getLine(), node.getColumn(),
                "Char can only be casted to integer.");


    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {

        if(otherType.equals(Char.getInstance())){
            return this;
        }

        return new ErrorType(node.getLine(),node.getColumn()
                , "Char cannot promote to " +otherType.typeName());
    }

    @Override
    public String typeName() {
        return "Char";
    }
}

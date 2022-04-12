package ast.type;


import ast.node.AstNode;
import errorhandler.EH;

import java.util.List;

public  abstract class AbstractType implements Type{


    private int line;
    private int column;


    public AbstractType(int line, int column){

        this.line = line;
        this.column = column;

    }

    @Override
    public boolean isErrorType(){
        return false;
    }

    @Override
    public int getLine() {
        return this.line;
    }

    @Override
    public int getColumn() {
        return this.line;
    }


    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public Type arithmetic(Type otherType, AstNode node) {

         

        return new ErrorType(node.getLine(),node.getColumn()
                , "Cannot perform arithmetic operation.");
    }

    @Override
    public Type unaryMinus(AstNode node) {

        return new ErrorType(node.getLine(),node.getColumn()
                , "Cannot perform unary minus in something different from a unary minus expression ");
    }

    @Override
    public Type comparison(Type otherType, AstNode node) {
         
        return new ErrorType(node.getLine(),node.getColumn()
                , "Cannot perform comparison with this type, " +
                "only allowed between chars, between doubles and between integers.");
    }

    @Override
    public Type logical(Type otherType, AstNode node) {
         
        return new ErrorType(node.getLine(),node.getColumn()
                , "Cannot perform logical operation here.");
    }

    @Override
    public Type unaryNegation( AstNode node) {


        return new ErrorType(node.getLine(),node.getColumn()
                , "Can only perform unary negation on logical type: integer");

    }

    @Override
    public Type dot(String fieldName, AstNode node) {
        return new ErrorType(node.getLine(),node.getColumn()
                , "Field access can only be done with structs");
    }

    @Override
    public Type squareBrackets(Type ofIndexB) {

        if(ofIndexB instanceof ErrorType){
            return ofIndexB;
        }

        return new ErrorType(0,0
                , "Square brackets are only for accessing an array");
    }

    @Override
    public boolean isBuiltIn() {
        return false;
    }

    @Override
    public Type canBeCasted(Type otherType, AstNode node) {

        if(otherType.isErrorType()){
            return otherType;
        }

        if(!otherType.isBuiltIn()){
            return new ErrorType(node.getLine(), node.getColumn(),
                    "Casts can only be performed from a type to built-in types.");
        }
        
        return new ErrorType(node.getLine(),node.getColumn()
                , "Cannot invoke cast in something different from a cast");
    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {


         
        return new ErrorType(node.getLine(),node.getColumn()
                , "Cannot invoke promote in something different from an assignment");
    }

    @Override
    public Type parenthesis(List<Type> passedAsParams, AstNode node) {


        return new ErrorType(node.getLine(),node.getColumn(),
                "Cannot invoke parenthesis in something different from a function");
    }

}

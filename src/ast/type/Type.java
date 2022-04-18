package ast.type;

import ast.node.AstNode;

import java.util.List;

public interface Type extends AstNode {

    String typeName();


    /**
     * False always except for integer
     * @return
     */
    boolean isLogical();

    /**
     * Parameter otherType is otherType of right part of operation
     * a + b ----> a.arithmetic(b.otherType,a)
     * @param otherType
     * @param node To get line and column of node cooling method
     * @return
     */
    Type arithmetic(Type otherType, AstNode node);

    /**
     * Does not need otherType param because the otherType is the one calling unaryminus(...)
     * -3; -'a';
     * @param node To get line and column of node cooling method
     * @return
     */
    Type unaryMinus(AstNode node);


    /**
     * 3.4 > 2.0;
     * @param otherType of operand on right
     * @param node
     * @return
     */
    Type comparison(Type otherType, AstNode node);

    /**
     * a || b
     * Both have to be integer (isLogical())
     * @param otherType
     * @return
     */
    Type logical(Type otherType, AstNode node);


    /**
     * !a
     *   ^|
     * a | must be logical ( isLogical() )
     * @param node
     * @return
     */
    Type unaryNegation(AstNode node);


    /**
     * struct.field --> if field found: return field's type, Error otherwise
     * @param fieldName
     * @param node
     * @return field's type if it exists, Error if not
     */
    Type dot(String fieldName, AstNode node);


    /**
     * a[b] ----
     *         |
     * @param ofIndexB type of what is inside the brackets (type of index B)
     * @return TYPE OF THE ARRAY
     */
    Type squareBrackets(Type ofIndexB, AstNode node);


    /**
     *
     * @return true if it's a built-in type: char, integer, double
     */
    boolean isBuiltIn();

    /**
     * (int) 'a';
     * @param otherType type of WHAT you want to obtain after cast --> int in example
     * @param node
     * @return type OF THE CASTED --> 'a' in example
     */
    Type canBeCasted(Type otherType, AstNode node);


    /**
     * a = b --> if b's type promotes to a's type :
     * b.type.promotesTo(a.type)
     * @param otherType
     * @param node
     * @return
     */
    Type promotesTo(Type otherType, AstNode node);


    /**
     * Checks that all types in the list can promote to types in function definition:
     * def f(a: int, b:double)
     *
     * f(2, 4.5) --> check that type of each argument can promote to corresponding parameter
     * @param passedAsParams
     * @return type of the function???
     */
    Type parenthesis( List<Type> passedAsParams, AstNode node);


    /**
     *
     * @return true if Instance of type is ErrorType, false otherwise
     */
    boolean isErrorType();


    /**
     * Return number of bytes of type itself
     */
    int numberOfBytes();

}

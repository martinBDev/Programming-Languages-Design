package codegenerator;

import ast.expression.*;
import ast.statement.Input;
import ast.type.*;
import ast.type.Double;
import ast.type.Integer;
import ast.type.Void;
import visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractCodeGeneratorVisitor<Void,Object> {

    private AddressCGVisitor address;
    private CodeGenerator cg;

    public ValueCGVisitor(CodeGenerator cg){
        this.cg = cg;
    }

    public AddressCGVisitor getAddress() {
        return address;
    }

    public void setAddress(AddressCGVisitor visitor){
        this.address = visitor;
    }


    /**
     * value[[Arithmetic : exp1 --> exp2 (+|-|/|*) exp3 ]]() =
     *        value[[exp2]]
     *        <>exp2.type.convertTo( exp1.type )
     *        value[[exp3]]
     *        <>exp3.type.convertTo( exp1.type )
     *        switch(operand){
     *            case '+': <add> exp1.type.suffix(); break;
     *            case '-': <sub> exp1.type.suffix(); break;
     *            case '/': <mul> exp1.type.suffix(); break;
     *            case '*': <div> exp1.type.suffix(); break;
     *        }
     *
     *
     * @param arithmetic
     * @param param
     * @return
     */
    @Override
    public Void visit(Arithmetic arithmetic, Object param){



        arithmetic.getLeft().accept(this,param);
        cg.writeConvertion( arithmetic.getLeft().getType().convertTo( arithmetic.getType() ));

        arithmetic.getRight().accept(this,param);
        cg.writeConvertion( arithmetic.getRight().getType().convertTo( arithmetic.getType() ));

        cg.writeArithmetic(arithmetic.getOperator(), arithmetic.getType());



        return null;
    }


    /**
     * value[[DoubleLiteral : expression --> DOUBLE_CONSTANT]]() =
     *          <pushf > DOUBLE_CONSTANT
     * @param dob
     * @param param
     * @return
     */
    @Override
    public Void visit(DoubleLiteral dob, Object param){


        cg.push(dob.getValue());

        return null;
    }


    /**
     * value[[CharLiteral : expression --> CHARACTER]]() =
     *          <pushb > CHARACTER
     * @param c
     * @param param
     * @return
     */
    @Override
    public Void visit(CharLiteral c, Object param){


        cg.push(c.getValue());

        return null;
    }


    /**
     * value[[IntLiteral : expression --> INT_CONSTANT]]() =
     *          <pushi > INT_CONSTANT
     * @param i
     * @param param
     * @return
     */
    @Override
    public Void visit(IntLiteral i, Object param){


        cg.push(i.getValue());

        return null;
    }

    /** REMEMBER: depending on scope of variable, address will be
     * different, check AddressCGVisitor
     *
     * value[[Variable : expression --> ID]]() =
     *          address[[expression]]
     *          <load> expression.type.suffix()
     * @param v
     * @param param
     * @return
     */
    @Override
    public Void visit(Variable v, Object param){


        v.accept(this.address,param);
        cg.load(v.getType());

        return null;
    }


    /**
     *
     * value[[UnaryMinus : expression1 --> expression2]]() =
     *          <push> expression1.type.suffix() < 0>
     *          value[[expression2]]
     *          <sub> expression1.type.suffix()
     * @param u
     * @param param
     * @return
     */
    @Override
    public Void visit(UnaryMinus u, Object param){

        //I WILL PERFORm 0 - u.expression


        //for performing 0-exp:
        //pushi 0
        //pushi exp
        //subi
        cg.push(u.getType(), "0");

        u.getExpression().accept(this,param);


        cg.sub(u.getType());


        return null;
    }


    /**
     *
     * value[[Logical : exp1 --> exp2 exp3]]() =
     *          value[[exp2]]
     *          value[[exp3]]
     *          switch (exp1.getOperand()){
     *             case "&&": {<and> }
     *             case "||": {<or>}
     *         }
     *
     * @param l
     * @param param
     * @return
     */
    @Override
    public Void visit(Logical l, Object param){

        l.getLeftExpr().accept(this,param);
        l.getRightExpr().accept(this,param);

        switch (l.getOperand()){
            case "&&": {cg.and();break;}
            case "||": {cg.or();break;}
        }


        return null;
    }


    /**
     *
     * value[[ArrayAccess : exp1 --> exp2 exp3]]() =
     *          address[[ exp1 ]]
     *          <load > exp1.type.suffix()
     *
     * @param a
     * @param param
     * @return
     */
    @Override
    public Void visit(ArrayAccess a, Object param){

        a.accept(this.address,param);
        cg.load(a.getType());

        return null;
    }

    /**
     *
     * value[[Comparison : exp1 --> exp2 ('<'|'>'|'<='|'>='|'=='|'!=') exp3]]() =
     *          value[[exp2]]
     *          value[[exp3]]
     *          //We can assume exp2 and exp3 have the same type (and valid) --> typeChecking visitor
     *          switch(exp1.operand){
     *             case "<": {<lt> exp2.type.suffix();break;}
     *             case ">": {<gt> exp2.type.suffix();break;}
     *             case "<=": {<le> exp2.type.suffix(); break;}
     *             case ">=": {<ge> exp2.type.suffix(); break;}
     *             case "==": {<eq> exp2.type.suffix(); break;}
     *             case "!=": {<ne> exp2.type.suffix(); break;}
     *          }
     *
     * @param c
     * @param param
     * @return
     */
    @Override
    public Void visit(Comparison c, Object param){

        c.getLeftExpr().accept(this,param);
        c.getRightExpr().accept(this,param);

        cg.comparison(c.getOperand(),c.getLeftExpr().getType());

        return null;
    }


    /**
     *
     * value[[Cast : exp1 --> type exp2]]() =
     *          value[[exp2]]
     *          exp2.type.convertTo( type )
     *
     * @param c
     * @param param
     * @return
     */
    @Override
    public Void visit(Cast c, Object param){


        c.getExpression().accept(this,param);
        cg.writeConvertion( c.getExpression().getType().convertTo( c.getToTypeCast() ) );

        return null;
    }


    /**
     *
     * value[[UnaryNot : exp1 --> exp2]]() =
     *          value[[exp2]]
     *          <not>
     *
     * @param u
     * @param param
     * @return
     */
    @Override
    public Void visit(UnaryNot u, Object param){

        u.getExpression().accept(this,param);
        cg.not();

        return null;
    }


    /**
     *  1 - Memory address of the record is computed
     *  2 - Offset of the field is obtained
     *  3 - Field's address is the sum of previous values
     *
     * value[[FieldAccess : exp1 --> exp2 ID]]() =
     *          address[[exp1]]
     *          <load>exp1.type.suffix()
     *
     * @param fa
     * @param param
     * @return
     */
    @Override
    public Void visit(FieldAccess fa, Object param){

        fa.accept(this.address,param);
        Struct struct = (Struct) fa.getExpression().getType();
        cg.load(fa.getType());

        return null;
    }


    /**
     * value[[FunctionInvocation : exp1-> exp2 exp3*]]() =
     *         exp3*.forEach(expr -> value[[expr]])
     *         <call > ((Variable)exp2).getName()
     *
     * @param func
     * @param param
     * @return
     */
    @Override
    public Void visit(FunctionInvocation func, Object param){

       func.getExpressions().stream().forEach(exp -> {exp.accept(this,param);});
       cg.call(func.getName().getName());

        return null;
    }
}

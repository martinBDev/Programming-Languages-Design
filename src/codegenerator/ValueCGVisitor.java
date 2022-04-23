package codegenerator;

import ast.expression.*;
import ast.statement.Input;
import ast.type.Double;
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
     * execute[[Arithmetic : exp1 --> exp2 (+|-|/|*) exp3 ]]() =
     *        value[[exp2]]
     *        value[[exp3]]
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
        arithmetic.getRight().accept(this,param);

        switch (arithmetic.getOperator()){

            case "+": {cg.add(arithmetic.getType()); break;}
            case "-": {cg.sub(arithmetic.getType()); break;}
            case "/": {cg.div(arithmetic.getType()); break;}
            case "*": {cg.mul(arithmetic.getType()); break;}
        }

        return null;
    }


    /**
     * execute[[DoubleLiteral : expression --> DOUBLE_CONSTANT]]() =
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
     * execute[[CharLiteral : expression --> CHARACTER]]() =
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
     * execute[[CharLiteral : expression --> CHARACTER]]() =
     *          <pushi > INT_
     * @param i
     * @param param
     * @return
     */
    @Override
    public Void visit(IntLiteral i, Object param){

        cg.push(i.getValue());

        return null;
    }

}

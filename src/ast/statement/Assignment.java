package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

public class Assignment extends AbstractStatement{

    private Expression leftExpr;
    private Expression rightExpr;

    public Assignment(int line, int column, Expression leftExpr, Expression rightExpr) {

        super(line, column);
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }

    public Expression getLeftExpr(){
        return this.leftExpr;
    }

    public Expression getRightExpr(){
        return this.rightExpr;
    }

    @Override
    public String toString(){
        return "Assignment: "
                + " - Left Expression: "
                +this.leftExpr.toString()
                +" - Right Expression "
                +this.rightExpr.toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }


}

package ast.expression;

import ast.type.Type;
import visitor.Visitor;

public class Cast   extends AbstractExpression{

    private Type toTypeCast;
    private Expression expression;

    public Cast(int line, int column, Type toTypeCast, Expression expression) {

        super(line, column);
        this.toTypeCast = toTypeCast;
        this.expression = expression;
    }

    public Type getToTypeCast(){
        return this.toTypeCast;
    }

    public Expression getExpression(){
        return this.expression;
    }

    @Override
    public String toString(){

        return "Cast: - Type: "
                + this.toTypeCast.toString()
                + " - Expression: "
                + this.expression.toString();


    }


    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }
}

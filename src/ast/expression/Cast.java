package ast.expression;

import ast.type.Type;
import visitor.Visitor;

public class Cast   extends AbstractExpression{

    private Type type;
    private Expression expression;

    public Cast(int line, int column, Type type, Expression expression) {

        super(line, column);
        this.type = type;
        this.expression = expression;
    }

    public Type getType(){
        return this.type;
    }

    public Expression getExpression(){
        return this.expression;
    }

    @Override
    public String toString(){

        return "Cast: - Type: "
                + this.type.toString()
                + " - Expression: "
                + this.expression.toString();


    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}

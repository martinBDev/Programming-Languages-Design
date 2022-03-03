package ast.expression;

import ast.type.Type;

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
}

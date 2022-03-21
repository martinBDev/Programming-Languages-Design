package ast.expression;

import visitor.Visitor;

public class FieldAccess   extends AbstractExpression{

    private String fieldName;
    private Expression expression;

    public FieldAccess(int line, int column, Expression expression, String fieldName) {

        super(line, column);
        this.fieldName = fieldName;
        this.expression = expression;
    }


    public Expression getExpression(){
        return this.expression;
    }

    public String getFieldName(){
        return this.fieldName;
    }

    @Override
    public String toString(){

        return "FieldAccess: "
                + " - Field Name: "
                + this.fieldName
                + " - Expression: "
                + this.expression.toString();

    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}

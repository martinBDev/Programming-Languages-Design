package ast.expression;

import introspector.test.ast.Expresion;
import visitor.Visitor;

public class TernaryOperator extends AbstractExpression{

    private Expression condition;
    private Expression valueIfTrue;
    private Expression valueIfFalse;

    public TernaryOperator(int line, int column, Expression valueIfTrue, Expression condition, Expression valueIfFalse) {
        super(line, column);
        setCondition(condition);
        setValueIfFalse(valueIfFalse);
        setValueIfTrue(valueIfTrue);
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return  v.visit(this,param);
    }

    public void setCondition(Expression condition){
        this.condition = condition;
    }

    public void setValueIfTrue(Expression valueIfTrue){
        this.valueIfTrue = valueIfTrue;
    }

    public void setValueIfFalse(Expression valueIfFalse){
        this.valueIfFalse = valueIfFalse;
    }

    public Expression getCondition(){
        return this.condition;
    }

    public Expression getValueIfTrue(){
        return this.valueIfTrue;
    }

    public Expression getValueIfFalse(){
        return  this.valueIfFalse;
    }

}

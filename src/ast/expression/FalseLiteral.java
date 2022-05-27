package ast.expression;

import visitor.Visitor;

public class FalseLiteral extends AbstractExpression{

    public FalseLiteral(int line, int column) {
        super(line, column);
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }
}

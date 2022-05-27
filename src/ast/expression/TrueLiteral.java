package ast.expression;

import visitor.Visitor;

public class TrueLiteral extends AbstractExpression{

    public TrueLiteral(int line, int column) {
        super(line, column);
    }



    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
      return v.visit(this,param);
    }
}

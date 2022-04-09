package ast.expression;

import visitor.Visitor;

public class CharLiteral   extends AbstractExpression {

    private char value;

    public CharLiteral(int line, int column, char value) {

        super(line, column);
        this.value = value;
    }

    public char getValue(){
        return this.value;
    }

    @Override
    public String toString(){

        return "CharLiteral: "
                + this.value;

    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP param) {
        return v.visit(this,param);
    }
}

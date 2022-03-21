package ast.expression;

import visitor.Visitor;

public class Variable   extends AbstractExpression {
    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    private String name;

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){

        return "Variable: "
                + " - Name: "
                + this.name
                ;

    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

}

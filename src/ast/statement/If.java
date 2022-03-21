package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class If   extends AbstractStatement
{
    private List<Statement> whenTrue;
    private List<Statement> whenFalse;

    private Expression condition;

    public If(int line, int column, Expression condition) {

        super(line, column);
        this.condition = condition;
        this.whenFalse = new ArrayList<>();
        this.whenTrue = new ArrayList<>();
    }

    public List<Statement> getStatementsWhenTrue(){
        return this.whenTrue;
    }

    public List<Statement> getStatementsWhenFalse(){
        return this.whenFalse;
    }

    public Expression getCondition(){
        return this.condition;
    }

    public void addAllStatementsTrue(List<Statement> stmns){
        this.whenTrue.addAll(stmns);
    }

    public void addAllStatementsFalse(List<Statement> stmns){
        this.whenFalse.addAll(stmns);
    }

    public void addStatementTrue(Statement stmn){
        this.whenFalse.add(stmn);
    }

    public void addStatementFalse(Statement stmn){
        this.whenFalse.add(stmn);
    }


    @Override
    public String toString(){
        String str =  "If: "
                + " - Condition: "
                +this.condition.toString()
                +" - When Condition True: "
                ;


        for(Statement s : whenTrue) {
            str += "\n" + s.toString();
        }

        str += "\n" + " - When Condition False: ";
        for(Statement s : whenFalse) {
            str += "\n" + s.toString();
        }
        return str;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

}

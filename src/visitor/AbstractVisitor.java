package visitor;

import ast.Program;
import ast.definition.Definition;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import ast.type.Double;
import ast.type.Integer;
import ast.type.Void;

public class AbstractVisitor<TP,TR> implements  Visitor<TP,TR>{
    @Override
    public TR visit(Program p, TP param) {
        p.getDefinitions().stream().forEach((Definition d) -> {d.accept(this,param);});
        return null;
    }

    @Override
    public TR visit(Arithmetic a, TP param) {
        a.getLeft().accept(this,param);
        a.getRight().accept(this,param);
        return null;
    }

    @Override
    public TR visit(DoubleLiteral d, TP param) {
        return null;
    }

    @Override
    public TR visit(CharLiteral C, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionInvocation f, TP param) {
        f.getExpressions().stream().forEach((Expression e)->{e.accept(this,param);});
        f.getName().accept(this,param);
        return null;
    }

    @Override
    public TR visit(IntLiteral i, TP param) {
        return null;
    }

    @Override
    public TR visit(Variable v, TP param) {
        v.accept(this,param);
        return null;
    }

    @Override
    public TR visit(UnaryMinus u, TP param) {
        u.getExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Logical l, TP param) {
        l.getLeftExpr().accept(this,param);
        l.getRightExpr().accept(this,param);
        return null;
    }

    @Override
    public TR visit(ArrayAccess a, TP param) {
        a.getLeftExpr().accept(this,param);
        a.getRightExpr().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Comparison c, TP param) {
        c.getLeftExpr().accept(this,param);
        c.getRightExpr().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Cast c, TP param) {
        c.getType().accept(this,param);
        c.getExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(FieldAccess fa, TP param) {
        fa.getExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(UnaryNot u, TP param) {
        u.getExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Assignment a, TP param) {
        a.getLeftExpr().accept(this,param);
        a.getRightExpr().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Print p, TP param) {
        p.getExpressions().stream().forEach((Expression e)->{e.accept(this,param);});
        return null;
    }

    @Override
    public TR visit(Input i, TP param) {
        i.getExpressions().stream().forEach((Expression e)->{e.accept(this,param);});
        return null;
    }

    @Override
    public TR visit(While w, TP param) {
        w.getExpression().accept(this,param);
        w.getStatements().stream().forEach((Statement e)->{e.accept(this,param);});
        return null;
    }

    @Override
    public TR visit(Return r, TP param) {
        r.getExprToReturn().accept(this,param);
        return null;
    }

    @Override
    public TR visit(If i, TP param) {
        i.getCondition().accept(this,param);
        i.getStatementsWhenTrue().stream().forEach((Statement s)->{s.accept(this,param);});
        i.getStatementsWhenFalse().stream().forEach((Statement s)->{s.accept(this,param);});
        return null;
    }

    @Override
    public TR visit(VariableDefinition v, TP param) {
        v.getType().accept(this,param);
        return null;
    }

    @Override
    public TR visit(FunctionDefinition f, TP param) {

        return null;
    }

    @Override
    public TR visit(Array a, TP param) {
        return null;
    }

    @Override
    public TR visit(Integer i, TP param) {
        return null;
    }

    @Override
    public TR visit(Double d, TP param) {
        return null;
    }

    @Override
    public TR visit(Char c, TP param) {
        return null;
    }

    @Override
    public TR visit(Struct s, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionType ft, TP param) {
        return null;
    }

    @Override
    public TR visit(Void v, TP param) {
        return null;
    }

    @Override
    public TR visit(ErrorType e, TP param) {
        return null;
    }

    @Override
    public TR visit(RecordField rf, TP param) {
        return null;
    }
}

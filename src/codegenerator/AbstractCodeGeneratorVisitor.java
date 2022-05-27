package codegenerator;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import ast.type.Double;
import ast.type.Integer;
import ast.type.Void;
import visitor.Visitor;

public class AbstractCodeGeneratorVisitor<TR,TP> implements  Visitor<TR,TP> {
    @Override
    public TR visit(Program p, TP param) {
        throw new IllegalStateException("Cannot generate code for Program.");
    }

    @Override
    public TR visit(Arithmetic a, TP param) {
        throw new IllegalStateException("Cannot generate code for Arithmetic.");
    }

    @Override
    public TR visit(DoubleLiteral d, TP param) {
        throw new IllegalStateException("Cannot generate code for DoubleLiteral.");
    }

    @Override
    public TR visit(CharLiteral C, TP param) {
        throw new IllegalStateException("Cannot generate code for CharLiteral.");
    }

    @Override
    public TR visit(FunctionInvocation f, TP param) {
        throw new IllegalStateException("Cannot generate code for FunctionInvocation.");
    }

    @Override
    public TR visit(IntLiteral i, TP param) {
        throw new IllegalStateException("Cannot generate code for IntLiteral.");
    }

    @Override
    public TR visit(Variable v, TP param) {
        throw new IllegalStateException("Cannot generate code for Variable.");
    }

    @Override
    public TR visit(UnaryMinus u, TP param) {
        throw new IllegalStateException("Cannot generate code for UnaryMinus.");
    }

    @Override
    public TR visit(Logical l, TP param) {
        throw new IllegalStateException("Cannot generate code for Logical.");
    }

    @Override
    public TR visit(ArrayAccess a, TP param) {
        throw new IllegalStateException("Cannot generate code for ArrayAccess.");
    }

    @Override
    public TR visit(Comparison c, TP param) {
        throw new IllegalStateException("Cannot generate code for Comparison.");
    }

    @Override
    public TR visit(Cast c, TP param) {
        throw new IllegalStateException("Cannot generate code for Cast.");
    }

    @Override
    public TR visit(FieldAccess fa, TP param) {
        throw new IllegalStateException("Cannot generate code for FieldAccess.");
    }

    @Override
    public TR visit(UnaryNot u, TP param) {
        throw new IllegalStateException("Cannot generate code for UnaryNot.");
    }

    @Override
    public TR visit(TrueLiteral tl, TP param) {
        throw new IllegalStateException("Cannot generate code for trueLiteral.");
    }

    @Override
    public TR visit(FalseLiteral fl, TP param) {
        throw new IllegalStateException("Cannot generate code for FalseLiteral.");
    }

    @Override
    public TR visit(Assignment a, TP param) {
        throw new IllegalStateException("Cannot generate code for Assignment.");
    }

    @Override
    public TR visit(Print p, TP param) {
        throw new IllegalStateException("Cannot generate code for Print.");
    }

    @Override
    public TR visit(Input i, TP param) {
        throw new IllegalStateException("Cannot generate code for Input.");
    }

    @Override
    public TR visit(While w, TP param) {
        throw new IllegalStateException("Cannot generate code for While.");
    }

    @Override
    public TR visit(Return r, TP param) {
        throw new IllegalStateException("Cannot generate code for Return.");
    }

    @Override
    public TR visit(If i, TP param) {
        throw new IllegalStateException("Cannot generate code for If.");
    }

    @Override
    public TR visit(VariableDefinition v, TP param) {
        throw new IllegalStateException("Cannot generate code for VariableDefinition.");
    }

    @Override
    public TR visit(FunctionDefinition f, TP param) {
        throw new IllegalStateException("Cannot generate code for FunctionDefinition.");
    }

    @Override
    public TR visit(Array a, TP param) {
        throw new IllegalStateException("Cannot generate code for Array.");
    }

    @Override
    public TR visit(Integer i, TP param) {
        throw new IllegalStateException("Cannot generate code for Integer.");
    }

    @Override
    public TR visit(Double d, TP param) {
        throw new IllegalStateException("Cannot generate code for Double.");
    }

    @Override
    public TR visit(Char c, TP param) {
        throw new IllegalStateException("Cannot generate code for Char.");
    }

    @Override
    public TR visit(Struct s, TP param) {
        throw new IllegalStateException("Cannot generate code for Struct.");
    }

    @Override
    public TR visit(FunctionType ft, TP param) {
        throw new IllegalStateException("Cannot generate code for FunctionType.");
    }

    @Override
    public TR visit(Void v, TP param) {
        throw new IllegalStateException("Cannot generate code for Void.");
    }

    @Override
    public TR visit(ErrorType e, TP param) {
        throw new IllegalStateException("Cannot generate code for ErrorType.");
    }

    @Override
    public TR visit(RecordField rf, TP param) {
        throw new IllegalStateException("Cannot generate code for RecordField.");
    }

    @Override
    public TR visit(BooleanType bt, TP param) {
        throw new IllegalStateException("Cannot generate code for BooleanType.");
    }
}

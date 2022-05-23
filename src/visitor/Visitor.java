package visitor;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.definition.VariableDefinitionAssignment;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import ast.type.Double;
import ast.type.Integer;
import ast.type.Void;

public interface Visitor<TR, TP> {


    //PROGRAM
    TR visit(Program p, TP param);

    //EXPRESSIONS
    TR visit(Arithmetic a, TP param);
    TR visit(DoubleLiteral d, TP param);
    TR visit(CharLiteral C, TP param);
    TR visit(FunctionInvocation f, TP param);
    TR visit(IntLiteral i, TP param);
    TR visit(Variable v, TP param);
    TR visit(UnaryMinus u, TP param);
    TR visit(Logical l, TP param);
    TR visit(ArrayAccess a, TP param);
    TR visit(Comparison c, TP param);
    TR visit(Cast c, TP param);
    TR visit(FieldAccess fa, TP param);
    TR visit(UnaryNot u, TP param);


    //STATEMENT
    TR visit(Assignment a, TP param);
    TR visit(Print p, TP param);
    TR visit(Input i, TP param);
    TR visit(While w, TP param);
    TR visit(Return r, TP param);
    TR visit(If i, TP param);


    //DEFINITION
    TR visit(VariableDefinition v, TP param);
    TR visit(FunctionDefinition f, TP param);
    TR visit(VariableDefinitionAssignment v, TP param);

    //TYPE
    TR visit(Array a, TP param);
    TR visit(Integer i, TP param);
    TR visit(Double d, TP param);
    TR visit(Char c, TP param);
    TR visit(Struct s, TP param);
    TR visit(FunctionType ft, TP param);
    TR visit(Void v, TP param);
    TR visit(ErrorType e, TP param);
    TR visit(RecordField rf, TP param);


}

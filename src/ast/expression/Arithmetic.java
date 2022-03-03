package ast.expression;

public class Arithmetic extends AbstractExpression {

    private String operator;
    private Expression firstStatement;
    private Expression secondStatement;

    public Arithmetic(int line, int column,Expression firstStatement, String operator, Expression secondStatement) {
        super(line, column);
        this.operator = operator;
        this.secondStatement = secondStatement;
        this.firstStatement = firstStatement;
    }
}

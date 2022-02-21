package ast.type;

import ast.node.AstNodeImpl;

import java.util.List;

public class Struct extends AstNodeImpl implements Type{

    private List<RecordField> fields;

    public Struct(int line, int column) {
        super(line, column);
    }
}

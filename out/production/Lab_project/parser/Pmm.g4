grammar Pmm;	

@header{
import ast.definition.*;
import ast.expression.*;
import ast.node.*;
import ast.statement.*;
import ast.type.*;
import ast.type.Integer;
import ast.type.Double;
import ast.*;

}

/*program returns [AstNode ast]: ( variableDefinition | funcDefinition )* mainProgram EOF
       ;
*/

program returns [AstNode ast]: expression {$ast = $expression.ast;};


funcDefinition:'def' ID '(' (variable (',' variable)* )? ')' ':' (builtInType)? '{' variableDefinition*  statement* '}'
;

mainProgram:'def' 'main' '(' ')' ':' '{' variableDefinition*  statement* '}';


statement: ('print'|'input') expression(','expression)* ';'
|expression '=' expression ';'
|'if' expression ':'  stmBody  ('else' stmBody )?
|'while' expression ':' stmBody
|'return' expression ';'
| ID '(' (expression (','expression)* )? ')' ';'
;


stmBody: '{'statement+'}'
| statement
;


variableDefinition returns [List<VariableDefinition> ast]: v1=variable {$ast = $v1.ast;}';' ;

variable returns [List<VariableDefinition> ast]: i1=ID {
                                                      List<VariableDefinition> list = new ArrayList<>();
                                                      list.add(new VariableDefinition($i1.getLine(),
                                                                                      $i1.getCharPositionInLine(),
                                                                                      $i1.text,
                                                                                      null));
                                                    } (',' id2=ID {
                                                                     list.add(new VariableDefinition($id2.getLine(),
                                                                                                     $id2.getCharPositionInLine(),
                                                                                                     $id2.text,
                                                                                                     null));
                                                                    }
                                                       )* ':' t1=type {
                                                                     for(VariableDefinition vd : list){vd.setType($t1.ast);}

                                                                    }
;


expression returns [Expression ast]:
      ID { $ast = new Variable($ID.getLine(),
                    $ID.getCharPositionInLine()+1, $ID.text);}
    | INT_CONSTANT { $ast = new IntLiteral($INT_CONSTANT.getLine(),
                                       $INT_CONSTANT.getCharPositionInLine()+1,
                                       LexerHelper.lexemeToInt($INT_CONSTANT.text));}
    | REAL_CONSTANT { $ast = new DoubleLiteral($REAL_CONSTANT.getLine(),
                                                           $REAL_CONSTANT.getCharPositionInLine()+1,
                                                           LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
    | CHAR_CONSTANT {$ast = new CharLiteral($CHAR_CONSTANT.getLine(),
                                            $CHAR_CONSTANT.getCharPositionInLine()+1,
                                            LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
    | ID  {
                     FunctionInvocation fi = new FunctionInvocation($ID.getLine(),
                                                   $ID.getCharPositionInLine()+1,
                                                   new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text));
           }
      '(' (ep1=expression {fi.addExpression($ep1.ast);}
      (','ep2=expression {fi.addExpression($ep2.ast);})* )? ')'{$ast=fi;}

    | ep1=expression'['ep2=expression']'
        {
            $ast = new ArrayAccess($ep1.ast.getLine(), $ep1.ast.getColumn(), $ep1.ast, $ep2.ast);
        }
    | ep1=expression'.'ep2=expression
        {
                $ast = new FieldAccess($ep1.ast.getLine(), $ep1.ast.getColumn(), $ep1.ast, $ep2.text);
        }
    | '('t1=type')'ep1=expression
        {
                $ast = new Cast($t1.ast.getLine(), $t1.ast.getColumn(),$t1.ast,$ep1.ast);
        }
    | '-'e=expression {$ast = new UnaryMinus($e.ast.getLine(),$e.ast.getColumn(),$e.ast);}
    |'!'e=expression {$ast = new UnaryNot($e.ast.getLine(),$e.ast.getColumn(),$e.ast);}
    |ep1=expression OP=('*'|'/'|'%') ep2=expression
        {
            $ast = new Arithmetic($ep1.ast.getLine(),
                                  $ep1.ast.getColumn(),
                                  $ep1.ast,
                                  $OP.text,
                                  $ep2.ast);
        }
    |ep1=expression OP=('+'|'-') ep2=expression
     {
            $ast = new Arithmetic($ep1.ast.getLine(),
                                  $ep1.ast.getColumn(),
                                  $ep1.ast,
                                  $OP.text,
                                  $ep2.ast);
    }
    |ep1=expression OP=('>'|'>='|'<'|'<='|'!='|'==')ep2=expression
    {
        $ast = new Comparison($ep1.ast.getLine(),
                              $ep1.ast.getColumn(),
                              $ep1.ast,
                              $ep2.ast,
                              $OP.text);
    }
    |ep1=expression OP=('&&'|'||')ep2=expression
    {
        $ast = new Logical($ep1.ast.getLine(),
                              $ep1.ast.getColumn(),
                              $ep1.ast,
                              $ep2.ast,
                              $OP.text);
    }

    ;

type returns [Type ast] locals [List<RecordField> fields = new ArrayList<RecordField>()]: b1=builtInType {$ast = $b1.ast;}
 | '['I1=INT_CONSTANT']' t=type {$ast = new Array($I1.getLine(),$I1.getCharPositionInLine(),
                                        LexerHelper.lexemeToInt($I1.text),
                                        $t.ast);}
 | 'struct''{' ((v=variableDefinition {

                                        for(VariableDefinition df : $v.ast){
                                               $fields.add( new RecordField(df.getName(),
                                                                           df.getType()
                                                                           )
                                                          );
                                         }


                                      }
                              )+
                             )'}' {
                                    Struct st = new Struct($v.ast.get(0).getLine(), $v.ast.get(0).getColumn());
                                    for(RecordField rf : $fields){st.addField(rf);}
                                    $ast = st;
                                  }
 ;

 builtInType returns [Type ast]:'char' {$ast = Char.getInstance();}
              | 'int' {$ast = Integer.getInstance();}
              | 'double'{$ast = Double.getInstance();}
              ;


fragment
DIGIT:[0-9];

fragment
LETTER: [a-zA-Z]
      ;

fragment
NEW_LINE: ('\r')?('\n'| EOF)
            ;

fragment
FLOATING_POINT: (DIGIT+'.'DIGIT+)
                | ('.'DIGIT+)
                | (DIGIT+'.');
fragment
MANTISSA: (FLOATING_POINT|DIGIT+)('E'|'e')('+'|'-')?DIGIT+;


TRASH: ([ \t\n\r]+ | NEW_LINE) -> skip;

ONE_LINE_COMMENT: '#' .*? (NEW_LINE | EOF) -> skip;

MULTI_LINE_COMMENT: '"""' .*? '"""' -> skip;

INT_CONSTANT: [1-9]DIGIT*
            |'0'
            ;

ID: (LETTER|'_')(DIGIT|'_'|LETTER)*;

CHAR_CONSTANT: ('\'' . '\'')
            | ('\'\\n\'')
            | ('\'\\t\'')
            | ('\'\\' DIGIT+ '\'');


REAL_CONSTANT: FLOATING_POINT | MANTISSA;
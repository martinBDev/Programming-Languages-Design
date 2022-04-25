grammar Pmm;	

@header{
import ast.definition.*;
import ast.expression.*;
import ast.node.*;
import ast.statement.*;
import ast.type.*;
import ast.type.Integer;
import ast.type.Double;
import ast.type.Void;
import ast.*;

}


program returns [AstNode ast]: {Program program = new Program(0,0);}
                            (

                                variableDefinition {program.addAllVariableDefinitions($variableDefinition.ast);} |
                                funcDefinition{program.addDefinition($funcDefinition.ast);}

                            )*
                              mainProgram {program.addDefinition($mainProgram.ast);} EOF
                              {$ast = program;}
;


funcDefinition returns [FunctionDefinition ast]
locals [List<VariableDefinition> params = new ArrayList<>()]: d='def' i1=ID
               '(' (
                     v1=builtInVariable {$params.addAll($v1.ast);}(',' v2=builtInVariable {$params.addAll($v2.ast);})*
                    )?
                ')'
               col=':' {Type builtIn = Void.getInstance();}
               (b=builtInType {builtIn=$b.ast;})?
               {$ast = new FunctionDefinition($d.getLine(),
                                              $d.getCharPositionInLine()+1,
                                              $i1.text,
                                              new FunctionType(builtIn.getLine(),
                                                               builtIn.getColumn(),
                                                               builtIn,
                                                               $params)
                                              );
               }
               '{'
                    (var1=variableDefinition {$ast.addAllVariableDefinitions($var1.ast);})*
                    (stm1=statement {$ast.addStatement($stm1.ast);})*
                '}'

;

mainProgram returns [FunctionDefinition ast]:d='def' 'main' '(' ')' col=':'
               {$ast = new FunctionDefinition($d.getLine(),
                                             $d.getCharPositionInLine()+1,
                                             "main",
                                             new FunctionType($col.getLine(),
                                                              $col.getCharPositionInLine()+1,
                                                              Void.getInstance(),
                                                              new ArrayList<>()
                                                              )
                                             );
               }
           '{'
              (var1=variableDefinition {$ast.addAllVariableDefinitions($var1.ast);})*
              (stm1=statement {$ast.addStatement($stm1.ast);})*
            '}'


;


statement returns [Statement ast]:  p='print'{Print stm = new Print($p.getLine(),$p.getCharPositionInLine()+1);}
                                    e1=expression {stm.addExpression($e1.ast);}
                                    (','e2=expression {stm.addExpression($e2.ast);})* ';'
                                    {$ast = stm;}

| i='input'{Input stm = new Input($i.getLine(),$i.getCharPositionInLine()+1);}
    e1=expression {stm.addExpression($e1.ast);}
    (','e2=expression {stm.addExpression($e2.ast);})* ';' {$ast = stm;}

|e1=expression '=' e2=expression ';'{$ast = new Assignment($e1.ast.getLine(),
                                                           $e1.ast.getColumn(),
                                                           $e1.ast,
                                                           $e2.ast);}

|ifTxt='if' e1=expression ':'  s1=stmBody  {If ifStatement = new If($ifTxt.getLine(),
                                                    $ifTxt.getCharPositionInLine()+1,
                                                    $e1.ast);

                                      ifStatement.addAllStatementsTrue($s1.ast);

                                      }
                        ('else' s2=stmBody {ifStatement.addAllStatementsFalse($s2.ast);}
                        )? {$ast = ifStatement;}
|w='while' e1=expression ':' s1=stmBody {$ast = new While($w.getLine(),
                                                        $w.getCharPositionInLine()+1,
                                                        $e1.ast,$s1.ast);}
|r='return' e1=expression ';' {$ast = new Return($r.getLine(),
                                               $r.getCharPositionInLine()+1,
                                               $e1.ast);}
| i1=ID '(' {FunctionInvocation pi = new FunctionInvocation($i1.getLine(),
                                                              $i1.getCharPositionInLine()+1,
                                                              new Variable($i1.getLine(),
                                                                           $i1.getCharPositionInLine()+1,
                                                                           $i1.text));}
        (e1=expression {pi.addExpression($e1.ast);}
            (','e2=expression {pi.addExpression($e2.ast);})*
        )? ')' ';'

        {$ast = pi;}
;


stmBody returns [List<Statement> ast] locals [List<Statement> stms = new ArrayList<>()]:
'{'(s1=statement {$stms.add($s1.ast);})+'}' {$ast = $stms;}
| s1=statement {$stms.add($s1.ast); $ast = $stms;}
;




variableDefinition returns [List<VariableDefinition> ast]: v1=variable {$ast = $v1.ast;}';' ;


builtInVariable returns [List<VariableDefinition> ast]: i1=ID {
                                                      List<VariableDefinition> list = new ArrayList<>();

                                                       list.add(new VariableDefinition($i1.getLine(),
                                                                                       $i1.getCharPositionInLine()+1,
                                                                                       $i1.text,
                                                                                       null));

                                                    } (',' id2=ID {

                                                               VariableDefinition df = new VariableDefinition(
                                                                                     $id2.getLine(),
                                                                                     $id2.getCharPositionInLine()+1,
                                                                                     $id2.text,
                                                                                     null);

                                                             if(!list.stream().map(i -> i.getName()).toList().contains($id2.text)){

                                                                list.add(df);

                                                             }else{
                                                                ErrorType et = new ErrorType(
                                                                                $id2.getLine(),
                                                                                $id2.getCharPositionInLine()+1,
                                                                                "Already defined variable with name: " + $id2.text);
                                                                    }
                                                                  }
                                                       )* ':' t1=builtInType {
                                                                     for(VariableDefinition vd : list){vd.setType($t1.ast);}

                                                                    }
        {$ast = list;}
;

variable returns [List<VariableDefinition> ast]: i1=ID {
                                                      List<VariableDefinition> list = new ArrayList<>();

                                                      list.add(new VariableDefinition($i1.getLine(),
                                                                                      $i1.getCharPositionInLine()+1,
                                                                                      $i1.text,
                                                                                      null));


                                                    } (',' id2=ID {
                                                            VariableDefinition df = new VariableDefinition(
                                                                                     $id2.getLine(),
                                                                                     $id2.getCharPositionInLine()+1,
                                                                                     $id2.text,
                                                                                     null);


                                                             if(!list.stream().map(i -> i.getName()).toList().contains($id2.text)){

                                                               list.add(df);

                                                             }else{
                                                                ErrorType et = new ErrorType(
                                                                                $id2.getLine(),
                                                                                $id2.getCharPositionInLine()+1,
                                                                                "Already defined variable with name: " + $id2.text);
                                                                    }
                                                        }
                                                       )* ':' t1=type {
                                                                     for(VariableDefinition vd : list){vd.setType($t1.ast);}

                                                                    }
        {$ast = list;}
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

    | '(' e1=expression ')' {$ast = $e1.ast;}
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
    | ep1=expression'.'i1=ID
        {
                $ast = new FieldAccess($ep1.ast.getLine(), $ep1.ast.getColumn(), $ep1.ast, $i1.text);
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
 | '['I1=INT_CONSTANT']' t=type {$ast = new Array($I1.getLine(),$I1.getCharPositionInLine()+1,
                                        LexerHelper.lexemeToInt($I1.text),
                                        $t.ast);}
 | 'struct''{' ((v=variableDefinition {

                                        for(VariableDefinition df : $v.ast){

                                            if(!$fields.stream().map(i -> i.getName()).toList().contains(df.getName())){

                                            $fields.add( new RecordField(df.getLine(),
                                                                    df.getColumn(),
                                                                    df.getName(),
                                                                   df.getType()
                                                                   )
                                                  );

                                            }else{

                                            ErrorType et = new ErrorType(
                                                        df.getLine(),
                                                        df.getColumn(),
                                                        "Already defined field in struct with name: " + df.getName());

                                            }

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
FLOATING_POINT: (INT_CONSTANT'.'DIGIT+)
                | ('.'DIGIT+)
                | (INT_CONSTANT'.');
fragment
MANTISSA: (FLOATING_POINT|INT_CONSTANT)('E'|'e')('+'|'-')?DIGIT+;


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
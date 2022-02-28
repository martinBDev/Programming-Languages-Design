grammar Pmm;	

program: ( variableDefinition | funcDefinition )* mainProgram EOF
       ;


funcDefinition:'def' ID '(' (variable (',' variable)* )? ')' ':' (builtInType)? functionBody
;

mainProgram:'def' 'main' '(' ')' ':' functionBody;

functionBody: '{' variableDefinition*  statement* '}'
;

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


variableDefinition: variable ';' ;

variable: ID (',' ID)* ':' type;


expression: INT_CONSTANT
    | CHAR_CONSTANT
    | REAL_CONSTANT
    | ID
    | ID '(' (expression (','expression)* )? ')'
    | expression'['expression']'
    | expression'.'expression
    | '('type')'expression
    | '-'expression
    |'!'expression
    |expression ('*'|'/'|'%') expression
    |expression ('+'|'-') expression
    |expression ('>'|'>='|'<'|'<='|'!='|'==')expression
    |expression ('&&'|'||')expression
    ;

type: builtInType
 | '['INT_CONSTANT']' type
 | 'struct''{' (variableDefinition+) '}';

 builtInType:'char'
              | 'int'
              | 'double';


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
grammar Expr;

prog: stat+ ;

stat: expr NEWLINE
 | ID '=' expr NEWLINE
 | NEWLINE
;

expr:expr operator expr
 | INT
 | ID
 | '(' expr ')'
 | function_expression
;
operator:'*'|'/'|'+'|'-';
function_expression:ID '(' argument_list ')';
argument_list: argument_expression
  |argument_expression COMMA argument_list;
argument_expression: ID
  |INT
  |STRING
  |function_expression;
STRING:'"' ('\"'|[.&&^"])* '"'|'""';
COMMA:',';
ID : [a-zA-Z]+ ; // match identifiers
INT : [0-9]+ ; // match integers
NEWLINE:'\r'?'\n' ; // return newlines to parser (is end-statement signal)
WS : [ \t]+ -> skip ; // toss out whitespace
/** Taken from "The Definitive ANTLR 4 Reference" by Terence Parr */

// Based on JSON.g4, https://github.com/antlr/grammars-v4/tree/master/json
// Derived from http://json.org

grammar Python;

python: dict
    |   tuple
    |   list
    ;

dict
    :   '{' pair (',' pair)* '}'
    |   '{' '}' // empty dict
    ;
    
pair:   STRING ':' value ;

tuple
    :   '(' value (',' value)* ')'
    |   '(' ')' // empty tuple
    ;

list
    :   '[' value (',' value)* ']'
    |   '[' ']' // empty list
    ;

value
    :   STRING
    |   NUMBER
    |   dict    // recursion
    |   tuple   // recursion
    |   list    // recursion
    |   'True'  // keywords
    |   'False'
    |   'None'
    ;

STRING :  '"' (ESC | ~["\\])* '"' ;
fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;
NUMBER
    :   '-'? INT '.' [0-9]+ EXP? // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP             // 1e10 -3e4
    |   '-'? INT                 // -3, 45
    ;
fragment INT :   '0' | [1-9] [0-9]* ; // no leading zeros
fragment EXP :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]
WS  :   [ \t\n\r]+ -> skip ;

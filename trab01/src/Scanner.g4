lexer grammar Scanner;

ID_ERROR: (DIGITO)+ (LETRA)+;
REAL_ERROR: '0' (DIGITO)+;
ID_ERROR2: ('A'..'Z'|'_'|'$')(LETRA|DIGITO|'_'|'$')*;

ABS: 'abstract';
BOOL: 'boolean';
CHAR: 'char';
CLAS: 'class';
ELSE: 'else';
EXTE: 'extends';
FALS: 'false';
IMPO: 'import';
IF: 'if';
INST: 'instanceof';
INT: 'int';
NEW: 'new';
NULL: 'null';
PACK: 'package';
PRIV: 'private';
PROT: 'protected';
PUBL: 'public';
RETU: 'return';
STAT: 'static';
SUPE: 'super';
THIS: 'this';
TRUE: 'true';
VOID: 'void';
WHIL: 'while';

OPIGUAL: '=';
OPATRIB: '==';
OPMAIOR: '>';
OPMAISM: '++';
OPAND: '&&';
OPMENOI: '<=';
OPDIFEF: '!';
OPSUBTR: '-';
OPMENOSM: '--';
OPSOMA: '+';
OPMAISI: '+=';
OPASTE: '*';

SEVIRG: ',';
SEPONTO: '.';
SEACOLC: '[';
SEACHAV: '{';
SEAPARE: '(';
SEFPARE: ')';
SEFCHAV: '}';
SEFCOLC: ']';
SEDOISP: ';';

ID: ('a'..'z'|'_'|'$')(LETRA|DIGITO|'_'|'$')*;
fragment LETRA: ('a'..'z' | 'A'..'Z');
fragment DIGITO: ('0'..'9');
fragment OPERATORS: ('='|'=='|'>'|'++'|'&&'|'<='|'!'|'-'|'--'|'+'|'+='|'*');
ESPACO: ( ' ' | '\u000C')+ -> skip;
NL: ('\n'| '\r'| '\t' | '\b' |'\f' | '\'' | ' \\ ') -> skip;
COMENTARIO: '//' (~('\n' | '\r'))* -> skip;
INTLITE: ('0' | ('1'..'9'))(DIGITO)*;
CHARLITERAL: ( '\''(NL | ~( '\'' | '\\' | '\n' | '\r')) '\'');
SRINGLITERAL: ( '"'(NL | ~( '"' | '\\' | '\n' | '\r'))* '"');
OP_ERROR: (OPERATORS) (OPERATORS)+;

GERAL_ERROR2: ('\r'..'~');
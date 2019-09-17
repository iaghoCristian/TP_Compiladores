lexer grammar teste;

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

IDENT: '( a-z | A-Z | _ | $){ a-z | A-Z | _ | 0-9 | $}';

LF:'lf'; //arrumar
CR:'cr'; //arrumar

ESC: ' \ {n|r|t|b|f | \'| " | \ }';
INTLITE: '0 | (1-9){0-9}';
CHARLIT: '(ESC | ~ ( \'| \ |LF|CR))';
STRILIT: '{ESC | ~( " | \ | LF | CR )}';
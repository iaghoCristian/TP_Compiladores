grammar JMMParser;

// Analisador léxico

ID_STARTSWITHDIGIT_ERROR: DIGITO+ (LETRA)+;
INT_STARTSWITHZERO_ERROR: '0' DIGITO+;

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
SEPONTOEVIRG: ';';
SEDOISPONTOS: ':';

ID: (LETRA|'_'|'$')(LETRA|DIGITO|'_'|'$')*;
fragment LETRA: ('a'..'z' | 'A'..'Z');
fragment DIGITO: ('0'..'9');
fragment OPERATORS: ('='|'=='|'>'|'++'|'&&'|'<='|'!'|'-'|'--'|'+'|'+='|'*');
ESPACO: ( ' ' | '\u000C')+ -> skip;
NL: ('\n'| '\r'| '\t' | '\b' |'\f' | '\'' | ' \\ ') -> skip;
COMENTARIO: '//' (~('\n' | '\r'))* -> skip;
INTLITE: ('0' | ('1'..'9'))(DIGITO)*;
CHARLITERAL: ( '\''(NL | ~( '\'' | '\\' | '\n' | '\r')) '\'');
SRINGLITERAL: ( '"'(NL | ~( '"' | '\\' | '\n' | '\r'))* '"');
MULTIOPERATOR_ERROR: OPERATORS OPERATORS+;

UNKNOWN_CHARACTER_ERROR: ('\r'..'~');



// Analisador sintático

compilationUnit: (PACK qualifiedIdentifier SEPONTOEVIRG)?
(IMPO qualifiedIdentifier SEPONTOEVIRG)*
typeDeclaration* EOF;

qualifiedIdentifier: ID ('.' ID)*;

typeDeclaration: modifiers classDeclaration;

modifiers: (PUBL | PROT | PRIV | STAT | ABS)*;

classDeclaration: 'class' ID ('extends' qualifiedIdentifier)? classBody;

classBody: '{' (modifiers memberDecl)* '}';

memberDecl: ID formalParameters block /*construtor*/
    | ('void' | type) ID /*method*/
        formalParameters(block | SEPONTOEVIRG)
    | type variableDeclarators SEPONTOEVIRG; // campo

block: SEACHAV blockStatement* SEFCHAV;

blockStatement: localVariableDeclarationStatement | statement;

statement: block | ID SEDOISPONTOS statement | IF parExpression statement (ELSE statement)?
    | WHIL parExpression statement | RETU expression? SEPONTOEVIRG
    | SEPONTOEVIRG | statementExpression SEPONTOEVIRG;

formalParameters: SEAPARE (formalParameter (SEVIRG formalParameter)*)? SEFPARE;

formalParameter: type ID;

parExpression: '(' expression ')';

localVariableDeclarationStatement: type variableDeclarators ';';

variableDeclarators: variableDeclarator (',' variableDeclarator )*;

variableDeclarator: ID ('=' variableInitializer)?;

variableInitializer: arrayInitializer | expression;

arrayInitializer: '{' (variableInitializer (',' variableInitializer)*)? '}';

arguments: '(' (expression (',' expression)*)? ')';

type: referenceType | basicType;

basicType: 'boolean' | 'char' | 'int';

referenceType: basicType '[' ']' ('[' ']')* | qualifiedIdentifier ('[' ']')*;

statementExpression: expression;

expression: assignmentExpression;

assignmentExpression: conditionalAndExpression (('=' | '+=') assignmentExpression)?;

conditionalAndExpression: equalityExpression ('&&' equalityExpression)*;

equalityExpression: relationalExpression ('==' relationalExpression)*;

relationalExpression: additiveExpression (('>' | '<=') additiveExpression |
    'instanceof' referenceType)?;

additiveExpression: multiplicativeExpression (('+' | '-') multiplicativeExpression)*;

multiplicativeExpression: unaryExpression ('*' unaryExpression)*;

unaryExpression: '++' unaryExpression | '-' unaryExpression | simpleUnaryExpression;

simpleUnaryExpression: '!' unaryExpression | '(' basicType ')' unaryExpression // cast
| '(' referenceType ')' simpleUnaryExpression /* cast */ | postfixExpression;

postfixExpression: primary selector* '--'*;

selector: '.' qualifiedIdentifier arguments? | '[' expression ']';

primary: parExpression
| 'this' arguments?
| 'super' (arguments | '.' ID arguments?)
| literal
| 'new' creator
| qualifiedIdentifier arguments?;

creator : (basicType | qualifiedIdentifier)
(arguments
| '[' ']' ('[' ']')* arrayInitializer?
| newArrayDeclarator);

newArrayDeclarator : '[' expression ']' ('[' expression ']')* ('[' ']')*;

literal : INTLITE | CHARLITERAL | SRINGLITERAL | TRUE | FALS | NULL;
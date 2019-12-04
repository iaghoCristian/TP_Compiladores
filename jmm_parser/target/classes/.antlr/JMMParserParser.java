// Generated from /home/marcio/Documentos/UFLA/2019_2/compiladores/TP/TP_Compiladores/jmm_parser/src/main/resources/JMMParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JMMParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID_STARTSWITHDIGIT_ERROR=1, INT_STARTSWITHZERO_ERROR=2, ABS=3, BOOL=4, 
		CHAR=5, CLAS=6, ELSE=7, EXTE=8, FALS=9, IMPO=10, IF=11, INST=12, INT=13, 
		NEW=14, NULL=15, PACK=16, PRIV=17, PROT=18, PUBL=19, RETU=20, STAT=21, 
		SUPE=22, THIS=23, TRUE=24, VOID=25, WHIL=26, OPIGUAL=27, OPATRIB=28, OPMAIOR=29, 
		OPMAISM=30, OPAND=31, OPMENOI=32, OPDIFEF=33, OPSUBTR=34, OPMENOSM=35, 
		OPSOMA=36, OPMAISI=37, OPASTE=38, SEVIRG=39, SEPONTO=40, SEACOLC=41, SEACHAV=42, 
		SEAPARE=43, SEFPARE=44, SEFCHAV=45, SEFCOLC=46, SEPONTOEVIRG=47, SEDOISPONTOS=48, 
		RESERVED_WORD=49, ID=50, ESPACO=51, NL=52, COMENTARIO=53, INTLITE=54, 
		CHARLITERAL=55, SRINGLITERAL=56, MULTIOPERATOR_ERROR=57, UNKNOWN_CHARACTER_ERROR=58;
	public static final int
		RULE_compilationUnit = 0, RULE_qualifiedIdentifier = 1, RULE_typeDeclaration = 2, 
		RULE_modifiers = 3, RULE_classDeclaration = 4, RULE_classBody = 5, RULE_memberDecl = 6, 
		RULE_block = 7, RULE_blockStatement = 8, RULE_statement = 9, RULE_formalParameters = 10, 
		RULE_formalParameter = 11, RULE_parExpression = 12, RULE_localVariableDeclarationStatement = 13, 
		RULE_variableDeclarators = 14, RULE_variableDeclarator = 15, RULE_variableInitializer = 16, 
		RULE_arrayInitializer = 17, RULE_arguments = 18, RULE_type = 19, RULE_basicType = 20, 
		RULE_referenceType = 21, RULE_statementExpression = 22, RULE_expression = 23, 
		RULE_assignmentExpression = 24, RULE_conditionalAndExpression = 25, RULE_equalityExpression = 26, 
		RULE_relationalExpression = 27, RULE_additiveExpression = 28, RULE_multiplicativeExpression = 29, 
		RULE_unaryExpression = 30, RULE_simpleUnaryExpression = 31, RULE_postfixExpression = 32, 
		RULE_selector = 33, RULE_primary = 34, RULE_creator = 35, RULE_newArrayDeclarator = 36, 
		RULE_literal = 37;
	public static final String[] ruleNames = {
		"compilationUnit", "qualifiedIdentifier", "typeDeclaration", "modifiers", 
		"classDeclaration", "classBody", "memberDecl", "block", "blockStatement", 
		"statement", "formalParameters", "formalParameter", "parExpression", "localVariableDeclarationStatement", 
		"variableDeclarators", "variableDeclarator", "variableInitializer", "arrayInitializer", 
		"arguments", "type", "basicType", "referenceType", "statementExpression", 
		"expression", "assignmentExpression", "conditionalAndExpression", "equalityExpression", 
		"relationalExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "simpleUnaryExpression", "postfixExpression", "selector", 
		"primary", "creator", "newArrayDeclarator", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'abstract'", "'boolean'", "'char'", "'class'", "'else'", 
		"'extends'", "'false'", "'import'", "'if'", "'instanceof'", "'int'", "'new'", 
		"'null'", "'package'", "'private'", "'protected'", "'public'", "'return'", 
		"'static'", "'super'", "'this'", "'true'", "'void'", "'while'", "'='", 
		"'=='", "'>'", "'++'", "'&&'", "'<='", "'!'", "'-'", "'--'", "'+'", "'+='", 
		"'*'", "','", "'.'", "'['", "'{'", "'('", "')'", "'}'", "']'", "';'", 
		"':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID_STARTSWITHDIGIT_ERROR", "INT_STARTSWITHZERO_ERROR", "ABS", "BOOL", 
		"CHAR", "CLAS", "ELSE", "EXTE", "FALS", "IMPO", "IF", "INST", "INT", "NEW", 
		"NULL", "PACK", "PRIV", "PROT", "PUBL", "RETU", "STAT", "SUPE", "THIS", 
		"TRUE", "VOID", "WHIL", "OPIGUAL", "OPATRIB", "OPMAIOR", "OPMAISM", "OPAND", 
		"OPMENOI", "OPDIFEF", "OPSUBTR", "OPMENOSM", "OPSOMA", "OPMAISI", "OPASTE", 
		"SEVIRG", "SEPONTO", "SEACOLC", "SEACHAV", "SEAPARE", "SEFPARE", "SEFCHAV", 
		"SEFCOLC", "SEPONTOEVIRG", "SEDOISPONTOS", "RESERVED_WORD", "ID", "ESPACO", 
		"NL", "COMENTARIO", "INTLITE", "CHARLITERAL", "SRINGLITERAL", "MULTIOPERATOR_ERROR", 
		"UNKNOWN_CHARACTER_ERROR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JMMParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JMMParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JMMParserParser.EOF, 0); }
		public TerminalNode PACK() { return getToken(JMMParserParser.PACK, 0); }
		public List<QualifiedIdentifierContext> qualifiedIdentifier() {
			return getRuleContexts(QualifiedIdentifierContext.class);
		}
		public QualifiedIdentifierContext qualifiedIdentifier(int i) {
			return getRuleContext(QualifiedIdentifierContext.class,i);
		}
		public List<TerminalNode> SEPONTOEVIRG() { return getTokens(JMMParserParser.SEPONTOEVIRG); }
		public TerminalNode SEPONTOEVIRG(int i) {
			return getToken(JMMParserParser.SEPONTOEVIRG, i);
		}
		public List<TerminalNode> IMPO() { return getTokens(JMMParserParser.IMPO); }
		public TerminalNode IMPO(int i) {
			return getToken(JMMParserParser.IMPO, i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACK) {
				{
				setState(76);
				match(PACK);
				setState(77);
				qualifiedIdentifier();
				setState(78);
				match(SEPONTOEVIRG);
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPO) {
				{
				{
				setState(82);
				match(IMPO);
				setState(83);
				qualifiedIdentifier();
				setState(84);
				match(SEPONTOEVIRG);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << CLAS) | (1L << PRIV) | (1L << PROT) | (1L << PUBL) | (1L << STAT))) != 0)) {
				{
				{
				setState(91);
				typeDeclaration();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JMMParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JMMParserParser.ID, i);
		}
		public QualifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
	}

	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualifiedIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					match(SEPONTO);
					setState(101);
					match(ID);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			modifiers();
			setState(108);
			classDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends ParserRuleContext {
		public List<TerminalNode> PUBL() { return getTokens(JMMParserParser.PUBL); }
		public TerminalNode PUBL(int i) {
			return getToken(JMMParserParser.PUBL, i);
		}
		public List<TerminalNode> PROT() { return getTokens(JMMParserParser.PROT); }
		public TerminalNode PROT(int i) {
			return getToken(JMMParserParser.PROT, i);
		}
		public List<TerminalNode> PRIV() { return getTokens(JMMParserParser.PRIV); }
		public TerminalNode PRIV(int i) {
			return getToken(JMMParserParser.PRIV, i);
		}
		public List<TerminalNode> STAT() { return getTokens(JMMParserParser.STAT); }
		public TerminalNode STAT(int i) {
			return getToken(JMMParserParser.STAT, i);
		}
		public List<TerminalNode> ABS() { return getTokens(JMMParserParser.ABS); }
		public TerminalNode ABS(int i) {
			return getToken(JMMParserParser.ABS, i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRIV) | (1L << PROT) | (1L << PUBL) | (1L << STAT))) != 0)) {
				{
				{
				setState(110);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRIV) | (1L << PROT) | (1L << PUBL) | (1L << STAT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JMMParserParser.ID, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CLAS);
			setState(117);
			match(ID);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTE) {
				{
				setState(118);
				match(EXTE);
				setState(119);
				qualifiedIdentifier();
				}
			}

			setState(122);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public List<MemberDeclContext> memberDecl() {
			return getRuleContexts(MemberDeclContext.class);
		}
		public MemberDeclContext memberDecl(int i) {
			return getRuleContext(MemberDeclContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(SEACHAV);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << PRIV) | (1L << PROT) | (1L << PUBL) | (1L << STAT) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				{
				setState(125);
				modifiers();
				setState(126);
				memberDecl();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(SEFCHAV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JMMParserParser.ID, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEPONTOEVIRG() { return getToken(JMMParserParser.SEPONTOEVIRG, 0); }
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_memberDecl);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(ID);
				setState(136);
				formalParameters();
				setState(137);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(139);
					match(VOID);
					}
					break;
				case BOOL:
				case CHAR:
				case INT:
				case ID:
					{
					setState(140);
					type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(143);
				match(ID);
				setState(144);
				formalParameters();
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEACHAV:
					{
					setState(145);
					block();
					}
					break;
				case SEPONTOEVIRG:
					{
					setState(146);
					match(SEPONTOEVIRG);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				type();
				setState(150);
				variableDeclarators();
				setState(151);
				match(SEPONTOEVIRG);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode SEACHAV() { return getToken(JMMParserParser.SEACHAV, 0); }
		public TerminalNode SEFCHAV() { return getToken(JMMParserParser.SEFCHAV, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(SEACHAV);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << FALS) | (1L << IF) | (1L << INT) | (1L << NEW) | (1L << NULL) | (1L << RETU) | (1L << SUPE) | (1L << THIS) | (1L << TRUE) | (1L << WHIL) | (1L << OPMAISM) | (1L << OPDIFEF) | (1L << OPSUBTR) | (1L << SEACHAV) | (1L << SEAPARE) | (1L << SEPONTOEVIRG) | (1L << ID) | (1L << INTLITE) | (1L << CHARLITERAL) | (1L << SRINGLITERAL))) != 0)) {
				{
				{
				setState(156);
				blockStatement();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(SEFCHAV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockStatement);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ID() { return getToken(JMMParserParser.ID, 0); }
		public TerminalNode SEDOISPONTOS() { return getToken(JMMParserParser.SEDOISPONTOS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IF() { return getToken(JMMParserParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(JMMParserParser.ELSE, 0); }
		public TerminalNode WHIL() { return getToken(JMMParserParser.WHIL, 0); }
		public TerminalNode RETU() { return getToken(JMMParserParser.RETU, 0); }
		public TerminalNode SEPONTOEVIRG() { return getToken(JMMParserParser.SEPONTOEVIRG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(ID);
				setState(170);
				match(SEDOISPONTOS);
				setState(171);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(IF);
				setState(173);
				parExpression();
				setState(174);
				statement();
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(175);
					match(ELSE);
					setState(176);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(WHIL);
				setState(180);
				parExpression();
				setState(181);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(RETU);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALS) | (1L << NEW) | (1L << NULL) | (1L << SUPE) | (1L << THIS) | (1L << TRUE) | (1L << OPMAISM) | (1L << OPDIFEF) | (1L << OPSUBTR) | (1L << SEAPARE) | (1L << ID) | (1L << INTLITE) | (1L << CHARLITERAL) | (1L << SRINGLITERAL))) != 0)) {
					{
					setState(184);
					expression();
					}
				}

				setState(187);
				match(SEPONTOEVIRG);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(SEPONTOEVIRG);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				statementExpression();
				setState(190);
				match(SEPONTOEVIRG);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode SEAPARE() { return getToken(JMMParserParser.SEAPARE, 0); }
		public TerminalNode SEFPARE() { return getToken(JMMParserParser.SEFPARE, 0); }
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> SEVIRG() { return getTokens(JMMParserParser.SEVIRG); }
		public TerminalNode SEVIRG(int i) {
			return getToken(JMMParserParser.SEVIRG, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(SEAPARE);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(195);
				formalParameter();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEVIRG) {
					{
					{
					setState(196);
					match(SEVIRG);
					setState(197);
					formalParameter();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(205);
			match(SEFPARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JMMParserParser.ID, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			type();
			setState(208);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(SEAPARE);
			setState(211);
			expression();
			setState(212);
			match(SEFPARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			type();
			setState(215);
			variableDeclarators();
			setState(216);
			match(SEPONTOEVIRG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			variableDeclarator();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEVIRG) {
				{
				{
				setState(219);
				match(SEVIRG);
				setState(220);
				variableDeclarator();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JMMParserParser.ID, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ID);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPIGUAL) {
				{
				setState(227);
				match(OPIGUAL);
				setState(228);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableInitializer);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEACHAV:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				arrayInitializer();
				}
				break;
			case FALS:
			case NEW:
			case NULL:
			case SUPE:
			case THIS:
			case TRUE:
			case OPMAISM:
			case OPDIFEF:
			case OPSUBTR:
			case SEAPARE:
			case ID:
			case INTLITE:
			case CHARLITERAL:
			case SRINGLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(SEACHAV);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALS) | (1L << NEW) | (1L << NULL) | (1L << SUPE) | (1L << THIS) | (1L << TRUE) | (1L << OPMAISM) | (1L << OPDIFEF) | (1L << OPSUBTR) | (1L << SEACHAV) | (1L << SEAPARE) | (1L << ID) | (1L << INTLITE) | (1L << CHARLITERAL) | (1L << SRINGLITERAL))) != 0)) {
				{
				setState(236);
				variableInitializer();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEVIRG) {
					{
					{
					setState(237);
					match(SEVIRG);
					setState(238);
					variableInitializer();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(246);
			match(SEFCHAV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(SEAPARE);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALS) | (1L << NEW) | (1L << NULL) | (1L << SUPE) | (1L << THIS) | (1L << TRUE) | (1L << OPMAISM) | (1L << OPDIFEF) | (1L << OPSUBTR) | (1L << SEAPARE) | (1L << ID) | (1L << INTLITE) | (1L << CHARLITERAL) | (1L << SRINGLITERAL))) != 0)) {
				{
				setState(249);
				expression();
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEVIRG) {
					{
					{
					setState(250);
					match(SEVIRG);
					setState(251);
					expression();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(259);
			match(SEFPARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				basicType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicTypeContext extends ParserRuleContext {
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_referenceType);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				basicType();
				setState(268);
				match(SEACOLC);
				setState(269);
				match(SEFCOLC);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEACOLC) {
					{
					{
					setState(270);
					match(SEACOLC);
					setState(271);
					match(SEFCOLC);
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				qualifiedIdentifier();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEACOLC) {
					{
					{
					setState(278);
					match(SEACOLC);
					setState(279);
					match(SEFCOLC);
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			conditionalAndExpression();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPIGUAL || _la==OPMAISI) {
				{
				setState(292);
				_la = _input.LA(1);
				if ( !(_la==OPIGUAL || _la==OPMAISI) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(293);
				assignmentExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			equalityExpression();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPAND) {
				{
				{
				setState(297);
				match(OPAND);
				setState(298);
				equalityExpression();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			relationalExpression();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPATRIB) {
				{
				{
				setState(305);
				match(OPATRIB);
				setState(306);
				relationalExpression();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			additiveExpression();
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPMAIOR:
			case OPMENOI:
				{
				setState(313);
				_la = _input.LA(1);
				if ( !(_la==OPMAIOR || _la==OPMENOI) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(314);
				additiveExpression();
				}
				break;
			case INST:
				{
				setState(315);
				match(INST);
				setState(316);
				referenceType();
				}
				break;
			case OPIGUAL:
			case OPATRIB:
			case OPAND:
			case OPMAISI:
			case SEVIRG:
			case SEFPARE:
			case SEFCHAV:
			case SEFCOLC:
			case SEPONTOEVIRG:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			multiplicativeExpression();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPSUBTR || _la==OPSOMA) {
				{
				{
				setState(320);
				_la = _input.LA(1);
				if ( !(_la==OPSUBTR || _la==OPSOMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(321);
				multiplicativeExpression();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			unaryExpression();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPASTE) {
				{
				{
				setState(328);
				match(OPASTE);
				setState(329);
				unaryExpression();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public SimpleUnaryExpressionContext simpleUnaryExpression() {
			return getRuleContext(SimpleUnaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unaryExpression);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPMAISM:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(OPMAISM);
				setState(336);
				unaryExpression();
				}
				break;
			case OPSUBTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(OPSUBTR);
				setState(338);
				unaryExpression();
				}
				break;
			case FALS:
			case NEW:
			case NULL:
			case SUPE:
			case THIS:
			case TRUE:
			case OPDIFEF:
			case SEAPARE:
			case ID:
			case INTLITE:
			case CHARLITERAL:
			case SRINGLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				simpleUnaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleUnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public SimpleUnaryExpressionContext simpleUnaryExpression() {
			return getRuleContext(SimpleUnaryExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public SimpleUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleUnaryExpression; }
	}

	public final SimpleUnaryExpressionContext simpleUnaryExpression() throws RecognitionException {
		SimpleUnaryExpressionContext _localctx = new SimpleUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simpleUnaryExpression);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(OPDIFEF);
				setState(343);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(SEAPARE);
				setState(345);
				basicType();
				setState(346);
				match(SEFPARE);
				setState(347);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(SEAPARE);
				setState(350);
				referenceType();
				setState(351);
				match(SEFPARE);
				setState(352);
				simpleUnaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				postfixExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			primary();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPONTO || _la==SEACOLC) {
				{
				{
				setState(358);
				selector();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPMENOSM) {
				{
				{
				setState(364);
				match(OPMENOSM);
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_selector);
		int _la;
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEPONTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(SEPONTO);
				setState(371);
				qualifiedIdentifier();
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEAPARE) {
					{
					setState(372);
					arguments();
					}
				}

				}
				break;
			case SEACOLC:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(SEACOLC);
				setState(376);
				expression();
				setState(377);
				match(SEFCOLC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode ID() { return getToken(JMMParserParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primary);
		int _la;
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEAPARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(THIS);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEAPARE) {
					{
					setState(383);
					arguments();
					}
				}

				}
				break;
			case SUPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(SUPE);
				setState(393);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEAPARE:
					{
					setState(387);
					arguments();
					}
					break;
				case SEPONTO:
					{
					setState(388);
					match(SEPONTO);
					setState(389);
					match(ID);
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEAPARE) {
						{
						setState(390);
						arguments();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case FALS:
			case NULL:
			case TRUE:
			case INTLITE:
			case CHARLITERAL:
			case SRINGLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				literal();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(396);
				match(NEW);
				setState(397);
				creator();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				qualifiedIdentifier();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEAPARE) {
					{
					setState(399);
					arguments();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewArrayDeclaratorContext newArrayDeclarator() {
			return getRuleContext(NewArrayDeclaratorContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_creator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case INT:
				{
				setState(404);
				basicType();
				}
				break;
			case ID:
				{
				setState(405);
				qualifiedIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(408);
				arguments();
				}
				break;
			case 2:
				{
				setState(409);
				match(SEACOLC);
				setState(410);
				match(SEFCOLC);
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(411);
						match(SEACOLC);
						setState(412);
						match(SEFCOLC);
						}
						} 
					}
					setState(417);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEACHAV) {
					{
					setState(418);
					arrayInitializer();
					}
				}

				}
				break;
			case 3:
				{
				setState(421);
				newArrayDeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewArrayDeclaratorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NewArrayDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newArrayDeclarator; }
	}

	public final NewArrayDeclaratorContext newArrayDeclarator() throws RecognitionException {
		NewArrayDeclaratorContext _localctx = new NewArrayDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_newArrayDeclarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(SEACOLC);
			setState(425);
			expression();
			setState(426);
			match(SEFCOLC);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(427);
					match(SEACOLC);
					setState(428);
					expression();
					setState(429);
					match(SEFCOLC);
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(436);
					match(SEACOLC);
					setState(437);
					match(SEFCOLC);
					}
					} 
				}
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTLITE() { return getToken(JMMParserParser.INTLITE, 0); }
		public TerminalNode CHARLITERAL() { return getToken(JMMParserParser.CHARLITERAL, 0); }
		public TerminalNode SRINGLITERAL() { return getToken(JMMParserParser.SRINGLITERAL, 0); }
		public TerminalNode TRUE() { return getToken(JMMParserParser.TRUE, 0); }
		public TerminalNode FALS() { return getToken(JMMParserParser.FALS, 0); }
		public TerminalNode NULL() { return getToken(JMMParserParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALS) | (1L << NULL) | (1L << TRUE) | (1L << INTLITE) | (1L << CHARLITERAL) | (1L << SRINGLITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\5\2S\n\2\3"+
		"\2\3\2\3\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\7\3i\n\3\f\3\16\3l\13\3\3\4\3\4\3\4\3\5\7\5r\n\5\f"+
		"\5\16\5u\13\5\3\6\3\6\3\6\3\6\5\6{\n\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u0083"+
		"\n\7\f\7\16\7\u0086\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0090\n\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0096\n\b\3\b\3\b\3\b\3\b\5\b\u009c\n\b\3\t\3\t\7"+
		"\t\u00a0\n\t\f\t\16\t\u00a3\13\t\3\t\3\t\3\n\3\n\5\n\u00a9\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b4\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00bc\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c3\n"+
		"\13\3\f\3\f\3\f\3\f\7\f\u00c9\n\f\f\f\16\f\u00cc\13\f\5\f\u00ce\n\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\7\20\u00e0\n\20\f\20\16\20\u00e3\13\20\3\21\3\21\3\21\5\21\u00e8\n"+
		"\21\3\22\3\22\5\22\u00ec\n\22\3\23\3\23\3\23\3\23\7\23\u00f2\n\23\f\23"+
		"\16\23\u00f5\13\23\5\23\u00f7\n\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24"+
		"\u00ff\n\24\f\24\16\24\u0102\13\24\5\24\u0104\n\24\3\24\3\24\3\25\3\25"+
		"\5\25\u010a\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u0113\n\27\f"+
		"\27\16\27\u0116\13\27\3\27\3\27\3\27\7\27\u011b\n\27\f\27\16\27\u011e"+
		"\13\27\5\27\u0120\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\5\32\u0129\n"+
		"\32\3\33\3\33\3\33\7\33\u012e\n\33\f\33\16\33\u0131\13\33\3\34\3\34\3"+
		"\34\7\34\u0136\n\34\f\34\16\34\u0139\13\34\3\35\3\35\3\35\3\35\3\35\5"+
		"\35\u0140\n\35\3\36\3\36\3\36\7\36\u0145\n\36\f\36\16\36\u0148\13\36\3"+
		"\37\3\37\3\37\7\37\u014d\n\37\f\37\16\37\u0150\13\37\3 \3 \3 \3 \3 \5"+
		" \u0157\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0166\n!\3\"\3\""+
		"\7\"\u016a\n\"\f\"\16\"\u016d\13\"\3\"\7\"\u0170\n\"\f\"\16\"\u0173\13"+
		"\"\3#\3#\3#\5#\u0178\n#\3#\3#\3#\3#\5#\u017e\n#\3$\3$\3$\5$\u0183\n$\3"+
		"$\3$\3$\3$\3$\5$\u018a\n$\5$\u018c\n$\3$\3$\3$\3$\3$\5$\u0193\n$\5$\u0195"+
		"\n$\3%\3%\5%\u0199\n%\3%\3%\3%\3%\3%\7%\u01a0\n%\f%\16%\u01a3\13%\3%\5"+
		"%\u01a6\n%\3%\5%\u01a9\n%\3&\3&\3&\3&\3&\3&\3&\7&\u01b2\n&\f&\16&\u01b5"+
		"\13&\3&\3&\7&\u01b9\n&\f&\16&\u01bc\13&\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\b\5\2\5\5\23"+
		"\25\27\27\4\2\6\7\17\17\4\2\35\35\'\'\4\2\37\37\"\"\4\2$$&&\6\2\13\13"+
		"\21\21\32\328:\2\u01db\2R\3\2\2\2\4e\3\2\2\2\6m\3\2\2\2\bs\3\2\2\2\nv"+
		"\3\2\2\2\f~\3\2\2\2\16\u009b\3\2\2\2\20\u009d\3\2\2\2\22\u00a8\3\2\2\2"+
		"\24\u00c2\3\2\2\2\26\u00c4\3\2\2\2\30\u00d1\3\2\2\2\32\u00d4\3\2\2\2\34"+
		"\u00d8\3\2\2\2\36\u00dc\3\2\2\2 \u00e4\3\2\2\2\"\u00eb\3\2\2\2$\u00ed"+
		"\3\2\2\2&\u00fa\3\2\2\2(\u0109\3\2\2\2*\u010b\3\2\2\2,\u011f\3\2\2\2."+
		"\u0121\3\2\2\2\60\u0123\3\2\2\2\62\u0125\3\2\2\2\64\u012a\3\2\2\2\66\u0132"+
		"\3\2\2\28\u013a\3\2\2\2:\u0141\3\2\2\2<\u0149\3\2\2\2>\u0156\3\2\2\2@"+
		"\u0165\3\2\2\2B\u0167\3\2\2\2D\u017d\3\2\2\2F\u0194\3\2\2\2H\u0198\3\2"+
		"\2\2J\u01aa\3\2\2\2L\u01bd\3\2\2\2NO\7\22\2\2OP\5\4\3\2PQ\7\61\2\2QS\3"+
		"\2\2\2RN\3\2\2\2RS\3\2\2\2SZ\3\2\2\2TU\7\f\2\2UV\5\4\3\2VW\7\61\2\2WY"+
		"\3\2\2\2XT\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[`\3\2\2\2\\Z\3\2\2\2"+
		"]_\5\6\4\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2"+
		"cd\7\2\2\3d\3\3\2\2\2ej\7\64\2\2fg\7*\2\2gi\7\64\2\2hf\3\2\2\2il\3\2\2"+
		"\2jh\3\2\2\2jk\3\2\2\2k\5\3\2\2\2lj\3\2\2\2mn\5\b\5\2no\5\n\6\2o\7\3\2"+
		"\2\2pr\t\2\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\t\3\2\2\2us\3"+
		"\2\2\2vw\7\b\2\2wz\7\64\2\2xy\7\n\2\2y{\5\4\3\2zx\3\2\2\2z{\3\2\2\2{|"+
		"\3\2\2\2|}\5\f\7\2}\13\3\2\2\2~\u0084\7,\2\2\177\u0080\5\b\5\2\u0080\u0081"+
		"\5\16\b\2\u0081\u0083\3\2\2\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7/\2\2\u0088\r\3\2\2\2\u0089\u008a\7\64\2\2\u008a\u008b"+
		"\5\26\f\2\u008b\u008c\5\20\t\2\u008c\u009c\3\2\2\2\u008d\u0090\7\33\2"+
		"\2\u008e\u0090\5(\25\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\7\64\2\2\u0092\u0095\5\26\f\2\u0093\u0096\5\20\t"+
		"\2\u0094\u0096\7\61\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\u009c\3\2\2\2\u0097\u0098\5(\25\2\u0098\u0099\5\36\20\2\u0099\u009a\7"+
		"\61\2\2\u009a\u009c\3\2\2\2\u009b\u0089\3\2\2\2\u009b\u008f\3\2\2\2\u009b"+
		"\u0097\3\2\2\2\u009c\17\3\2\2\2\u009d\u00a1\7,\2\2\u009e\u00a0\5\22\n"+
		"\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7/\2\2\u00a5"+
		"\21\3\2\2\2\u00a6\u00a9\5\34\17\2\u00a7\u00a9\5\24\13\2\u00a8\u00a6\3"+
		"\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\23\3\2\2\2\u00aa\u00c3\5\20\t\2\u00ab"+
		"\u00ac\7\64\2\2\u00ac\u00ad\7\62\2\2\u00ad\u00c3\5\24\13\2\u00ae\u00af"+
		"\7\r\2\2\u00af\u00b0\5\32\16\2\u00b0\u00b3\5\24\13\2\u00b1\u00b2\7\t\2"+
		"\2\u00b2\u00b4\5\24\13\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00c3\3\2\2\2\u00b5\u00b6\7\34\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8"+
		"\5\24\13\2\u00b8\u00c3\3\2\2\2\u00b9\u00bb\7\26\2\2\u00ba\u00bc\5\60\31"+
		"\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c3"+
		"\7\61\2\2\u00be\u00c3\7\61\2\2\u00bf\u00c0\5.\30\2\u00c0\u00c1\7\61\2"+
		"\2\u00c1\u00c3\3\2\2\2\u00c2\u00aa\3\2\2\2\u00c2\u00ab\3\2\2\2\u00c2\u00ae"+
		"\3\2\2\2\u00c2\u00b5\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2"+
		"\u00bf\3\2\2\2\u00c3\25\3\2\2\2\u00c4\u00cd\7-\2\2\u00c5\u00ca\5\30\r"+
		"\2\u00c6\u00c7\7)\2\2\u00c7\u00c9\5\30\r\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\7.\2\2\u00d0\27\3\2\2\2\u00d1\u00d2\5(\25\2\u00d2\u00d3"+
		"\7\64\2\2\u00d3\31\3\2\2\2\u00d4\u00d5\7-\2\2\u00d5\u00d6\5\60\31\2\u00d6"+
		"\u00d7\7.\2\2\u00d7\33\3\2\2\2\u00d8\u00d9\5(\25\2\u00d9\u00da\5\36\20"+
		"\2\u00da\u00db\7\61\2\2\u00db\35\3\2\2\2\u00dc\u00e1\5 \21\2\u00dd\u00de"+
		"\7)\2\2\u00de\u00e0\5 \21\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\37\3\2\2\2\u00e3\u00e1\3\2\2"+
		"\2\u00e4\u00e7\7\64\2\2\u00e5\u00e6\7\35\2\2\u00e6\u00e8\5\"\22\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8!\3\2\2\2\u00e9\u00ec\5$\23\2"+
		"\u00ea\u00ec\5\60\31\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec#"+
		"\3\2\2\2\u00ed\u00f6\7,\2\2\u00ee\u00f3\5\"\22\2\u00ef\u00f0\7)\2\2\u00f0"+
		"\u00f2\5\"\22\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00ee\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7/"+
		"\2\2\u00f9%\3\2\2\2\u00fa\u0103\7-\2\2\u00fb\u0100\5\60\31\2\u00fc\u00fd"+
		"\7)\2\2\u00fd\u00ff\5\60\31\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2"+
		"\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\7.\2\2\u0106\'\3\2\2\2\u0107\u010a\5,\27\2\u0108\u010a\5*\26\2"+
		"\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a)\3\2\2\2\u010b\u010c\t"+
		"\3\2\2\u010c+\3\2\2\2\u010d\u010e\5*\26\2\u010e\u010f\7+\2\2\u010f\u0114"+
		"\7\60\2\2\u0110\u0111\7+\2\2\u0111\u0113\7\60\2\2\u0112\u0110\3\2\2\2"+
		"\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0120"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011c\5\4\3\2\u0118\u0119\7+\2\2\u0119"+
		"\u011b\7\60\2\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u010d\3\2\2\2\u011f\u0117\3\2\2\2\u0120-\3\2\2\2\u0121\u0122\5\60\31"+
		"\2\u0122/\3\2\2\2\u0123\u0124\5\62\32\2\u0124\61\3\2\2\2\u0125\u0128\5"+
		"\64\33\2\u0126\u0127\t\4\2\2\u0127\u0129\5\62\32\2\u0128\u0126\3\2\2\2"+
		"\u0128\u0129\3\2\2\2\u0129\63\3\2\2\2\u012a\u012f\5\66\34\2\u012b\u012c"+
		"\7!\2\2\u012c\u012e\5\66\34\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\65\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0132\u0137\58\35\2\u0133\u0134\7\36\2\2\u0134\u0136\58\35\2"+
		"\u0135\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\67\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013f\5:\36\2\u013b"+
		"\u013c\t\5\2\2\u013c\u0140\5:\36\2\u013d\u013e\7\16\2\2\u013e\u0140\5"+
		",\27\2\u013f\u013b\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"9\3\2\2\2\u0141\u0146\5<\37\2\u0142\u0143\t\6\2\2\u0143\u0145\5<\37\2"+
		"\u0144\u0142\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147;\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014e\5> \2\u014a\u014b"+
		"\7(\2\2\u014b\u014d\5> \2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f=\3\2\2\2\u0150\u014e\3\2\2\2"+
		"\u0151\u0152\7 \2\2\u0152\u0157\5> \2\u0153\u0154\7$\2\2\u0154\u0157\5"+
		"> \2\u0155\u0157\5@!\2\u0156\u0151\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0155"+
		"\3\2\2\2\u0157?\3\2\2\2\u0158\u0159\7#\2\2\u0159\u0166\5> \2\u015a\u015b"+
		"\7-\2\2\u015b\u015c\5*\26\2\u015c\u015d\7.\2\2\u015d\u015e\5> \2\u015e"+
		"\u0166\3\2\2\2\u015f\u0160\7-\2\2\u0160\u0161\5,\27\2\u0161\u0162\7.\2"+
		"\2\u0162\u0163\5@!\2\u0163\u0166\3\2\2\2\u0164\u0166\5B\"\2\u0165\u0158"+
		"\3\2\2\2\u0165\u015a\3\2\2\2\u0165\u015f\3\2\2\2\u0165\u0164\3\2\2\2\u0166"+
		"A\3\2\2\2\u0167\u016b\5F$\2\u0168\u016a\5D#\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0171\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016e\u0170\7%\2\2\u016f\u016e\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172C\3\2\2\2"+
		"\u0173\u0171\3\2\2\2\u0174\u0175\7*\2\2\u0175\u0177\5\4\3\2\u0176\u0178"+
		"\5&\24\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017e\3\2\2\2\u0179"+
		"\u017a\7+\2\2\u017a\u017b\5\60\31\2\u017b\u017c\7\60\2\2\u017c\u017e\3"+
		"\2\2\2\u017d\u0174\3\2\2\2\u017d\u0179\3\2\2\2\u017eE\3\2\2\2\u017f\u0195"+
		"\5\32\16\2\u0180\u0182\7\31\2\2\u0181\u0183\5&\24\2\u0182\u0181\3\2\2"+
		"\2\u0182\u0183\3\2\2\2\u0183\u0195\3\2\2\2\u0184\u018b\7\30\2\2\u0185"+
		"\u018c\5&\24\2\u0186\u0187\7*\2\2\u0187\u0189\7\64\2\2\u0188\u018a\5&"+
		"\24\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b"+
		"\u0185\3\2\2\2\u018b\u0186\3\2\2\2\u018c\u0195\3\2\2\2\u018d\u0195\5L"+
		"\'\2\u018e\u018f\7\20\2\2\u018f\u0195\5H%\2\u0190\u0192\5\4\3\2\u0191"+
		"\u0193\5&\24\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2"+
		"\2\2\u0194\u017f\3\2\2\2\u0194\u0180\3\2\2\2\u0194\u0184\3\2\2\2\u0194"+
		"\u018d\3\2\2\2\u0194\u018e\3\2\2\2\u0194\u0190\3\2\2\2\u0195G\3\2\2\2"+
		"\u0196\u0199\5*\26\2\u0197\u0199\5\4\3\2\u0198\u0196\3\2\2\2\u0198\u0197"+
		"\3\2\2\2\u0199\u01a8\3\2\2\2\u019a\u01a9\5&\24\2\u019b\u019c\7+\2\2\u019c"+
		"\u01a1\7\60\2\2\u019d\u019e\7+\2\2\u019e\u01a0\7\60\2\2\u019f\u019d\3"+
		"\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a6\5$\23\2\u01a5\u01a4\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a9\5J&\2\u01a8\u019a"+
		"\3\2\2\2\u01a8\u019b\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9I\3\2\2\2\u01aa"+
		"\u01ab\7+\2\2\u01ab\u01ac\5\60\31\2\u01ac\u01b3\7\60\2\2\u01ad\u01ae\7"+
		"+\2\2\u01ae\u01af\5\60\31\2\u01af\u01b0\7\60\2\2\u01b0\u01b2\3\2\2\2\u01b1"+
		"\u01ad\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01ba\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\7+\2\2\u01b7"+
		"\u01b9\7\60\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3"+
		"\2\2\2\u01ba\u01bb\3\2\2\2\u01bbK\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be"+
		"\t\7\2\2\u01beM\3\2\2\2\65RZ`jsz\u0084\u008f\u0095\u009b\u00a1\u00a8\u00b3"+
		"\u00bb\u00c2\u00ca\u00cd\u00e1\u00e7\u00eb\u00f3\u00f6\u0100\u0103\u0109"+
		"\u0114\u011c\u011f\u0128\u012f\u0137\u013f\u0146\u014e\u0156\u0165\u016b"+
		"\u0171\u0177\u017d\u0182\u0189\u018b\u0192\u0194\u0198\u01a1\u01a5\u01a8"+
		"\u01b3\u01ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
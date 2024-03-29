// Generated from /home/marcio/Documentos/UFLA/2019_2/compiladores/TP/TP_Compiladores/jmm_parser/src/main/resources/JMMParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JMMParserLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ID_STARTSWITHDIGIT_ERROR", "INT_STARTSWITHZERO_ERROR", "ABS", "BOOL", 
		"CHAR", "CLAS", "ELSE", "EXTE", "FALS", "IMPO", "IF", "INST", "INT", "NEW", 
		"NULL", "PACK", "PRIV", "PROT", "PUBL", "RETU", "STAT", "SUPE", "THIS", 
		"TRUE", "VOID", "WHIL", "OPIGUAL", "OPATRIB", "OPMAIOR", "OPMAISM", "OPAND", 
		"OPMENOI", "OPDIFEF", "OPSUBTR", "OPMENOSM", "OPSOMA", "OPMAISI", "OPASTE", 
		"SEVIRG", "SEPONTO", "SEACOLC", "SEACHAV", "SEAPARE", "SEFPARE", "SEFCHAV", 
		"SEFCOLC", "SEPONTOEVIRG", "SEDOISPONTOS", "RESERVED_WORD", "ID", "LETRA", 
		"DIGITO", "OPERATORS", "ESPACO", "NL", "COMENTARIO", "INTLITE", "CHARLITERAL", 
		"SRINGLITERAL", "MULTIOPERATOR_ERROR", "UNKNOWN_CHARACTER_ERROR"
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


	public JMMParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JMMParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01e9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\6\2\177\n\2\r\2\16\2\u0080\3\2\6\2\u0084\n\2\r\2\16\2\u0085"+
		"\3\3\3\3\6\3\u008a\n\3\r\3\16\3\u008b\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0189\n\62\3\63\3\63"+
		"\5\63\u018d\n\63\3\63\3\63\3\63\7\63\u0192\n\63\f\63\16\63\u0195\13\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01ac\n\66\3\67\6\67\u01af\n"+
		"\67\r\67\16\67\u01b0\3\67\3\67\38\38\38\38\58\u01b9\n8\38\38\39\39\39"+
		"\39\79\u01c1\n9\f9\169\u01c4\139\39\39\3:\5:\u01c9\n:\3:\7:\u01cc\n:\f"+
		":\16:\u01cf\13:\3;\3;\3;\5;\u01d4\n;\3;\3;\3<\3<\3<\7<\u01db\n<\f<\16"+
		"<\u01de\13<\3<\3<\3=\3=\6=\u01e4\n=\r=\16=\u01e5\3>\3>\2\2?\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2k\2m\65o\66q\67s8"+
		"u9w:y;{<\3\2\n\4\2&&aa\4\2C\\c|\4\2##//\4\2\16\16\"\"\5\2\n\f\16\17))"+
		"\4\2\f\f\17\17\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\2\u022b\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3~\3\2\2\2\5\u0087\3\2\2\2\7\u008d\3"+
		"\2\2\2\t\u0096\3\2\2\2\13\u009e\3\2\2\2\r\u00a3\3\2\2\2\17\u00a9\3\2\2"+
		"\2\21\u00ae\3\2\2\2\23\u00b6\3\2\2\2\25\u00bc\3\2\2\2\27\u00c3\3\2\2\2"+
		"\31\u00c6\3\2\2\2\33\u00d1\3\2\2\2\35\u00d5\3\2\2\2\37\u00d9\3\2\2\2!"+
		"\u00de\3\2\2\2#\u00e6\3\2\2\2%\u00ee\3\2\2\2\'\u00f8\3\2\2\2)\u00ff\3"+
		"\2\2\2+\u0106\3\2\2\2-\u010d\3\2\2\2/\u0113\3\2\2\2\61\u0118\3\2\2\2\63"+
		"\u011d\3\2\2\2\65\u0122\3\2\2\2\67\u0128\3\2\2\29\u012a\3\2\2\2;\u012d"+
		"\3\2\2\2=\u012f\3\2\2\2?\u0132\3\2\2\2A\u0135\3\2\2\2C\u0138\3\2\2\2E"+
		"\u013a\3\2\2\2G\u013c\3\2\2\2I\u013f\3\2\2\2K\u0141\3\2\2\2M\u0144\3\2"+
		"\2\2O\u0146\3\2\2\2Q\u0148\3\2\2\2S\u014a\3\2\2\2U\u014c\3\2\2\2W\u014e"+
		"\3\2\2\2Y\u0150\3\2\2\2[\u0152\3\2\2\2]\u0154\3\2\2\2_\u0156\3\2\2\2a"+
		"\u0158\3\2\2\2c\u0188\3\2\2\2e\u018c\3\2\2\2g\u0196\3\2\2\2i\u0198\3\2"+
		"\2\2k\u01ab\3\2\2\2m\u01ae\3\2\2\2o\u01b8\3\2\2\2q\u01bc\3\2\2\2s\u01c8"+
		"\3\2\2\2u\u01d0\3\2\2\2w\u01d7\3\2\2\2y\u01e1\3\2\2\2{\u01e7\3\2\2\2}"+
		"\177\5i\65\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\5g\64\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\4\3\2\2\2"+
		"\u0087\u0089\7\62\2\2\u0088\u008a\5i\65\2\u0089\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\6\3\2\2\2\u008d"+
		"\u008e\7c\2\2\u008e\u008f\7d\2\2\u008f\u0090\7u\2\2\u0090\u0091\7v\2\2"+
		"\u0091\u0092\7t\2\2\u0092\u0093\7c\2\2\u0093\u0094\7e\2\2\u0094\u0095"+
		"\7v\2\2\u0095\b\3\2\2\2\u0096\u0097\7d\2\2\u0097\u0098\7q\2\2\u0098\u0099"+
		"\7q\2\2\u0099\u009a\7n\2\2\u009a\u009b\7g\2\2\u009b\u009c\7c\2\2\u009c"+
		"\u009d\7p\2\2\u009d\n\3\2\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7j\2\2\u00a0"+
		"\u00a1\7c\2\2\u00a1\u00a2\7t\2\2\u00a2\f\3\2\2\2\u00a3\u00a4\7e\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7u\2\2"+
		"\u00a8\16\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7"+
		"u\2\2\u00ac\u00ad\7g\2\2\u00ad\20\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7z\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7p\2\2\u00b3"+
		"\u00b4\7f\2\2\u00b4\u00b5\7u\2\2\u00b5\22\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7"+
		"\u00b8\7c\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2"+
		"\u00bb\24\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7o\2\2\u00be\u00bf\7"+
		"r\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7v\2\2\u00c2\26"+
		"\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7h\2\2\u00c5\30\3\2\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7v\2\2"+
		"\u00ca\u00cb\7c\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7h\2\2\u00d0\32\3\2\2\2\u00d1\u00d2"+
		"\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7v\2\2\u00d4\34\3\2\2\2\u00d5\u00d6"+
		"\7p\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7y\2\2\u00d8\36\3\2\2\2\u00d9\u00da"+
		"\7p\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7n\2\2\u00dd"+
		" \3\2\2\2\u00de\u00df\7r\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7e\2\2\u00e1"+
		"\u00e2\7m\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7i\2\2\u00e4\u00e5\7g\2\2"+
		"\u00e5\"\3\2\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7k"+
		"\2\2\u00e9\u00ea\7x\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed"+
		"\7g\2\2\u00ed$\3\2\2\2\u00ee\u00ef\7r\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1"+
		"\7q\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7e\2\2\u00f4"+
		"\u00f5\7v\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7f\2\2\u00f7&\3\2\2\2\u00f8"+
		"\u00f9\7r\2\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7d\2\2\u00fb\u00fc\7n\2\2"+
		"\u00fc\u00fd\7k\2\2\u00fd\u00fe\7e\2\2\u00fe(\3\2\2\2\u00ff\u0100\7t\2"+
		"\2\u0100\u0101\7g\2\2\u0101\u0102\7v\2\2\u0102\u0103\7w\2\2\u0103\u0104"+
		"\7t\2\2\u0104\u0105\7p\2\2\u0105*\3\2\2\2\u0106\u0107\7u\2\2\u0107\u0108"+
		"\7v\2\2\u0108\u0109\7c\2\2\u0109\u010a\7v\2\2\u010a\u010b\7k\2\2\u010b"+
		"\u010c\7e\2\2\u010c,\3\2\2\2\u010d\u010e\7u\2\2\u010e\u010f\7w\2\2\u010f"+
		"\u0110\7r\2\2\u0110\u0111\7g\2\2\u0111\u0112\7t\2\2\u0112.\3\2\2\2\u0113"+
		"\u0114\7v\2\2\u0114\u0115\7j\2\2\u0115\u0116\7k\2\2\u0116\u0117\7u\2\2"+
		"\u0117\60\3\2\2\2\u0118\u0119\7v\2\2\u0119\u011a\7t\2\2\u011a\u011b\7"+
		"w\2\2\u011b\u011c\7g\2\2\u011c\62\3\2\2\2\u011d\u011e\7x\2\2\u011e\u011f"+
		"\7q\2\2\u011f\u0120\7k\2\2\u0120\u0121\7f\2\2\u0121\64\3\2\2\2\u0122\u0123"+
		"\7y\2\2\u0123\u0124\7j\2\2\u0124\u0125\7k\2\2\u0125\u0126\7n\2\2\u0126"+
		"\u0127\7g\2\2\u0127\66\3\2\2\2\u0128\u0129\7?\2\2\u01298\3\2\2\2\u012a"+
		"\u012b\7?\2\2\u012b\u012c\7?\2\2\u012c:\3\2\2\2\u012d\u012e\7@\2\2\u012e"+
		"<\3\2\2\2\u012f\u0130\7-\2\2\u0130\u0131\7-\2\2\u0131>\3\2\2\2\u0132\u0133"+
		"\7(\2\2\u0133\u0134\7(\2\2\u0134@\3\2\2\2\u0135\u0136\7>\2\2\u0136\u0137"+
		"\7?\2\2\u0137B\3\2\2\2\u0138\u0139\7#\2\2\u0139D\3\2\2\2\u013a\u013b\7"+
		"/\2\2\u013bF\3\2\2\2\u013c\u013d\7/\2\2\u013d\u013e\7/\2\2\u013eH\3\2"+
		"\2\2\u013f\u0140\7-\2\2\u0140J\3\2\2\2\u0141\u0142\7-\2\2\u0142\u0143"+
		"\7?\2\2\u0143L\3\2\2\2\u0144\u0145\7,\2\2\u0145N\3\2\2\2\u0146\u0147\7"+
		".\2\2\u0147P\3\2\2\2\u0148\u0149\7\60\2\2\u0149R\3\2\2\2\u014a\u014b\7"+
		"]\2\2\u014bT\3\2\2\2\u014c\u014d\7}\2\2\u014dV\3\2\2\2\u014e\u014f\7*"+
		"\2\2\u014fX\3\2\2\2\u0150\u0151\7+\2\2\u0151Z\3\2\2\2\u0152\u0153\7\177"+
		"\2\2\u0153\\\3\2\2\2\u0154\u0155\7_\2\2\u0155^\3\2\2\2\u0156\u0157\7="+
		"\2\2\u0157`\3\2\2\2\u0158\u0159\7<\2\2\u0159b\3\2\2\2\u015a\u0189\5\7"+
		"\4\2\u015b\u0189\5\t\5\2\u015c\u0189\5\13\6\2\u015d\u0189\5\r\7\2\u015e"+
		"\u0189\5\17\b\2\u015f\u0189\5\21\t\2\u0160\u0189\5\23\n\2\u0161\u0189"+
		"\5\25\13\2\u0162\u0189\5\27\f\2\u0163\u0189\5\31\r\2\u0164\u0189\5\33"+
		"\16\2\u0165\u0189\5\35\17\2\u0166\u0189\5\37\20\2\u0167\u0189\5!\21\2"+
		"\u0168\u0189\5#\22\2\u0169\u0189\5%\23\2\u016a\u0189\5\'\24\2\u016b\u0189"+
		"\5)\25\2\u016c\u0189\5+\26\2\u016d\u0189\5-\27\2\u016e\u0189\5/\30\2\u016f"+
		"\u0189\5\61\31\2\u0170\u0189\5\63\32\2\u0171\u0189\5\65\33\2\u0172\u0189"+
		"\5\67\34\2\u0173\u0189\59\35\2\u0174\u0189\5;\36\2\u0175\u0189\5=\37\2"+
		"\u0176\u0189\5? \2\u0177\u0189\5A!\2\u0178\u0189\5C\"\2\u0179\u0189\5"+
		"E#\2\u017a\u0189\5G$\2\u017b\u0189\5I%\2\u017c\u0189\5K&\2\u017d\u0189"+
		"\5M\'\2\u017e\u0189\5O(\2\u017f\u0189\5Q)\2\u0180\u0189\5S*\2\u0181\u0189"+
		"\5U+\2\u0182\u0189\5W,\2\u0183\u0189\5Y-\2\u0184\u0189\5[.\2\u0185\u0189"+
		"\5]/\2\u0186\u0189\5_\60\2\u0187\u0189\5a\61\2\u0188\u015a\3\2\2\2\u0188"+
		"\u015b\3\2\2\2\u0188\u015c\3\2\2\2\u0188\u015d\3\2\2\2\u0188\u015e\3\2"+
		"\2\2\u0188\u015f\3\2\2\2\u0188\u0160\3\2\2\2\u0188\u0161\3\2\2\2\u0188"+
		"\u0162\3\2\2\2\u0188\u0163\3\2\2\2\u0188\u0164\3\2\2\2\u0188\u0165\3\2"+
		"\2\2\u0188\u0166\3\2\2\2\u0188\u0167\3\2\2\2\u0188\u0168\3\2\2\2\u0188"+
		"\u0169\3\2\2\2\u0188\u016a\3\2\2\2\u0188\u016b\3\2\2\2\u0188\u016c\3\2"+
		"\2\2\u0188\u016d\3\2\2\2\u0188\u016e\3\2\2\2\u0188\u016f\3\2\2\2\u0188"+
		"\u0170\3\2\2\2\u0188\u0171\3\2\2\2\u0188\u0172\3\2\2\2\u0188\u0173\3\2"+
		"\2\2\u0188\u0174\3\2\2\2\u0188\u0175\3\2\2\2\u0188\u0176\3\2\2\2\u0188"+
		"\u0177\3\2\2\2\u0188\u0178\3\2\2\2\u0188\u0179\3\2\2\2\u0188\u017a\3\2"+
		"\2\2\u0188\u017b\3\2\2\2\u0188\u017c\3\2\2\2\u0188\u017d\3\2\2\2\u0188"+
		"\u017e\3\2\2\2\u0188\u017f\3\2\2\2\u0188\u0180\3\2\2\2\u0188\u0181\3\2"+
		"\2\2\u0188\u0182\3\2\2\2\u0188\u0183\3\2\2\2\u0188\u0184\3\2\2\2\u0188"+
		"\u0185\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189d\3\2\2\2"+
		"\u018a\u018d\5g\64\2\u018b\u018d\t\2\2\2\u018c\u018a\3\2\2\2\u018c\u018b"+
		"\3\2\2\2\u018d\u0193\3\2\2\2\u018e\u0192\5g\64\2\u018f\u0192\5i\65\2\u0190"+
		"\u0192\t\2\2\2\u0191\u018e\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2"+
		"\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"f\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\t\3\2\2\u0197h\3\2\2\2\u0198"+
		"\u0199\4\62;\2\u0199j\3\2\2\2\u019a\u01ac\7?\2\2\u019b\u019c\7?\2\2\u019c"+
		"\u01ac\7?\2\2\u019d\u01ac\7@\2\2\u019e\u019f\7-\2\2\u019f\u01ac\7-\2\2"+
		"\u01a0\u01a1\7(\2\2\u01a1\u01ac\7(\2\2\u01a2\u01a3\7>\2\2\u01a3\u01ac"+
		"\7?\2\2\u01a4\u01ac\t\4\2\2\u01a5\u01a6\7/\2\2\u01a6\u01ac\7/\2\2\u01a7"+
		"\u01ac\7-\2\2\u01a8\u01a9\7-\2\2\u01a9\u01ac\7?\2\2\u01aa\u01ac\7,\2\2"+
		"\u01ab\u019a\3\2\2\2\u01ab\u019b\3\2\2\2\u01ab\u019d\3\2\2\2\u01ab\u019e"+
		"\3\2\2\2\u01ab\u01a0\3\2\2\2\u01ab\u01a2\3\2\2\2\u01ab\u01a4\3\2\2\2\u01ab"+
		"\u01a5\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01aa\3\2"+
		"\2\2\u01acl\3\2\2\2\u01ad\u01af\t\5\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b3\b\67\2\2\u01b3n\3\2\2\2\u01b4\u01b9\t\6\2\2\u01b5\u01b6\7\"\2\2"+
		"\u01b6\u01b7\7^\2\2\u01b7\u01b9\7\"\2\2\u01b8\u01b4\3\2\2\2\u01b8\u01b5"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\b8\2\2\u01bbp\3\2\2\2\u01bc\u01bd"+
		"\7\61\2\2\u01bd\u01be\7\61\2\2\u01be\u01c2\3\2\2\2\u01bf\u01c1\n\7\2\2"+
		"\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3"+
		"\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\b9\2\2\u01c6"+
		"r\3\2\2\2\u01c7\u01c9\4\62;\2\u01c8\u01c7\3\2\2\2\u01c9\u01cd\3\2\2\2"+
		"\u01ca\u01cc\5i\65\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb"+
		"\3\2\2\2\u01cd\u01ce\3\2\2\2\u01cet\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0"+
		"\u01d3\7)\2\2\u01d1\u01d4\5o8\2\u01d2\u01d4\n\b\2\2\u01d3\u01d1\3\2\2"+
		"\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\7)\2\2\u01d6v\3"+
		"\2\2\2\u01d7\u01dc\7$\2\2\u01d8\u01db\5o8\2\u01d9\u01db\n\t\2\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2"+
		"\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01e0\7$\2\2\u01e0x\3\2\2\2\u01e1\u01e3\5k\66\2\u01e2\u01e4\5k\66\2\u01e3"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6z\3\2\2\2\u01e7\u01e8\4\17\u0080\2\u01e8|\3\2\2\2\24\2\u0080"+
		"\u0085\u008b\u0188\u018c\u0191\u0193\u01ab\u01b0\u01b8\u01c2\u01c8\u01cd"+
		"\u01d3\u01da\u01dc\u01e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
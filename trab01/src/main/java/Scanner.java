// Generated from C:/Users/gofre/IdeaProjects/trab01/src\Scanner.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID_ERROR=1, OP_ERROR=2, REAL_ERROR=3, ABS=4, BOOL=5, CHAR=6, CLAS=7, ELSE=8, 
		EXTE=9, FALS=10, IMPO=11, IF=12, INST=13, INT=14, NEW=15, NULL=16, PACK=17, 
		PRIV=18, PROT=19, PUBL=20, RETU=21, STAT=22, SUPE=23, THIS=24, TRUE=25, 
		VOID=26, WHIL=27, OPIGUAL=28, OPATRIB=29, OPMAIOR=30, OPMAISM=31, OPAND=32, 
		OPMENOI=33, OPDIFEF=34, OPSUBTR=35, OPMENOSM=36, OPSOMA=37, OPMAISI=38, 
		OPASTE=39, SEVIRG=40, SEPONTO=41, SEACOLC=42, SEACHAV=43, SEAPARE=44, 
		SEFPARE=45, SEFCHAV=46, SEFCOLC=47, SEDOISP=48, ID=49, ESPACO=50, NL=51, 
		COMENTARIO=52, INTLITE=53, CHARLITERAL=54, SRINGLITERAL=55, GERAL_ERROR2=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID_ERROR", "OP_ERROR", "REAL_ERROR", "ABS", "BOOL", "CHAR", "CLAS", 
			"ELSE", "EXTE", "FALS", "IMPO", "IF", "INST", "INT", "NEW", "NULL", "PACK", 
			"PRIV", "PROT", "PUBL", "RETU", "STAT", "SUPE", "THIS", "TRUE", "VOID", 
			"WHIL", "OPIGUAL", "OPATRIB", "OPMAIOR", "OPMAISM", "OPAND", "OPMENOI", 
			"OPDIFEF", "OPSUBTR", "OPMENOSM", "OPSOMA", "OPMAISI", "OPASTE", "SEVIRG", 
			"SEPONTO", "SEACOLC", "SEACHAV", "SEAPARE", "SEFPARE", "SEFCHAV", "SEFCOLC", 
			"SEDOISP", "ID", "LETRA", "DIGITO", "OPERATORS", "ESPACO", "NL", "COMENTARIO", 
			"INTLITE", "CHARLITERAL", "SRINGLITERAL", "GERAL_ERROR2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'abstract'", "'boolean'", "'char'", "'class'", 
			"'else'", "'extends'", "'false'", "'import'", "'if'", "'instanceof'", 
			"'int'", "'new'", "'null'", "'package'", "'private'", "'protected'", 
			"'public'", "'return'", "'static'", "'super'", "'this'", "'true'", "'void'", 
			"'while'", "'='", "'=='", "'>'", "'++'", "'&&'", "'<='", "'!'", "'-'", 
			"'--'", "'+'", "'+='", "'*'", "','", "'.'", "'['", "'{'", "'('", "')'", 
			"'}'", "']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID_ERROR", "OP_ERROR", "REAL_ERROR", "ABS", "BOOL", "CHAR", "CLAS", 
			"ELSE", "EXTE", "FALS", "IMPO", "IF", "INST", "INT", "NEW", "NULL", "PACK", 
			"PRIV", "PROT", "PUBL", "RETU", "STAT", "SUPE", "THIS", "TRUE", "VOID", 
			"WHIL", "OPIGUAL", "OPATRIB", "OPMAIOR", "OPMAISM", "OPAND", "OPMENOI", 
			"OPDIFEF", "OPSUBTR", "OPMENOSM", "OPSOMA", "OPMAISI", "OPASTE", "SEVIRG", 
			"SEPONTO", "SEACOLC", "SEACHAV", "SEAPARE", "SEFPARE", "SEFCHAV", "SEFCOLC", 
			"SEDOISP", "ID", "ESPACO", "NL", "COMENTARIO", "INTLITE", "CHARLITERAL", 
			"SRINGLITERAL", "GERAL_ERROR2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\6"+
		"\2{\n\2\r\2\16\2|\3\2\6\2\u0080\n\2\r\2\16\2\u0081\3\3\3\3\6\3\u0086\n"+
		"\3\r\3\16\3\u0087\3\4\3\4\6\4\u008c\n\4\r\4\16\4\u008d\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\5\62\u015d\n\62\3"+
		"\62\3\62\3\62\7\62\u0162\n\62\f\62\16\62\u0165\13\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\5\65\u017c\n\65\3\66\6\66\u017f\n\66\r\66\16\66\u0180"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u0189\n\67\3\67\3\67\38\38\38\38\7"+
		"8\u0191\n8\f8\168\u0194\138\38\38\39\59\u0199\n9\39\79\u019c\n9\f9\16"+
		"9\u019f\139\3:\3:\3:\5:\u01a4\n:\3:\3:\3;\3;\3;\7;\u01ab\n;\f;\16;\u01ae"+
		"\13;\3;\3;\3<\3<\2\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\2g\2i\2k\64m\65o\66q\67s8u9w:\3\2\n\4\2&&aa\4\2C\\c|\4\2##//\4\2\16"+
		"\16\"\"\5\2\n\f\16\17))\4\2\f\f\17\17\6\2\f\f\17\17))^^\6\2\f\f\17\17"+
		"$$^^\2\u01c8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3z\3\2\2\2\5\u0083\3\2\2\2\7\u0089"+
		"\3\2\2\2\t\u008f\3\2\2\2\13\u0098\3\2\2\2\r\u00a0\3\2\2\2\17\u00a5\3\2"+
		"\2\2\21\u00ab\3\2\2\2\23\u00b0\3\2\2\2\25\u00b8\3\2\2\2\27\u00be\3\2\2"+
		"\2\31\u00c5\3\2\2\2\33\u00c8\3\2\2\2\35\u00d3\3\2\2\2\37\u00d7\3\2\2\2"+
		"!\u00db\3\2\2\2#\u00e0\3\2\2\2%\u00e8\3\2\2\2\'\u00f0\3\2\2\2)\u00fa\3"+
		"\2\2\2+\u0101\3\2\2\2-\u0108\3\2\2\2/\u010f\3\2\2\2\61\u0115\3\2\2\2\63"+
		"\u011a\3\2\2\2\65\u011f\3\2\2\2\67\u0124\3\2\2\29\u012a\3\2\2\2;\u012c"+
		"\3\2\2\2=\u012f\3\2\2\2?\u0131\3\2\2\2A\u0134\3\2\2\2C\u0137\3\2\2\2E"+
		"\u013a\3\2\2\2G\u013c\3\2\2\2I\u013e\3\2\2\2K\u0141\3\2\2\2M\u0143\3\2"+
		"\2\2O\u0146\3\2\2\2Q\u0148\3\2\2\2S\u014a\3\2\2\2U\u014c\3\2\2\2W\u014e"+
		"\3\2\2\2Y\u0150\3\2\2\2[\u0152\3\2\2\2]\u0154\3\2\2\2_\u0156\3\2\2\2a"+
		"\u0158\3\2\2\2c\u015c\3\2\2\2e\u0166\3\2\2\2g\u0168\3\2\2\2i\u017b\3\2"+
		"\2\2k\u017e\3\2\2\2m\u0188\3\2\2\2o\u018c\3\2\2\2q\u0198\3\2\2\2s\u01a0"+
		"\3\2\2\2u\u01a7\3\2\2\2w\u01b1\3\2\2\2y{\5g\64\2zy\3\2\2\2{|\3\2\2\2|"+
		"z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080\5e\63\2\177~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\4\3\2\2\2\u0083\u0085"+
		"\5i\65\2\u0084\u0086\5i\65\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\6\3\2\2\2\u0089\u008b\7\62\2"+
		"\2\u008a\u008c\5g\64\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\b\3\2\2\2\u008f\u0090\7c\2\2\u0090"+
		"\u0091\7d\2\2\u0091\u0092\7u\2\2\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2"+
		"\u0094\u0095\7c\2\2\u0095\u0096\7e\2\2\u0096\u0097\7v\2\2\u0097\n\3\2"+
		"\2\2\u0098\u0099\7d\2\2\u0099\u009a\7q\2\2\u009a\u009b\7q\2\2\u009b\u009c"+
		"\7n\2\2\u009c\u009d\7g\2\2\u009d\u009e\7c\2\2\u009e\u009f\7p\2\2\u009f"+
		"\f\3\2\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4\16\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"\u00a8\7c\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7u\2\2\u00aa\20\3\2\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2"+
		"\u00af\22\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7z\2\2\u00b2\u00b3\7"+
		"v\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7"+
		"\7u\2\2\u00b7\24\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb"+
		"\7n\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2\u00bd\26\3\2\2\2\u00be\u00bf"+
		"\7k\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1\7r\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7t\2\2\u00c3\u00c4\7v\2\2\u00c4\30\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6"+
		"\u00c7\7h\2\2\u00c7\32\3\2\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7p\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7p\2\2"+
		"\u00ce\u00cf\7e\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2"+
		"\7h\2\2\u00d2\34\3\2\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6"+
		"\7v\2\2\u00d6\36\3\2\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da"+
		"\7y\2\2\u00da \3\2\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de"+
		"\7n\2\2\u00de\u00df\7n\2\2\u00df\"\3\2\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2"+
		"\7c\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7m\2\2\u00e4\u00e5\7c\2\2\u00e5"+
		"\u00e6\7i\2\2\u00e6\u00e7\7g\2\2\u00e7$\3\2\2\2\u00e8\u00e9\7r\2\2\u00e9"+
		"\u00ea\7t\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7x\2\2\u00ec\u00ed\7c\2\2"+
		"\u00ed\u00ee\7v\2\2\u00ee\u00ef\7g\2\2\u00ef&\3\2\2\2\u00f0\u00f1\7r\2"+
		"\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5"+
		"\7g\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7g\2\2\u00f8"+
		"\u00f9\7f\2\2\u00f9(\3\2\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7w\2\2\u00fc"+
		"\u00fd\7d\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7e\2\2"+
		"\u0100*\3\2\2\2\u0101\u0102\7t\2\2\u0102\u0103\7g\2\2\u0103\u0104\7v\2"+
		"\2\u0104\u0105\7w\2\2\u0105\u0106\7t\2\2\u0106\u0107\7p\2\2\u0107,\3\2"+
		"\2\2\u0108\u0109\7u\2\2\u0109\u010a\7v\2\2\u010a\u010b\7c\2\2\u010b\u010c"+
		"\7v\2\2\u010c\u010d\7k\2\2\u010d\u010e\7e\2\2\u010e.\3\2\2\2\u010f\u0110"+
		"\7u\2\2\u0110\u0111\7w\2\2\u0111\u0112\7r\2\2\u0112\u0113\7g\2\2\u0113"+
		"\u0114\7t\2\2\u0114\60\3\2\2\2\u0115\u0116\7v\2\2\u0116\u0117\7j\2\2\u0117"+
		"\u0118\7k\2\2\u0118\u0119\7u\2\2\u0119\62\3\2\2\2\u011a\u011b\7v\2\2\u011b"+
		"\u011c\7t\2\2\u011c\u011d\7w\2\2\u011d\u011e\7g\2\2\u011e\64\3\2\2\2\u011f"+
		"\u0120\7x\2\2\u0120\u0121\7q\2\2\u0121\u0122\7k\2\2\u0122\u0123\7f\2\2"+
		"\u0123\66\3\2\2\2\u0124\u0125\7y\2\2\u0125\u0126\7j\2\2\u0126\u0127\7"+
		"k\2\2\u0127\u0128\7n\2\2\u0128\u0129\7g\2\2\u01298\3\2\2\2\u012a\u012b"+
		"\7?\2\2\u012b:\3\2\2\2\u012c\u012d\7?\2\2\u012d\u012e\7?\2\2\u012e<\3"+
		"\2\2\2\u012f\u0130\7@\2\2\u0130>\3\2\2\2\u0131\u0132\7-\2\2\u0132\u0133"+
		"\7-\2\2\u0133@\3\2\2\2\u0134\u0135\7(\2\2\u0135\u0136\7(\2\2\u0136B\3"+
		"\2\2\2\u0137\u0138\7>\2\2\u0138\u0139\7?\2\2\u0139D\3\2\2\2\u013a\u013b"+
		"\7#\2\2\u013bF\3\2\2\2\u013c\u013d\7/\2\2\u013dH\3\2\2\2\u013e\u013f\7"+
		"/\2\2\u013f\u0140\7/\2\2\u0140J\3\2\2\2\u0141\u0142\7-\2\2\u0142L\3\2"+
		"\2\2\u0143\u0144\7-\2\2\u0144\u0145\7?\2\2\u0145N\3\2\2\2\u0146\u0147"+
		"\7,\2\2\u0147P\3\2\2\2\u0148\u0149\7.\2\2\u0149R\3\2\2\2\u014a\u014b\7"+
		"\60\2\2\u014bT\3\2\2\2\u014c\u014d\7]\2\2\u014dV\3\2\2\2\u014e\u014f\7"+
		"}\2\2\u014fX\3\2\2\2\u0150\u0151\7*\2\2\u0151Z\3\2\2\2\u0152\u0153\7+"+
		"\2\2\u0153\\\3\2\2\2\u0154\u0155\7\177\2\2\u0155^\3\2\2\2\u0156\u0157"+
		"\7_\2\2\u0157`\3\2\2\2\u0158\u0159\7=\2\2\u0159b\3\2\2\2\u015a\u015d\5"+
		"e\63\2\u015b\u015d\t\2\2\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d"+
		"\u0163\3\2\2\2\u015e\u0162\5e\63\2\u015f\u0162\5g\64\2\u0160\u0162\t\2"+
		"\2\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164d\3\2\2\2"+
		"\u0165\u0163\3\2\2\2\u0166\u0167\t\3\2\2\u0167f\3\2\2\2\u0168\u0169\4"+
		"\62;\2\u0169h\3\2\2\2\u016a\u017c\7?\2\2\u016b\u016c\7?\2\2\u016c\u017c"+
		"\7?\2\2\u016d\u017c\7@\2\2\u016e\u016f\7-\2\2\u016f\u017c\7-\2\2\u0170"+
		"\u0171\7(\2\2\u0171\u017c\7(\2\2\u0172\u0173\7>\2\2\u0173\u017c\7?\2\2"+
		"\u0174\u017c\t\4\2\2\u0175\u0176\7/\2\2\u0176\u017c\7/\2\2\u0177\u017c"+
		"\7-\2\2\u0178\u0179\7-\2\2\u0179\u017c\7?\2\2\u017a\u017c\7,\2\2\u017b"+
		"\u016a\3\2\2\2\u017b\u016b\3\2\2\2\u017b\u016d\3\2\2\2\u017b\u016e\3\2"+
		"\2\2\u017b\u0170\3\2\2\2\u017b\u0172\3\2\2\2\u017b\u0174\3\2\2\2\u017b"+
		"\u0175\3\2\2\2\u017b\u0177\3\2\2\2\u017b\u0178\3\2\2\2\u017b\u017a\3\2"+
		"\2\2\u017cj\3\2\2\2\u017d\u017f\t\5\2\2\u017e\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\b\66\2\2\u0183l\3\2\2\2\u0184\u0189\t\6\2\2\u0185\u0186\7\"\2\2"+
		"\u0186\u0187\7^\2\2\u0187\u0189\7\"\2\2\u0188\u0184\3\2\2\2\u0188\u0185"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\b\67\2\2\u018bn\3\2\2\2\u018c"+
		"\u018d\7\61\2\2\u018d\u018e\7\61\2\2\u018e\u0192\3\2\2\2\u018f\u0191\n"+
		"\7\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\b8"+
		"\2\2\u0196p\3\2\2\2\u0197\u0199\4\62;\2\u0198\u0197\3\2\2\2\u0199\u019d"+
		"\3\2\2\2\u019a\u019c\5g\64\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019er\3\2\2\2\u019f\u019d\3\2\2\2"+
		"\u01a0\u01a3\7)\2\2\u01a1\u01a4\5m\67\2\u01a2\u01a4\n\b\2\2\u01a3\u01a1"+
		"\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7)\2\2\u01a6"+
		"t\3\2\2\2\u01a7\u01ac\3\2\2\2\u01a8\u01ab\5m\67\2\u01a9\u01ab\n\t\2\2"+
		"\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af"+
		"\u01b0\7$\2\2\u01b0v\3\2\2\2\u01b1\u01b2\4\17\u0080\2\u01b2x\3\2\2\2\23"+
		"\2|\u0081\u0087\u008d\u015c\u0161\u0163\u017b\u0180\u0188\u0192\u0198"+
		"\u019d\u01a3\u01aa\u01ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
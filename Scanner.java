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
		Numero=1, ESPACO=2, ABS=3, BOOL=4, CHAR=5, CLAS=6, ELSE=7, EXTE=8, FALS=9, 
		IMPO=10, IF=11, INST=12, INT=13, NEW=14, NULL=15, PACK=16, PRIV=17, PROT=18, 
		PUBL=19, RETU=20, STAT=21, SUPE=22, THIS=23, TRUE=24, VOID=25, WHIL=26, 
		OPIGUAL=27, OPATRIB=28, OPMAIOR=29, OPMAISM=30, OPAND=31, OPMENOI=32, 
		OPDIFEF=33, OPSUBTR=34, OPMENOSM=35, OPSOMA=36, OPMAISI=37, OPASTE=38, 
		SEVIRG=39, SEPONTO=40, SEACOLC=41, SEACHAV=42, SEAPARE=43, SEFPARE=44, 
		SEFCHAV=45, SEFCOLC=46, SEDOISP=47, IDENT=48, LF=49, CR=50, ESC=51, INTLITE=52, 
		CHARLIT=53, STRILIT=54, ID=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "Numero", "ESPACO", "ABS", "BOOL", "CHAR", "CLAS", 
			"ELSE", "EXTE", "FALS", "IMPO", "IF", "INST", "INT", "NEW", "NULL", "PACK", 
			"PRIV", "PROT", "PUBL", "RETU", "STAT", "SUPE", "THIS", "TRUE", "VOID", 
			"WHIL", "OPIGUAL", "OPATRIB", "OPMAIOR", "OPMAISM", "OPAND", "OPMENOI", 
			"OPDIFEF", "OPSUBTR", "OPMENOSM", "OPSOMA", "OPMAISI", "OPASTE", "SEVIRG", 
			"SEPONTO", "SEACOLC", "SEACHAV", "SEAPARE", "SEFPARE", "SEFCHAV", "SEFCOLC", 
			"SEDOISP", "IDENT", "LF", "CR", "ESC", "INTLITE", "CHARLIT", "STRILIT", 
			"ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'abstract'", "'boolean'", "'char'", "'class'", "'else'", 
			"'extends'", "'false'", "'import'", "'if'", "'instanceof'", "'int'", 
			"'new'", "'null'", "'package'", "'private'", "'protected'", "'public'", 
			"'return'", "'static'", "'super'", "'this'", "'true'", "'void'", "'while'", 
			"'='", "'=='", "'>'", "'++'", "'&&'", "'<='", "'!'", "'-'", "'--'", "'+'", 
			"'+='", "'*'", "','", "'.'", "'['", "'{'", "'('", "')'", "'}'", "']'", 
			"';'", "'( a-z | A-Z | _ | $){ a-z | A-Z | _ | 0-9 | $}'", "'lf'", "'cr'", 
			"'  {n|r|t|b|f | '| \" |  }'", "'0 | (1-9){0-9}'", "'(ESC | ~ ( '|  |LF|CR))'", 
			"'{ESC | ~( \" |  | LF | CR )}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Numero", "ESPACO", "ABS", "BOOL", "CHAR", "CLAS", "ELSE", "EXTE", 
			"FALS", "IMPO", "IF", "INST", "INT", "NEW", "NULL", "PACK", "PRIV", "PROT", 
			"PUBL", "RETU", "STAT", "SUPE", "THIS", "TRUE", "VOID", "WHIL", "OPIGUAL", 
			"OPATRIB", "OPMAIOR", "OPMAISM", "OPAND", "OPMENOI", "OPDIFEF", "OPSUBTR", 
			"OPMENOSM", "OPSOMA", "OPMAISI", "OPASTE", "SEVIRG", "SEPONTO", "SEACOLC", 
			"SEACHAV", "SEAPARE", "SEFPARE", "SEFCHAV", "SEFCOLC", "SEDOISP", "IDENT", 
			"LF", "CR", "ESC", "INTLITE", "CHARLIT", "STRILIT", "ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u01a2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\5\6\5\u0082\n\5\r\5\16\5\u0083\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\39\3:"+
		"\3:\3:\3:\7:\u019e\n:\f:\16:\u01a1\13:\2\2;\3\2\5\2\7\3\t\4\13\5\r\6\17"+
		"\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25"+
		"-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S"+
		")U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67q8s9\3\2\4\4\2C\\c|\5\2\13"+
		"\f\17\17\"\"\2\u01a4\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2\2\2\t\u0081"+
		"\3\2\2\2\13\u0087\3\2\2\2\r\u0090\3\2\2\2\17\u0098\3\2\2\2\21\u009d\3"+
		"\2\2\2\23\u00a3\3\2\2\2\25\u00a8\3\2\2\2\27\u00b0\3\2\2\2\31\u00b6\3\2"+
		"\2\2\33\u00bd\3\2\2\2\35\u00c0\3\2\2\2\37\u00cb\3\2\2\2!\u00cf\3\2\2\2"+
		"#\u00d3\3\2\2\2%\u00d8\3\2\2\2\'\u00e0\3\2\2\2)\u00e8\3\2\2\2+\u00f2\3"+
		"\2\2\2-\u00f9\3\2\2\2/\u0100\3\2\2\2\61\u0107\3\2\2\2\63\u010d\3\2\2\2"+
		"\65\u0112\3\2\2\2\67\u0117\3\2\2\29\u011c\3\2\2\2;\u0122\3\2\2\2=\u0124"+
		"\3\2\2\2?\u0127\3\2\2\2A\u0129\3\2\2\2C\u012c\3\2\2\2E\u012f\3\2\2\2G"+
		"\u0132\3\2\2\2I\u0134\3\2\2\2K\u0136\3\2\2\2M\u0139\3\2\2\2O\u013b\3\2"+
		"\2\2Q\u013e\3\2\2\2S\u0140\3\2\2\2U\u0142\3\2\2\2W\u0144\3\2\2\2Y\u0146"+
		"\3\2\2\2[\u0148\3\2\2\2]\u014a\3\2\2\2_\u014c\3\2\2\2a\u014e\3\2\2\2c"+
		"\u0150\3\2\2\2e\u0152\3\2\2\2g\u0181\3\2\2\2i\u0184\3\2\2\2k\u0187\3\2"+
		"\2\2m\u0188\3\2\2\2o\u0197\3\2\2\2q\u0198\3\2\2\2s\u0199\3\2\2\2uv\t\2"+
		"\2\2v\4\3\2\2\2wx\4\62;\2x\6\3\2\2\2y}\5\5\3\2z|\5\5\3\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\b\3\2\2\2\177}\3\2\2\2\u0080\u0082\t\3\2"+
		"\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\5\2\2\u0086\n\3\2\2\2\u0087"+
		"\u0088\7c\2\2\u0088\u0089\7d\2\2\u0089\u008a\7u\2\2\u008a\u008b\7v\2\2"+
		"\u008b\u008c\7t\2\2\u008c\u008d\7c\2\2\u008d\u008e\7e\2\2\u008e\u008f"+
		"\7v\2\2\u008f\f\3\2\2\2\u0090\u0091\7d\2\2\u0091\u0092\7q\2\2\u0092\u0093"+
		"\7q\2\2\u0093\u0094\7n\2\2\u0094\u0095\7g\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7p\2\2\u0097\16\3\2\2\2\u0098\u0099\7e\2\2\u0099\u009a\7j\2\2\u009a"+
		"\u009b\7c\2\2\u009b\u009c\7t\2\2\u009c\20\3\2\2\2\u009d\u009e\7e\2\2\u009e"+
		"\u009f\7n\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7u\2\2"+
		"\u00a2\22\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7"+
		"u\2\2\u00a6\u00a7\7g\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa"+
		"\7z\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7p\2\2\u00ad"+
		"\u00ae\7f\2\2\u00ae\u00af\7u\2\2\u00af\26\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1"+
		"\u00b2\7c\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7g\2\2"+
		"\u00b5\30\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9\7"+
		"r\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7v\2\2\u00bc\32"+
		"\3\2\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7h\2\2\u00bf\34\3\2\2\2\u00c0"+
		"\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7v\2\2"+
		"\u00c4\u00c5\7c\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8"+
		"\7g\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7h\2\2\u00ca\36\3\2\2\2\u00cb\u00cc"+
		"\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2\u00ce \3\2\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7y\2\2\u00d2\"\3\2\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7n\2\2\u00d7"+
		"$\3\2\2\2\u00d8\u00d9\7r\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7e\2\2\u00db"+
		"\u00dc\7m\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7i\2\2\u00de\u00df\7g\2\2"+
		"\u00df&\3\2\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7k\2"+
		"\2\u00e3\u00e4\7x\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7"+
		"\7g\2\2\u00e7(\3\2\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb"+
		"\7q\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7e\2\2\u00ee"+
		"\u00ef\7v\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7f\2\2\u00f1*\3\2\2\2\u00f2"+
		"\u00f3\7r\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7n\2\2"+
		"\u00f6\u00f7\7k\2\2\u00f7\u00f8\7e\2\2\u00f8,\3\2\2\2\u00f9\u00fa\7t\2"+
		"\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe"+
		"\7t\2\2\u00fe\u00ff\7p\2\2\u00ff.\3\2\2\2\u0100\u0101\7u\2\2\u0101\u0102"+
		"\7v\2\2\u0102\u0103\7c\2\2\u0103\u0104\7v\2\2\u0104\u0105\7k\2\2\u0105"+
		"\u0106\7e\2\2\u0106\60\3\2\2\2\u0107\u0108\7u\2\2\u0108\u0109\7w\2\2\u0109"+
		"\u010a\7r\2\2\u010a\u010b\7g\2\2\u010b\u010c\7t\2\2\u010c\62\3\2\2\2\u010d"+
		"\u010e\7v\2\2\u010e\u010f\7j\2\2\u010f\u0110\7k\2\2\u0110\u0111\7u\2\2"+
		"\u0111\64\3\2\2\2\u0112\u0113\7v\2\2\u0113\u0114\7t\2\2\u0114\u0115\7"+
		"w\2\2\u0115\u0116\7g\2\2\u0116\66\3\2\2\2\u0117\u0118\7x\2\2\u0118\u0119"+
		"\7q\2\2\u0119\u011a\7k\2\2\u011a\u011b\7f\2\2\u011b8\3\2\2\2\u011c\u011d"+
		"\7y\2\2\u011d\u011e\7j\2\2\u011e\u011f\7k\2\2\u011f\u0120\7n\2\2\u0120"+
		"\u0121\7g\2\2\u0121:\3\2\2\2\u0122\u0123\7?\2\2\u0123<\3\2\2\2\u0124\u0125"+
		"\7?\2\2\u0125\u0126\7?\2\2\u0126>\3\2\2\2\u0127\u0128\7@\2\2\u0128@\3"+
		"\2\2\2\u0129\u012a\7-\2\2\u012a\u012b\7-\2\2\u012bB\3\2\2\2\u012c\u012d"+
		"\7(\2\2\u012d\u012e\7(\2\2\u012eD\3\2\2\2\u012f\u0130\7>\2\2\u0130\u0131"+
		"\7?\2\2\u0131F\3\2\2\2\u0132\u0133\7#\2\2\u0133H\3\2\2\2\u0134\u0135\7"+
		"/\2\2\u0135J\3\2\2\2\u0136\u0137\7/\2\2\u0137\u0138\7/\2\2\u0138L\3\2"+
		"\2\2\u0139\u013a\7-\2\2\u013aN\3\2\2\2\u013b\u013c\7-\2\2\u013c\u013d"+
		"\7?\2\2\u013dP\3\2\2\2\u013e\u013f\7,\2\2\u013fR\3\2\2\2\u0140\u0141\7"+
		".\2\2\u0141T\3\2\2\2\u0142\u0143\7\60\2\2\u0143V\3\2\2\2\u0144\u0145\7"+
		"]\2\2\u0145X\3\2\2\2\u0146\u0147\7}\2\2\u0147Z\3\2\2\2\u0148\u0149\7*"+
		"\2\2\u0149\\\3\2\2\2\u014a\u014b\7+\2\2\u014b^\3\2\2\2\u014c\u014d\7\177"+
		"\2\2\u014d`\3\2\2\2\u014e\u014f\7_\2\2\u014fb\3\2\2\2\u0150\u0151\7=\2"+
		"\2\u0151d\3\2\2\2\u0152\u0153\7*\2\2\u0153\u0154\7\"\2\2\u0154\u0155\7"+
		"c\2\2\u0155\u0156\7/\2\2\u0156\u0157\7|\2\2\u0157\u0158\7\"\2\2\u0158"+
		"\u0159\7~\2\2\u0159\u015a\7\"\2\2\u015a\u015b\7C\2\2\u015b\u015c\7/\2"+
		"\2\u015c\u015d\7\\\2\2\u015d\u015e\7\"\2\2\u015e\u015f\7~\2\2\u015f\u0160"+
		"\7\"\2\2\u0160\u0161\7a\2\2\u0161\u0162\7\"\2\2\u0162\u0163\7~\2\2\u0163"+
		"\u0164\7\"\2\2\u0164\u0165\7&\2\2\u0165\u0166\7+\2\2\u0166\u0167\7}\2"+
		"\2\u0167\u0168\7\"\2\2\u0168\u0169\7c\2\2\u0169\u016a\7/\2\2\u016a\u016b"+
		"\7|\2\2\u016b\u016c\7\"\2\2\u016c\u016d\7~\2\2\u016d\u016e\7\"\2\2\u016e"+
		"\u016f\7C\2\2\u016f\u0170\7/\2\2\u0170\u0171\7\\\2\2\u0171\u0172\7\"\2"+
		"\2\u0172\u0173\7~\2\2\u0173\u0174\7\"\2\2\u0174\u0175\7a\2\2\u0175\u0176"+
		"\7\"\2\2\u0176\u0177\7~\2\2\u0177\u0178\7\"\2\2\u0178\u0179\7\62\2\2\u0179"+
		"\u017a\7/\2\2\u017a\u017b\7;\2\2\u017b\u017c\7\"\2\2\u017c\u017d\7~\2"+
		"\2\u017d\u017e\7\"\2\2\u017e\u017f\7&\2\2\u017f\u0180\7\177\2\2\u0180"+
		"f\3\2\2\2\u0181\u0182\7n\2\2\u0182\u0183\7h\2\2\u0183h\3\2\2\2\u0184\u0185"+
		"\7e\2\2\u0185\u0186\7t\2\2\u0186j\3\2\2\2\u0187l\3\2\2\2\u0188\u0189\7"+
		"\62\2\2\u0189\u018a\7\"\2\2\u018a\u018b\7~\2\2\u018b\u018c\7\"\2\2\u018c"+
		"\u018d\7*\2\2\u018d\u018e\7\63\2\2\u018e\u018f\7/\2\2\u018f\u0190\7;\2"+
		"\2\u0190\u0191\7+\2\2\u0191\u0192\7}\2\2\u0192\u0193\7\62\2\2\u0193\u0194"+
		"\7/\2\2\u0194\u0195\7;\2\2\u0195\u0196\7\177\2\2\u0196n\3\2\2\2\u0197"+
		"p\3\2\2\2\u0198r\3\2\2\2\u0199\u019f\5\3\2\2\u019a\u019e\5\3\2\2\u019b"+
		"\u019e\5\5\3\2\u019c\u019e\7a\2\2\u019d\u019a\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0t\3\2\2\2\u01a1\u019f\3\2\2\2\7\2}\u0083\u019d\u019f"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
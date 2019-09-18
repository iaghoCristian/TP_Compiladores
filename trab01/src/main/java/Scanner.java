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
		ABS=1, BOOL=2, CHAR=3, CLAS=4, ELSE=5, EXTE=6, FALS=7, IMPO=8, IF=9, INST=10, 
		INT=11, NEW=12, NULL=13, PACK=14, PRIV=15, PROT=16, PUBL=17, RETU=18, 
		STAT=19, SUPE=20, THIS=21, TRUE=22, VOID=23, WHIL=24, OPIGUAL=25, OPATRIB=26, 
		OPMAIOR=27, OPMAISM=28, OPAND=29, OPMENOI=30, OPDIFEF=31, OPSUBTR=32, 
		OPMENOSM=33, OPSOMA=34, OPMAISI=35, OPASTE=36, SEVIRG=37, SEPONTO=38, 
		SEACOLC=39, SEACHAV=40, SEAPARE=41, SEFPARE=42, SEFCHAV=43, SEFCOLC=44, 
		SEDOISP=45, ID=46, Numero=47, ESPACO=48, NL=49, COMENTARIO=50, INTLITE=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ABS", "BOOL", "CHAR", "CLAS", "ELSE", "EXTE", "FALS", "IMPO", "IF", 
			"INST", "INT", "NEW", "NULL", "PACK", "PRIV", "PROT", "PUBL", "RETU", 
			"STAT", "SUPE", "THIS", "TRUE", "VOID", "WHIL", "OPIGUAL", "OPATRIB", 
			"OPMAIOR", "OPMAISM", "OPAND", "OPMENOI", "OPDIFEF", "OPSUBTR", "OPMENOSM", 
			"OPSOMA", "OPMAISI", "OPASTE", "SEVIRG", "SEPONTO", "SEACOLC", "SEACHAV", 
			"SEAPARE", "SEFPARE", "SEFCHAV", "SEFCOLC", "SEDOISP", "ID", "LETRA", 
			"DIGITO", "Numero", "ESPACO", "NL", "COMENTARIO", "INTLITE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'boolean'", "'char'", "'class'", "'else'", "'extends'", 
			"'false'", "'import'", "'if'", "'instanceof'", "'int'", "'new'", "'null'", 
			"'package'", "'private'", "'protected'", "'public'", "'return'", "'static'", 
			"'super'", "'this'", "'true'", "'void'", "'while'", "'='", "'=='", "'>'", 
			"'++'", "'&&'", "'<='", "'!'", "'-'", "'--'", "'+'", "'+='", "'*'", "','", 
			"'.'", "'['", "'{'", "'('", "')'", "'}'", "']'", "';'", null, null, null, 
			null, null, "'0 | (1-9){0-9}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABS", "BOOL", "CHAR", "CLAS", "ELSE", "EXTE", "FALS", "IMPO", 
			"IF", "INST", "INT", "NEW", "NULL", "PACK", "PRIV", "PROT", "PUBL", "RETU", 
			"STAT", "SUPE", "THIS", "TRUE", "VOID", "WHIL", "OPIGUAL", "OPATRIB", 
			"OPMAIOR", "OPMAISM", "OPAND", "OPMENOI", "OPDIFEF", "OPSUBTR", "OPMENOSM", 
			"OPSOMA", "OPMAISI", "OPASTE", "SEVIRG", "SEPONTO", "SEACOLC", "SEACHAV", 
			"SEAPARE", "SEFPARE", "SEFCHAV", "SEFCOLC", "SEDOISP", "ID", "Numero", 
			"ESPACO", "NL", "COMENTARIO", "INTLITE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0172\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\5/\u013b\n/\3/\3/\3/\7/\u0140\n/\f/\16/\u0143\13/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\7\62\u014b\n\62\f\62\16\62\u014e\13\62\3\63"+
		"\6\63\u0151\n\63\r\63\16\63\u0152\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\7\65\u015d\n\65\f\65\16\65\u0160\13\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\2\2\67\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2c\61e\62g\63i\64k\65\3\2\7\4\2"+
		"&&aa\4\2C\\c|\4\2\16\16\"\"\4\2\n\f\16\17\4\2\f\f\17\17\2\u0176\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5v\3\2\2\2\7~\3\2\2\2\t\u0083"+
		"\3\2\2\2\13\u0089\3\2\2\2\r\u008e\3\2\2\2\17\u0096\3\2\2\2\21\u009c\3"+
		"\2\2\2\23\u00a3\3\2\2\2\25\u00a6\3\2\2\2\27\u00b1\3\2\2\2\31\u00b5\3\2"+
		"\2\2\33\u00b9\3\2\2\2\35\u00be\3\2\2\2\37\u00c6\3\2\2\2!\u00ce\3\2\2\2"+
		"#\u00d8\3\2\2\2%\u00df\3\2\2\2\'\u00e6\3\2\2\2)\u00ed\3\2\2\2+\u00f3\3"+
		"\2\2\2-\u00f8\3\2\2\2/\u00fd\3\2\2\2\61\u0102\3\2\2\2\63\u0108\3\2\2\2"+
		"\65\u010a\3\2\2\2\67\u010d\3\2\2\29\u010f\3\2\2\2;\u0112\3\2\2\2=\u0115"+
		"\3\2\2\2?\u0118\3\2\2\2A\u011a\3\2\2\2C\u011c\3\2\2\2E\u011f\3\2\2\2G"+
		"\u0121\3\2\2\2I\u0124\3\2\2\2K\u0126\3\2\2\2M\u0128\3\2\2\2O\u012a\3\2"+
		"\2\2Q\u012c\3\2\2\2S\u012e\3\2\2\2U\u0130\3\2\2\2W\u0132\3\2\2\2Y\u0134"+
		"\3\2\2\2[\u0136\3\2\2\2]\u013a\3\2\2\2_\u0144\3\2\2\2a\u0146\3\2\2\2c"+
		"\u0148\3\2\2\2e\u0150\3\2\2\2g\u0156\3\2\2\2i\u0158\3\2\2\2k\u0163\3\2"+
		"\2\2mn\7c\2\2no\7d\2\2op\7u\2\2pq\7v\2\2qr\7t\2\2rs\7c\2\2st\7e\2\2tu"+
		"\7v\2\2u\4\3\2\2\2vw\7d\2\2wx\7q\2\2xy\7q\2\2yz\7n\2\2z{\7g\2\2{|\7c\2"+
		"\2|}\7p\2\2}\6\3\2\2\2~\177\7e\2\2\177\u0080\7j\2\2\u0080\u0081\7c\2\2"+
		"\u0081\u0082\7t\2\2\u0082\b\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085\7n"+
		"\2\2\u0085\u0086\7c\2\2\u0086\u0087\7u\2\2\u0087\u0088\7u\2\2\u0088\n"+
		"\3\2\2\2\u0089\u008a\7g\2\2\u008a\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c"+
		"\u008d\7g\2\2\u008d\f\3\2\2\2\u008e\u008f\7g\2\2\u008f\u0090\7z\2\2\u0090"+
		"\u0091\7v\2\2\u0091\u0092\7g\2\2\u0092\u0093\7p\2\2\u0093\u0094\7f\2\2"+
		"\u0094\u0095\7u\2\2\u0095\16\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7"+
		"c\2\2\u0098\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b\20"+
		"\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7o\2\2\u009e\u009f\7r\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7v\2\2\u00a2\22\3\2\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a5\7h\2\2\u00a5\24\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7"+
		"\u00a8\7p\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7c\2\2"+
		"\u00ab\u00ac\7p\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af"+
		"\7q\2\2\u00af\u00b0\7h\2\2\u00b0\26\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3"+
		"\7p\2\2\u00b3\u00b4\7v\2\2\u00b4\30\3\2\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7"+
		"\7g\2\2\u00b7\u00b8\7y\2\2\u00b8\32\3\2\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb"+
		"\7w\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7n\2\2\u00bd\34\3\2\2\2\u00be\u00bf"+
		"\7r\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7m\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7i\2\2\u00c4\u00c5\7g\2\2\u00c5\36\3\2\2\2\u00c6"+
		"\u00c7\7r\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7x\2\2"+
		"\u00ca\u00cb\7c\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7g\2\2\u00cd \3\2\2"+
		"\2\u00ce\u00cf\7r\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2"+
		"\7v\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7v\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\u00d7\7f\2\2\u00d7\"\3\2\2\2\u00d8\u00d9\7r\2\2\u00d9"+
		"\u00da\7w\2\2\u00da\u00db\7d\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7k\2\2"+
		"\u00dd\u00de\7e\2\2\u00de$\3\2\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7g\2"+
		"\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5"+
		"\7p\2\2\u00e5&\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9"+
		"\7c\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7e\2\2\u00ec"+
		"(\3\2\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7r\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\u00f2\7t\2\2\u00f2*\3\2\2\2\u00f3\u00f4\7v\2\2\u00f4"+
		"\u00f5\7j\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7u\2\2\u00f7,\3\2\2\2\u00f8"+
		"\u00f9\7v\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc\7g\2\2"+
		"\u00fc.\3\2\2\2\u00fd\u00fe\7x\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7k\2"+
		"\2\u0100\u0101\7f\2\2\u0101\60\3\2\2\2\u0102\u0103\7y\2\2\u0103\u0104"+
		"\7j\2\2\u0104\u0105\7k\2\2\u0105\u0106\7n\2\2\u0106\u0107\7g\2\2\u0107"+
		"\62\3\2\2\2\u0108\u0109\7?\2\2\u0109\64\3\2\2\2\u010a\u010b\7?\2\2\u010b"+
		"\u010c\7?\2\2\u010c\66\3\2\2\2\u010d\u010e\7@\2\2\u010e8\3\2\2\2\u010f"+
		"\u0110\7-\2\2\u0110\u0111\7-\2\2\u0111:\3\2\2\2\u0112\u0113\7(\2\2\u0113"+
		"\u0114\7(\2\2\u0114<\3\2\2\2\u0115\u0116\7>\2\2\u0116\u0117\7?\2\2\u0117"+
		">\3\2\2\2\u0118\u0119\7#\2\2\u0119@\3\2\2\2\u011a\u011b\7/\2\2\u011bB"+
		"\3\2\2\2\u011c\u011d\7/\2\2\u011d\u011e\7/\2\2\u011eD\3\2\2\2\u011f\u0120"+
		"\7-\2\2\u0120F\3\2\2\2\u0121\u0122\7-\2\2\u0122\u0123\7?\2\2\u0123H\3"+
		"\2\2\2\u0124\u0125\7,\2\2\u0125J\3\2\2\2\u0126\u0127\7.\2\2\u0127L\3\2"+
		"\2\2\u0128\u0129\7\60\2\2\u0129N\3\2\2\2\u012a\u012b\7]\2\2\u012bP\3\2"+
		"\2\2\u012c\u012d\7}\2\2\u012dR\3\2\2\2\u012e\u012f\7*\2\2\u012fT\3\2\2"+
		"\2\u0130\u0131\7+\2\2\u0131V\3\2\2\2\u0132\u0133\7\177\2\2\u0133X\3\2"+
		"\2\2\u0134\u0135\7_\2\2\u0135Z\3\2\2\2\u0136\u0137\7=\2\2\u0137\\\3\2"+
		"\2\2\u0138\u013b\5_\60\2\u0139\u013b\t\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\u0141\3\2\2\2\u013c\u0140\5_\60\2\u013d\u0140\5a"+
		"\61\2\u013e\u0140\t\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142^\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\t\3\2\2\u0145`\3\2"+
		"\2\2\u0146\u0147\4\62;\2\u0147b\3\2\2\2\u0148\u014c\5a\61\2\u0149\u014b"+
		"\5a\61\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014dd\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\t\4\2\2"+
		"\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b\63\2\2\u0155f\3\2\2\2\u0156"+
		"\u0157\t\5\2\2\u0157h\3\2\2\2\u0158\u0159\7\61\2\2\u0159\u015a\7\61\2"+
		"\2\u015a\u015e\3\2\2\2\u015b\u015d\n\6\2\2\u015c\u015b\3\2\2\2\u015d\u0160"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0162\b\65\2\2\u0162j\3\2\2\2\u0163\u0164\7\62\2"+
		"\2\u0164\u0165\7\"\2\2\u0165\u0166\7~\2\2\u0166\u0167\7\"\2\2\u0167\u0168"+
		"\7*\2\2\u0168\u0169\7\63\2\2\u0169\u016a\7/\2\2\u016a\u016b\7;\2\2\u016b"+
		"\u016c\7+\2\2\u016c\u016d\7}\2\2\u016d\u016e\7\62\2\2\u016e\u016f\7/\2"+
		"\2\u016f\u0170\7;\2\2\u0170\u0171\7\177\2\2\u0171l\3\2\2\2\t\2\u013a\u013f"+
		"\u0141\u014c\u0152\u015e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
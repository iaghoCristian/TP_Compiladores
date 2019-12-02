// Generated from /home/marcio/Documentos/UFLA/2019_2/compiladores/TP/TP_Compiladores/trab01/src/main/resources/JMMParser.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		ID=49, ESPACO=50, NL=51, COMENTARIO=52, INTLITE=53, CHARLITERAL=54, SRINGLITERAL=55, 
		MULTIOPERATOR_ERROR=56, UNKNOWN_CHARACTER_ERROR=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID_STARTSWITHDIGIT_ERROR", "INT_STARTSWITHZERO_ERROR", "ABS", "BOOL", 
			"CHAR", "CLAS", "ELSE", "EXTE", "FALS", "IMPO", "IF", "INST", "INT", 
			"NEW", "NULL", "PACK", "PRIV", "PROT", "PUBL", "RETU", "STAT", "SUPE", 
			"THIS", "TRUE", "VOID", "WHIL", "OPIGUAL", "OPATRIB", "OPMAIOR", "OPMAISM", 
			"OPAND", "OPMENOI", "OPDIFEF", "OPSUBTR", "OPMENOSM", "OPSOMA", "OPMAISI", 
			"OPASTE", "SEVIRG", "SEPONTO", "SEACOLC", "SEACHAV", "SEAPARE", "SEFPARE", 
			"SEFCHAV", "SEFCOLC", "SEPONTOEVIRG", "SEDOISPONTOS", "ID", "LETRA", 
			"DIGITO", "OPERATORS", "ESPACO", "NL", "COMENTARIO", "INTLITE", "CHARLITERAL", 
			"SRINGLITERAL", "MULTIOPERATOR_ERROR", "UNKNOWN_CHARACTER_ERROR"
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
			"';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID_STARTSWITHDIGIT_ERROR", "INT_STARTSWITHZERO_ERROR", "ABS", 
			"BOOL", "CHAR", "CLAS", "ELSE", "EXTE", "FALS", "IMPO", "IF", "INST", 
			"INT", "NEW", "NULL", "PACK", "PRIV", "PROT", "PUBL", "RETU", "STAT", 
			"SUPE", "THIS", "TRUE", "VOID", "WHIL", "OPIGUAL", "OPATRIB", "OPMAIOR", 
			"OPMAISM", "OPAND", "OPMENOI", "OPDIFEF", "OPSUBTR", "OPMENOSM", "OPSOMA", 
			"OPMAISI", "OPASTE", "SEVIRG", "SEPONTO", "SEACOLC", "SEACHAV", "SEAPARE", 
			"SEFPARE", "SEFCHAV", "SEFCOLC", "SEPONTOEVIRG", "SEDOISPONTOS", "ID", 
			"ESPACO", "NL", "COMENTARIO", "INTLITE", "CHARLITERAL", "SRINGLITERAL", 
			"MULTIOPERATOR_ERROR", "UNKNOWN_CHARACTER_ERROR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u01b7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\6\2}\n\2\r\2\16\2~\3\2\6\2\u0082\n\2\r\2\16\2\u0083\3\3\3\3\6\3\u0088"+
		"\n\3\r\3\16\3\u0089\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\5\62\u015b\n\62\3\62\3\62\3\62\7\62\u0160\n\62\f\62"+
		"\16\62\u0163\13\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u017a\n\65"+
		"\3\66\6\66\u017d\n\66\r\66\16\66\u017e\3\66\3\66\3\67\3\67\3\67\3\67\5"+
		"\67\u0187\n\67\3\67\3\67\38\38\38\38\78\u018f\n8\f8\168\u0192\138\38\3"+
		"8\39\59\u0197\n9\39\79\u019a\n9\f9\169\u019d\139\3:\3:\3:\5:\u01a2\n:"+
		"\3:\3:\3;\3;\3;\7;\u01a9\n;\f;\16;\u01ac\13;\3;\3;\3<\3<\6<\u01b2\n<\r"+
		"<\16<\u01b3\3=\3=\2\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\2g\2i\2k\64m\65o\66q\67s8u9w:y;\3\2\n\4\2&&aa\4\2C\\c|\4\2##//\4\2\16"+
		"\16\"\"\5\2\n\f\16\17))\4\2\f\f\17\17\6\2\f\f\17\17))^^\6\2\f\f\17\17"+
		"$$^^\2\u01cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3|\3\2\2\2\5\u0085\3\2"+
		"\2\2\7\u008b\3\2\2\2\t\u0094\3\2\2\2\13\u009c\3\2\2\2\r\u00a1\3\2\2\2"+
		"\17\u00a7\3\2\2\2\21\u00ac\3\2\2\2\23\u00b4\3\2\2\2\25\u00ba\3\2\2\2\27"+
		"\u00c1\3\2\2\2\31\u00c4\3\2\2\2\33\u00cf\3\2\2\2\35\u00d3\3\2\2\2\37\u00d7"+
		"\3\2\2\2!\u00dc\3\2\2\2#\u00e4\3\2\2\2%\u00ec\3\2\2\2\'\u00f6\3\2\2\2"+
		")\u00fd\3\2\2\2+\u0104\3\2\2\2-\u010b\3\2\2\2/\u0111\3\2\2\2\61\u0116"+
		"\3\2\2\2\63\u011b\3\2\2\2\65\u0120\3\2\2\2\67\u0126\3\2\2\29\u0128\3\2"+
		"\2\2;\u012b\3\2\2\2=\u012d\3\2\2\2?\u0130\3\2\2\2A\u0133\3\2\2\2C\u0136"+
		"\3\2\2\2E\u0138\3\2\2\2G\u013a\3\2\2\2I\u013d\3\2\2\2K\u013f\3\2\2\2M"+
		"\u0142\3\2\2\2O\u0144\3\2\2\2Q\u0146\3\2\2\2S\u0148\3\2\2\2U\u014a\3\2"+
		"\2\2W\u014c\3\2\2\2Y\u014e\3\2\2\2[\u0150\3\2\2\2]\u0152\3\2\2\2_\u0154"+
		"\3\2\2\2a\u0156\3\2\2\2c\u015a\3\2\2\2e\u0164\3\2\2\2g\u0166\3\2\2\2i"+
		"\u0179\3\2\2\2k\u017c\3\2\2\2m\u0186\3\2\2\2o\u018a\3\2\2\2q\u0196\3\2"+
		"\2\2s\u019e\3\2\2\2u\u01a5\3\2\2\2w\u01af\3\2\2\2y\u01b5\3\2\2\2{}\5g"+
		"\64\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080"+
		"\u0082\5e\63\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\4\3\2\2\2\u0085\u0087\7\62\2\2\u0086\u0088"+
		"\5g\64\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\6\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d\7d\2\2\u008d"+
		"\u008e\7u\2\2\u008e\u008f\7v\2\2\u008f\u0090\7t\2\2\u0090\u0091\7c\2\2"+
		"\u0091\u0092\7e\2\2\u0092\u0093\7v\2\2\u0093\b\3\2\2\2\u0094\u0095\7d"+
		"\2\2\u0095\u0096\7q\2\2\u0096\u0097\7q\2\2\u0097\u0098\7n\2\2\u0098\u0099"+
		"\7g\2\2\u0099\u009a\7c\2\2\u009a\u009b\7p\2\2\u009b\n\3\2\2\2\u009c\u009d"+
		"\7e\2\2\u009d\u009e\7j\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7t\2\2\u00a0"+
		"\f\3\2\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7c\2\2\u00a4"+
		"\u00a5\7u\2\2\u00a5\u00a6\7u\2\2\u00a6\16\3\2\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00a9\7n\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7g\2\2\u00ab\20\3\2\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\u00ae\7z\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7g\2\2"+
		"\u00b0\u00b1\7p\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7u\2\2\u00b3\22\3\2"+
		"\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8"+
		"\7u\2\2\u00b8\u00b9\7g\2\2\u00b9\24\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc"+
		"\7o\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\26\3\2\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7h\2\2\u00c3"+
		"\30\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7u\2\2\u00c7"+
		"\u00c8\7v\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7e\2\2"+
		"\u00cb\u00cc\7g\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7h\2\2\u00ce\32\3\2"+
		"\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2\34"+
		"\3\2\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7y\2\2\u00d6"+
		"\36\3\2\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7n\2\2\u00da"+
		"\u00db\7n\2\2\u00db \3\2\2\2\u00dc\u00dd\7r\2\2\u00dd\u00de\7c\2\2\u00de"+
		"\u00df\7e\2\2\u00df\u00e0\7m\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7i\2\2"+
		"\u00e2\u00e3\7g\2\2\u00e3\"\3\2\2\2\u00e4\u00e5\7r\2\2\u00e5\u00e6\7t"+
		"\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7x\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea"+
		"\7v\2\2\u00ea\u00eb\7g\2\2\u00eb$\3\2\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee"+
		"\7t\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7g\2\2\u00f1"+
		"\u00f2\7e\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7f\2\2"+
		"\u00f5&\3\2\2\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7d\2"+
		"\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7e\2\2\u00fc(\3\2"+
		"\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7v\2\2\u0100\u0101"+
		"\7w\2\2\u0101\u0102\7t\2\2\u0102\u0103\7p\2\2\u0103*\3\2\2\2\u0104\u0105"+
		"\7u\2\2\u0105\u0106\7v\2\2\u0106\u0107\7c\2\2\u0107\u0108\7v\2\2\u0108"+
		"\u0109\7k\2\2\u0109\u010a\7e\2\2\u010a,\3\2\2\2\u010b\u010c\7u\2\2\u010c"+
		"\u010d\7w\2\2\u010d\u010e\7r\2\2\u010e\u010f\7g\2\2\u010f\u0110\7t\2\2"+
		"\u0110.\3\2\2\2\u0111\u0112\7v\2\2\u0112\u0113\7j\2\2\u0113\u0114\7k\2"+
		"\2\u0114\u0115\7u\2\2\u0115\60\3\2\2\2\u0116\u0117\7v\2\2\u0117\u0118"+
		"\7t\2\2\u0118\u0119\7w\2\2\u0119\u011a\7g\2\2\u011a\62\3\2\2\2\u011b\u011c"+
		"\7x\2\2\u011c\u011d\7q\2\2\u011d\u011e\7k\2\2\u011e\u011f\7f\2\2\u011f"+
		"\64\3\2\2\2\u0120\u0121\7y\2\2\u0121\u0122\7j\2\2\u0122\u0123\7k\2\2\u0123"+
		"\u0124\7n\2\2\u0124\u0125\7g\2\2\u0125\66\3\2\2\2\u0126\u0127\7?\2\2\u0127"+
		"8\3\2\2\2\u0128\u0129\7?\2\2\u0129\u012a\7?\2\2\u012a:\3\2\2\2\u012b\u012c"+
		"\7@\2\2\u012c<\3\2\2\2\u012d\u012e\7-\2\2\u012e\u012f\7-\2\2\u012f>\3"+
		"\2\2\2\u0130\u0131\7(\2\2\u0131\u0132\7(\2\2\u0132@\3\2\2\2\u0133\u0134"+
		"\7>\2\2\u0134\u0135\7?\2\2\u0135B\3\2\2\2\u0136\u0137\7#\2\2\u0137D\3"+
		"\2\2\2\u0138\u0139\7/\2\2\u0139F\3\2\2\2\u013a\u013b\7/\2\2\u013b\u013c"+
		"\7/\2\2\u013cH\3\2\2\2\u013d\u013e\7-\2\2\u013eJ\3\2\2\2\u013f\u0140\7"+
		"-\2\2\u0140\u0141\7?\2\2\u0141L\3\2\2\2\u0142\u0143\7,\2\2\u0143N\3\2"+
		"\2\2\u0144\u0145\7.\2\2\u0145P\3\2\2\2\u0146\u0147\7\60\2\2\u0147R\3\2"+
		"\2\2\u0148\u0149\7]\2\2\u0149T\3\2\2\2\u014a\u014b\7}\2\2\u014bV\3\2\2"+
		"\2\u014c\u014d\7*\2\2\u014dX\3\2\2\2\u014e\u014f\7+\2\2\u014fZ\3\2\2\2"+
		"\u0150\u0151\7\177\2\2\u0151\\\3\2\2\2\u0152\u0153\7_\2\2\u0153^\3\2\2"+
		"\2\u0154\u0155\7=\2\2\u0155`\3\2\2\2\u0156\u0157\7<\2\2\u0157b\3\2\2\2"+
		"\u0158\u015b\5e\63\2\u0159\u015b\t\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159"+
		"\3\2\2\2\u015b\u0161\3\2\2\2\u015c\u0160\5e\63\2\u015d\u0160\5g\64\2\u015e"+
		"\u0160\t\2\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2"+
		"\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"d\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\t\3\2\2\u0165f\3\2\2\2\u0166"+
		"\u0167\4\62;\2\u0167h\3\2\2\2\u0168\u017a\7?\2\2\u0169\u016a\7?\2\2\u016a"+
		"\u017a\7?\2\2\u016b\u017a\7@\2\2\u016c\u016d\7-\2\2\u016d\u017a\7-\2\2"+
		"\u016e\u016f\7(\2\2\u016f\u017a\7(\2\2\u0170\u0171\7>\2\2\u0171\u017a"+
		"\7?\2\2\u0172\u017a\t\4\2\2\u0173\u0174\7/\2\2\u0174\u017a\7/\2\2\u0175"+
		"\u017a\7-\2\2\u0176\u0177\7-\2\2\u0177\u017a\7?\2\2\u0178\u017a\7,\2\2"+
		"\u0179\u0168\3\2\2\2\u0179\u0169\3\2\2\2\u0179\u016b\3\2\2\2\u0179\u016c"+
		"\3\2\2\2\u0179\u016e\3\2\2\2\u0179\u0170\3\2\2\2\u0179\u0172\3\2\2\2\u0179"+
		"\u0173\3\2\2\2\u0179\u0175\3\2\2\2\u0179\u0176\3\2\2\2\u0179\u0178\3\2"+
		"\2\2\u017aj\3\2\2\2\u017b\u017d\t\5\2\2\u017c\u017b\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\b\66\2\2\u0181l\3\2\2\2\u0182\u0187\t\6\2\2\u0183\u0184\7\"\2\2"+
		"\u0184\u0185\7^\2\2\u0185\u0187\7\"\2\2\u0186\u0182\3\2\2\2\u0186\u0183"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\b\67\2\2\u0189n\3\2\2\2\u018a"+
		"\u018b\7\61\2\2\u018b\u018c\7\61\2\2\u018c\u0190\3\2\2\2\u018d\u018f\n"+
		"\7\2\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\b8"+
		"\2\2\u0194p\3\2\2\2\u0195\u0197\4\62;\2\u0196\u0195\3\2\2\2\u0197\u019b"+
		"\3\2\2\2\u0198\u019a\5g\64\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019cr\3\2\2\2\u019d\u019b\3\2\2\2"+
		"\u019e\u01a1\7)\2\2\u019f\u01a2\5m\67\2\u01a0\u01a2\n\b\2\2\u01a1\u019f"+
		"\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7)\2\2\u01a4"+
		"t\3\2\2\2\u01a5\u01aa\7$\2\2\u01a6\u01a9\5m\67\2\u01a7\u01a9\n\t\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2"+
		"\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad"+
		"\u01ae\7$\2\2\u01aev\3\2\2\2\u01af\u01b1\5i\65\2\u01b0\u01b2\5i\65\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4x\3\2\2\2\u01b5\u01b6\4\17\u0080\2\u01b6z\3\2\2\2\23\2~\u0083"+
		"\u0089\u015a\u015f\u0161\u0179\u017e\u0186\u0190\u0196\u019b\u01a1\u01a8"+
		"\u01aa\u01b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
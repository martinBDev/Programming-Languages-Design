// Generated from C:/Users/usuario/Desktop/Eii/AÑO 3 GRADO INGENIERIA INFORMATICA/Diseño de Lenguaje de Programacion/Lab_project/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRASH=1, ONE_LINE_COMMENT=2, MULTI_LINE_COMMENT=3, INT_CONSTANT=4, ID=5, 
		CHAR_CONSTANT=6, REAL_CONSTANT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "LETTER", "NEW_LINE", "FLOATING_POINT", "MANTISSA", "TRASH", 
			"ONE_LINE_COMMENT", "MULTI_LINE_COMMENT", "INT_CONSTANT", "ID", "CHAR_CONSTANT", 
			"REAL_CONSTANT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRASH", "ONE_LINE_COMMENT", "MULTI_LINE_COMMENT", "INT_CONSTANT", 
			"ID", "CHAR_CONSTANT", "REAL_CONSTANT"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u00a8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\5\4!\n\4\3\4\5\4$\n\4\3\5\6"+
		"\5\'\n\5\r\5\16\5(\3\5\3\5\6\5-\n\5\r\5\16\5.\3\5\3\5\6\5\63\n\5\r\5\16"+
		"\5\64\3\5\6\58\n\5\r\5\16\59\3\5\3\5\5\5>\n\5\3\6\3\6\6\6B\n\6\r\6\16"+
		"\6C\5\6F\n\6\3\6\3\6\5\6J\n\6\3\6\6\6M\n\6\r\6\16\6N\3\7\6\7R\n\7\r\7"+
		"\16\7S\3\7\5\7W\n\7\3\7\3\7\3\b\3\b\7\b]\n\b\f\b\16\b`\13\b\3\b\3\b\5"+
		"\bd\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\7\nz\n\n\f\n\16\n}\13\n\3\n\5\n\u0080\n\n\3\13"+
		"\3\13\5\13\u0084\n\13\3\13\3\13\3\13\7\13\u0089\n\13\f\13\16\13\u008c"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f"+
		"\u009d\n\f\r\f\16\f\u009e\3\f\3\f\5\f\u00a3\n\f\3\r\3\r\5\r\u00a7\n\r"+
		"\4^n\2\16\3\2\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7\27\b\31\t\3\2\t"+
		"\3\2\62;\4\2C\\c|\3\3\f\f\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\3\2\63;\2"+
		"\u00bd\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7 \3\2\2\2\t=\3\2"+
		"\2\2\13E\3\2\2\2\rV\3\2\2\2\17Z\3\2\2\2\21g\3\2\2\2\23\177\3\2\2\2\25"+
		"\u0083\3\2\2\2\27\u00a2\3\2\2\2\31\u00a6\3\2\2\2\33\34\t\2\2\2\34\4\3"+
		"\2\2\2\35\36\t\3\2\2\36\6\3\2\2\2\37!\7\17\2\2 \37\3\2\2\2 !\3\2\2\2!"+
		"#\3\2\2\2\"$\t\4\2\2#\"\3\2\2\2$\b\3\2\2\2%\'\5\3\2\2&%\3\2\2\2\'(\3\2"+
		"\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*,\7\60\2\2+-\5\3\2\2,+\3\2\2\2-.\3"+
		"\2\2\2.,\3\2\2\2./\3\2\2\2/>\3\2\2\2\60\62\7\60\2\2\61\63\5\3\2\2\62\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65>\3\2\2\2\668\5\3"+
		"\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\60\2"+
		"\2<>\3\2\2\2=&\3\2\2\2=\60\3\2\2\2=\67\3\2\2\2>\n\3\2\2\2?F\5\t\5\2@B"+
		"\5\3\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2E?\3\2\2\2E"+
		"A\3\2\2\2FG\3\2\2\2GI\t\5\2\2HJ\t\6\2\2IH\3\2\2\2IJ\3\2\2\2JL\3\2\2\2"+
		"KM\5\3\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\f\3\2\2\2PR\t\7\2"+
		"\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2UW\5\7\4\2VQ\3\2\2"+
		"\2VU\3\2\2\2WX\3\2\2\2XY\b\7\2\2Y\16\3\2\2\2Z^\7%\2\2[]\13\2\2\2\\[\3"+
		"\2\2\2]`\3\2\2\2^_\3\2\2\2^\\\3\2\2\2_c\3\2\2\2`^\3\2\2\2ad\5\7\4\2bd"+
		"\7\2\2\3ca\3\2\2\2cb\3\2\2\2de\3\2\2\2ef\b\b\2\2f\20\3\2\2\2gh\7$\2\2"+
		"hi\7$\2\2ij\7$\2\2jn\3\2\2\2km\13\2\2\2lk\3\2\2\2mp\3\2\2\2no\3\2\2\2"+
		"nl\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7$\2\2rs\7$\2\2st\7$\2\2tu\3\2\2\2uv"+
		"\b\t\2\2v\22\3\2\2\2w{\t\b\2\2xz\5\3\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2"+
		"{|\3\2\2\2|\u0080\3\2\2\2}{\3\2\2\2~\u0080\7\62\2\2\177w\3\2\2\2\177~"+
		"\3\2\2\2\u0080\24\3\2\2\2\u0081\u0084\5\5\3\2\u0082\u0084\7a\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u008a\3\2\2\2\u0085\u0089\5\3"+
		"\2\2\u0086\u0089\7a\2\2\u0087\u0089\5\5\3\2\u0088\u0085\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\26\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e"+
		"\7)\2\2\u008e\u008f\13\2\2\2\u008f\u00a3\7)\2\2\u0090\u0091\7)\2\2\u0091"+
		"\u0092\7^\2\2\u0092\u0093\7p\2\2\u0093\u00a3\7)\2\2\u0094\u0095\7)\2\2"+
		"\u0095\u0096\7^\2\2\u0096\u0097\7v\2\2\u0097\u00a3\7)\2\2\u0098\u0099"+
		"\7)\2\2\u0099\u009a\7^\2\2\u009a\u009c\3\2\2\2\u009b\u009d\5\3\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7)\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u008d\3\2\2\2\u00a2\u0090\3\2\2\2\u00a2\u0094\3\2\2\2\u00a2\u0098\3\2"+
		"\2\2\u00a3\30\3\2\2\2\u00a4\u00a7\5\t\5\2\u00a5\u00a7\5\13\6\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\32\3\2\2\2\33\2 #(.\649=CEINSV^cn{"+
		"\177\u0083\u0088\u008a\u009e\u00a2\u00a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from C:/Users/slove/Itmo/tmp/Trans-methods/Lab4/src/Hehe.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HeheLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Comma=6, Var=7, NAME=8, Code=9, 
		Code1=10, String=11, Reg=12, WS=13, DoubleComma=14, QuestMark=15, Excl=16, 
		End=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "Comma", "Var", "NAME", "Code", 
			"Code1", "String", "Reg", "WS", "DoubleComma", "QuestMark", "Excl", "End"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'START'", "'.'", "'return'", "','", null, null, 
			null, null, null, null, null, "':'", "'?'", "'!'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "Comma", "Var", "NAME", "Code", "Code1", 
			"String", "Reg", "WS", "DoubleComma", "QuestMark", "Excl", "End"
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


	public HeheLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hehe.g4"; }

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
		"\u0004\u0000\u0011w\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0004\u0006:\b\u0006\u000b\u0006\f\u0006;\u0001\u0007"+
		"\u0001\u0007\u0005\u0007@\b\u0007\n\u0007\f\u0007C\t\u0007\u0001\b\u0001"+
		"\b\u0005\bG\b\b\n\b\f\bJ\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\tP"+
		"\b\t\n\t\f\tS\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\nY\b\n\n\n\f\n"+
		"\\\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bb\b\u000b\n"+
		"\u000b\f\u000be\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\fj\b\f\u000b"+
		"\f\f\fk\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004HQZc\u0000\u0011\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011\u0001\u0000\u0004\u0003\u0000\'\'AZaz\u0002"+
		"\u0000AZaz\u0003\u000009AZaz\u0003\u0000\t\n\r\r  }\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0001#\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'"+
		"\u0001\u0000\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t/\u0001\u0000"+
		"\u0000\u0000\u000b6\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000"+
		"\u000f=\u0001\u0000\u0000\u0000\u0011D\u0001\u0000\u0000\u0000\u0013M"+
		"\u0001\u0000\u0000\u0000\u0015V\u0001\u0000\u0000\u0000\u0017_\u0001\u0000"+
		"\u0000\u0000\u0019i\u0001\u0000\u0000\u0000\u001bo\u0001\u0000\u0000\u0000"+
		"\u001dq\u0001\u0000\u0000\u0000\u001fs\u0001\u0000\u0000\u0000!u\u0001"+
		"\u0000\u0000\u0000#$\u0005[\u0000\u0000$\u0002\u0001\u0000\u0000\u0000"+
		"%&\u0005]\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005S\u0000\u0000"+
		"()\u0005T\u0000\u0000)*\u0005A\u0000\u0000*+\u0005R\u0000\u0000+,\u0005"+
		"T\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005.\u0000\u0000.\b\u0001"+
		"\u0000\u0000\u0000/0\u0005r\u0000\u000001\u0005e\u0000\u000012\u0005t"+
		"\u0000\u000023\u0005u\u0000\u000034\u0005r\u0000\u000045\u0005n\u0000"+
		"\u00005\n\u0001\u0000\u0000\u000067\u0005,\u0000\u00007\f\u0001\u0000"+
		"\u0000\u00008:\u0007\u0000\u0000\u000098\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<\u000e\u0001\u0000\u0000\u0000=A\u0007\u0001\u0000\u0000>@\u0007\u0002"+
		"\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\u0010\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000DH\u0005{\u0000\u0000EG\t\u0000\u0000"+
		"\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000KL\u0005}\u0000\u0000L\u0012\u0001\u0000\u0000\u0000"+
		"MQ\u0005<\u0000\u0000NP\t\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005>\u0000"+
		"\u0000U\u0014\u0001\u0000\u0000\u0000VZ\u0005\"\u0000\u0000WY\t\u0000"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000]^\u0005\"\u0000\u0000^\u0016\u0001\u0000\u0000"+
		"\u0000_c\u0005%\u0000\u0000`b\t\u0000\u0000\u0000a`\u0001\u0000\u0000"+
		"\u0000be\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005"+
		"%\u0000\u0000g\u0018\u0001\u0000\u0000\u0000hj\u0007\u0003\u0000\u0000"+
		"ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0006\f\u0000"+
		"\u0000n\u001a\u0001\u0000\u0000\u0000op\u0005:\u0000\u0000p\u001c\u0001"+
		"\u0000\u0000\u0000qr\u0005?\u0000\u0000r\u001e\u0001\u0000\u0000\u0000"+
		"st\u0005!\u0000\u0000t \u0001\u0000\u0000\u0000uv\u0005;\u0000\u0000v"+
		"\"\u0001\u0000\u0000\u0000\b\u0000;AHQZck\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
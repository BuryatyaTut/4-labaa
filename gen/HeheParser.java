// Generated from C:/Users/slove/Itmo/tmp/Trans-methods/Lab4/src/Hehe.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HeheParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Comma=6, Var=7, NAME=8, Code=9, 
		Code1=10, String=11, Reg=12, WS=13, DoubleComma=14, QuestMark=15, Excl=16, 
		End=17;
	public static final int
		RULE_main = 0, RULE_all = 1, RULE_makeRule = 2, RULE_makeTerminal = 3, 
		RULE_apply = 4, RULE_applyNotTerminal = 5, RULE_applyTerminal = 6, RULE_arguments = 7, 
		RULE_start = 8, RULE_arg = 9, RULE_otherArgs = 10, RULE_return = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "all", "makeRule", "makeTerminal", "apply", "applyNotTerminal", 
			"applyTerminal", "arguments", "start", "arg", "otherArgs", "return"
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

	@Override
	public String getGrammarFileName() { return "Hehe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HeheParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public List<AllContext> all() {
			return getRuleContexts(AllContext.class);
		}
		public AllContext all(int i) {
			return getRuleContext(AllContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeheVisitor ) return ((HeheVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			start();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Var || _la==QuestMark) {
				{
				{
				setState(25);
				all();
				}
				}
				setState(30);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AllContext extends ParserRuleContext {
		public MakeTerminalContext makeTerminal() {
			return getRuleContext(MakeTerminalContext.class,0);
		}
		public MakeRuleContext makeRule() {
			return getRuleContext(MakeRuleContext.class,0);
		}
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeheVisitor ) return ((HeheVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_all);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				makeTerminal();
				}
				break;
			case QuestMark:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				makeRule();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MakeRuleContext extends ParserRuleContext {
		public TerminalNode QuestMark() { return getToken(HeheParser.QuestMark, 0); }
		public TerminalNode Var() { return getToken(HeheParser.Var, 0); }
		public TerminalNode DoubleComma() { return getToken(HeheParser.DoubleComma, 0); }
		public TerminalNode End() { return getToken(HeheParser.End, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public List<ApplyContext> apply() {
			return getRuleContexts(ApplyContext.class);
		}
		public ApplyContext apply(int i) {
			return getRuleContext(ApplyContext.class,i);
		}
		public TerminalNode Code() { return getToken(HeheParser.Code, 0); }
		public MakeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_makeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).enterMakeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).exitMakeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeheVisitor ) return ((HeheVisitor<? extends T>)visitor).visitMakeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MakeRuleContext makeRule() throws RecognitionException {
		MakeRuleContext _localctx = new MakeRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_makeRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(QuestMark);
			setState(36);
			match(Var);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(37);
				arguments();
				}
			}

			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(40);
				return_();
				}
			}

			setState(43);
			match(DoubleComma);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				apply();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Var || _la==Excl );
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Code) {
				{
				setState(49);
				match(Code);
				}
			}

			setState(52);
			match(End);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MakeTerminalContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(HeheParser.Var, 0); }
		public TerminalNode DoubleComma() { return getToken(HeheParser.DoubleComma, 0); }
		public TerminalNode End() { return getToken(HeheParser.End, 0); }
		public TerminalNode String() { return getToken(HeheParser.String, 0); }
		public TerminalNode Reg() { return getToken(HeheParser.Reg, 0); }
		public MakeTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_makeTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).enterMakeTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).exitMakeTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeheVisitor ) return ((HeheVisitor<? extends T>)visitor).visitMakeTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MakeTerminalContext makeTerminal() throws RecognitionException {
		MakeTerminalContext _localctx = new MakeTerminalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_makeTerminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(Var);
			setState(55);
			match(DoubleComma);
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==String || _la==Reg) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(57);
			match(End);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ApplyContext extends ParserRuleContext {
		public ApplyNotTerminalContext applyNotTerminal() {
			return getRuleContext(ApplyNotTerminalContext.class,0);
		}
		public ApplyTerminalContext applyTerminal() {
			return getRuleContext(ApplyTerminalContext.class,0);
		}
		public ApplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).enterApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).exitApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeheVisitor ) return ((HeheVisitor<? extends T>)visitor).visitApply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplyContext apply() throws RecognitionException {
		ApplyContext _localctx = new ApplyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_apply);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Excl:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				applyNotTerminal();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				applyTerminal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ApplyNotTerminalContext extends ParserRuleContext {
		public TerminalNode Excl() { return getToken(HeheParser.Excl, 0); }
		public TerminalNode Var() { return getToken(HeheParser.Var, 0); }
		public TerminalNode Code1() { return getToken(HeheParser.Code1, 0); }
		public ApplyNotTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyNotTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).enterApplyNotTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).exitApplyNotTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeheVisitor ) return ((HeheVisitor<? extends T>)visitor).visitApplyNotTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplyNotTerminalContext applyNotTerminal() throws RecognitionException {
		ApplyNotTerminalContext _localctx = new ApplyNotTerminalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_applyNotTerminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(Excl);
			setState(64);
			match(Var);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Code1) {
				{
				setState(65);
				match(Code1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ApplyTerminalContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(HeheParser.Var, 0); }
		public ApplyTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).enterApplyTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).exitApplyTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeheVisitor ) return ((HeheVisitor<? extends T>)visitor).visitApplyTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplyTerminalContext applyTerminal() throws RecognitionException {
		ApplyTerminalContext _localctx = new ApplyTerminalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_applyTerminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(Var);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public List<OtherArgsContext> otherArgs() {
			return getRuleContexts(OtherArgsContext.class);
		}
		public OtherArgsContext otherArgs(int i) {
			return getRuleContext(OtherArgsContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeheVisitor ) return ((HeheVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__0);
			setState(71);
			arg();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(72);
				otherArgs();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(HeheParser.Var, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeheVisitor ) return ((HeheVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__2);
			setState(81);
			match(Var);
			setState(82);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(HeheParser.Var, 0); }
		public TerminalNode NAME() { return getToken(HeheParser.NAME, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeheVisitor ) return ((HeheVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(Var);
			setState(85);
			match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OtherArgsContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(HeheParser.Comma, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public OtherArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).enterOtherArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).exitOtherArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeheVisitor ) return ((HeheVisitor<? extends T>)visitor).visitOtherArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherArgsContext otherArgs() throws RecognitionException {
		OtherArgsContext _localctx = new OtherArgsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_otherArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(Comma);
			setState(88);
			arg();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HeheListener ) ((HeheListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeheVisitor ) return ((HeheVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__4);
			setState(91);
			match(T__0);
			setState(92);
			arg();
			setState(93);
			match(T__1);
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
		"\u0004\u0001\u0011`\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0002\u0003\u0002*\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002.\b\u0002\u000b\u0002\f\u0002/\u0001\u0002"+
		"\u0003\u00023\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		">\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005C\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007J\b"+
		"\u0007\n\u0007\f\u0007M\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0000"+
		"\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000"+
		"\u0001\u0001\u0000\u000b\f\\\u0000\u0018\u0001\u0000\u0000\u0000\u0002"+
		"!\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u00066\u0001"+
		"\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000"+
		"\fD\u0001\u0000\u0000\u0000\u000eF\u0001\u0000\u0000\u0000\u0010P\u0001"+
		"\u0000\u0000\u0000\u0012T\u0001\u0000\u0000\u0000\u0014W\u0001\u0000\u0000"+
		"\u0000\u0016Z\u0001\u0000\u0000\u0000\u0018\u001c\u0003\u0010\b\u0000"+
		"\u0019\u001b\u0003\u0002\u0001\u0000\u001a\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u0001\u0001\u0000\u0000\u0000"+
		"\u001e\u001c\u0001\u0000\u0000\u0000\u001f\"\u0003\u0006\u0003\u0000 "+
		"\"\u0003\u0004\u0002\u0000!\u001f\u0001\u0000\u0000\u0000! \u0001\u0000"+
		"\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#$\u0005\u000f\u0000\u0000"+
		"$&\u0005\u0007\u0000\u0000%\'\u0003\u000e\u0007\u0000&%\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(*\u0003\u0016"+
		"\u000b\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+-\u0005\u000e\u0000\u0000,.\u0003\b\u0004\u0000-,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u000013\u0005\t\u0000\u0000"+
		"21\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000045\u0005\u0011\u0000\u00005\u0005\u0001\u0000\u0000\u000067\u0005"+
		"\u0007\u0000\u000078\u0005\u000e\u0000\u000089\u0007\u0000\u0000\u0000"+
		"9:\u0005\u0011\u0000\u0000:\u0007\u0001\u0000\u0000\u0000;>\u0003\n\u0005"+
		"\u0000<>\u0003\f\u0006\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000"+
		"\u0000>\t\u0001\u0000\u0000\u0000?@\u0005\u0010\u0000\u0000@B\u0005\u0007"+
		"\u0000\u0000AC\u0005\n\u0000\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000C\u000b\u0001\u0000\u0000\u0000DE\u0005\u0007\u0000\u0000"+
		"E\r\u0001\u0000\u0000\u0000FG\u0005\u0001\u0000\u0000GK\u0003\u0012\t"+
		"\u0000HJ\u0003\u0014\n\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0005\u0002\u0000\u0000O\u000f"+
		"\u0001\u0000\u0000\u0000PQ\u0005\u0003\u0000\u0000QR\u0005\u0007\u0000"+
		"\u0000RS\u0005\u0004\u0000\u0000S\u0011\u0001\u0000\u0000\u0000TU\u0005"+
		"\u0007\u0000\u0000UV\u0005\b\u0000\u0000V\u0013\u0001\u0000\u0000\u0000"+
		"WX\u0005\u0006\u0000\u0000XY\u0003\u0012\t\u0000Y\u0015\u0001\u0000\u0000"+
		"\u0000Z[\u0005\u0005\u0000\u0000[\\\u0005\u0001\u0000\u0000\\]\u0003\u0012"+
		"\t\u0000]^\u0005\u0002\u0000\u0000^\u0017\u0001\u0000\u0000\u0000\t\u001c"+
		"!&)/2=BK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from C:/Users/usuario/Desktop/Eii/AÑO 3 GRADO INGENIERIA INFORMATICA/Diseño de Lenguaje de Programacion/DLP_Repo_Project/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, TRASH=38, 
		ONE_LINE_COMMENT=39, MULTI_LINE_COMMENT=40, INT_CONSTANT=41, ID=42, CHAR_CONSTANT=43, 
		REAL_CONSTANT=44;
	public static final int
		RULE_program = 0, RULE_funcDefinition = 1, RULE_mainProgram = 2, RULE_functionBody = 3, 
		RULE_statement = 4, RULE_stmBody = 5, RULE_variableDefinition = 6, RULE_variable = 7, 
		RULE_expression = 8, RULE_type = 9, RULE_builtInType = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "funcDefinition", "mainProgram", "functionBody", "statement", 
			"stmBody", "variableDefinition", "variable", "expression", "type", "builtInType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "','", "')'", "':'", "'main'", "'{'", "'}'", "'print'", 
			"'input'", "';'", "'='", "'if'", "'else'", "'while'", "'return'", "'['", 
			"']'", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", 
			"'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", "'struct'", "'char'", 
			"'int'", "'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TRASH", "ONE_LINE_COMMENT", "MULTI_LINE_COMMENT", "INT_CONSTANT", 
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

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainProgramContext mainProgram() {
			return getRuleContext(MainProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<FuncDefinitionContext> funcDefinition() {
			return getRuleContexts(FuncDefinitionContext.class);
		}
		public FuncDefinitionContext funcDefinition(int i) {
			return getRuleContext(FuncDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(24);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(22);
						variableDefinition();
						}
						break;
					case T__0:
						{
						setState(23);
						funcDefinition();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(29);
			mainProgram();
			setState(30);
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

	public static class FuncDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterFuncDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitFuncDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			match(ID);
			setState(34);
			match(T__1);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(35);
				variable();
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(36);
					match(T__2);
					setState(37);
					variable();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(45);
			match(T__3);
			setState(46);
			match(T__4);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) {
				{
				setState(47);
				builtInType();
				}
			}

			setState(50);
			functionBody();
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

	public static class MainProgramContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public MainProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterMainProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitMainProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMainProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainProgramContext mainProgram() throws RecognitionException {
		MainProgramContext _localctx = new MainProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			match(T__5);
			setState(54);
			match(T__1);
			setState(55);
			match(T__3);
			setState(56);
			match(T__4);
			setState(57);
			functionBody();
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__6);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					variableDefinition();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(T__7);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StmBodyContext> stmBody() {
			return getRuleContexts(StmBodyContext.class);
		}
		public StmBodyContext stmBody(int i) {
			return getRuleContext(StmBodyContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(75);
				expression(0);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(76);
					match(T__2);
					setState(77);
					expression(0);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				expression(0);
				setState(86);
				match(T__11);
				setState(87);
				expression(0);
				setState(88);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(T__12);
				setState(91);
				expression(0);
				setState(92);
				match(T__4);
				setState(93);
				stmBody();
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(94);
					match(T__13);
					setState(95);
					stmBody();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(T__14);
				setState(99);
				expression(0);
				setState(100);
				match(T__4);
				setState(101);
				stmBody();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(T__15);
				setState(104);
				expression(0);
				setState(105);
				match(T__10);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				match(ID);
				setState(108);
				match(T__1);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(109);
					expression(0);
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(110);
						match(T__2);
						setState(111);
						expression(0);
						}
						}
						setState(116);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(119);
				match(T__3);
				setState(120);
				match(T__10);
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

	public static class StmBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StmBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterStmBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitStmBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStmBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmBodyContext stmBody() throws RecognitionException {
		StmBodyContext _localctx = new StmBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmBody);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__6);
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					statement();
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(129);
				match(T__7);
				}
				break;
			case T__1:
			case T__8:
			case T__9:
			case T__12:
			case T__14:
			case T__15:
			case T__19:
			case T__20:
			case INT_CONSTANT:
			case ID:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				statement();
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

	public static class VariableDefinitionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			variable();
			setState(135);
			match(T__10);
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ID);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(138);
				match(T__2);
				setState(139);
				match(ID);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(T__4);
			setState(146);
			type();
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
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(149);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(150);
				match(CHAR_CONSTANT);
				}
				break;
			case 3:
				{
				setState(151);
				match(REAL_CONSTANT);
				}
				break;
			case 4:
				{
				setState(152);
				match(ID);
				}
				break;
			case 5:
				{
				setState(153);
				match(ID);
				setState(154);
				match(T__1);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(155);
					expression(0);
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(156);
						match(T__2);
						setState(157);
						expression(0);
						}
						}
						setState(162);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(165);
				match(T__3);
				}
				break;
			case 6:
				{
				setState(166);
				match(T__1);
				setState(167);
				type();
				setState(168);
				match(T__3);
				setState(169);
				expression(7);
				}
				break;
			case 7:
				{
				setState(171);
				match(T__19);
				setState(172);
				expression(6);
				}
				break;
			case 8:
				{
				setState(173);
				match(T__20);
				setState(174);
				expression(5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(178);
						match(T__18);
						setState(179);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(181);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(184);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__24) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(187);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(188);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(190);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						expression(2);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(193);
						match(T__16);
						setState(194);
						expression(0);
						setState(195);
						match(T__17);
						}
						break;
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				builtInType();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__16);
				setState(204);
				match(INT_CONSTANT);
				setState(205);
				match(T__17);
				setState(206);
				type();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(T__33);
				setState(208);
				match(T__6);
				{
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(209);
					variableDefinition();
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				setState(214);
				match(T__7);
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

	public static class BuiltInTypeContext extends ParserRuleContext {
		public BuiltInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterBuiltInType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitBuiltInType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBuiltInType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInTypeContext builtInType() throws RecognitionException {
		BuiltInTypeContext _localctx = new BuiltInTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_builtInType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00df\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\5\3.\n\3\3\3\3\3\3\3\5\3\63\n\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5@\n\5\f\5\16\5C\13\5\3"+
		"\5\7\5F\n\5\f\5\16\5I\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6c\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6s\n\6\f\6\16\6"+
		"v\13\6\5\6x\n\6\3\6\3\6\5\6|\n\6\3\7\3\7\6\7\u0080\n\7\r\7\16\7\u0081"+
		"\3\7\3\7\3\7\5\7\u0087\n\7\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u008f\n\t\f\t\16"+
		"\t\u0092\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00a1\n\n\f\n\16\n\u00a4\13\n\5\n\u00a6\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00b2\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c8\n\n\f\n\16\n\u00cb\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00d5\n\13\r\13\16\13"+
		"\u00d6\3\13\3\13\5\13\u00db\n\13\3\f\3\f\3\f\2\3\22\r\2\4\6\b\n\f\16\20"+
		"\22\24\26\2\b\3\2\13\f\3\2\30\32\4\2\26\26\33\33\3\2\34!\3\2\"#\3\2%\'"+
		"\2\u00f8\2\34\3\2\2\2\4\"\3\2\2\2\6\66\3\2\2\2\b=\3\2\2\2\n{\3\2\2\2\f"+
		"\u0086\3\2\2\2\16\u0088\3\2\2\2\20\u008b\3\2\2\2\22\u00b1\3\2\2\2\24\u00da"+
		"\3\2\2\2\26\u00dc\3\2\2\2\30\33\5\16\b\2\31\33\5\4\3\2\32\30\3\2\2\2\32"+
		"\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36"+
		"\34\3\2\2\2\37 \5\6\4\2 !\7\2\2\3!\3\3\2\2\2\"#\7\3\2\2#$\7,\2\2$-\7\4"+
		"\2\2%*\5\20\t\2&\'\7\5\2\2\')\5\20\t\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*"+
		"+\3\2\2\2+.\3\2\2\2,*\3\2\2\2-%\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\6\2"+
		"\2\60\62\7\7\2\2\61\63\5\26\f\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2"+
		"\2\2\64\65\5\b\5\2\65\5\3\2\2\2\66\67\7\3\2\2\678\7\b\2\289\7\4\2\29:"+
		"\7\6\2\2:;\7\7\2\2;<\5\b\5\2<\7\3\2\2\2=A\7\t\2\2>@\5\16\b\2?>\3\2\2\2"+
		"@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\n\6\2ED\3\2\2\2"+
		"FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\n\2\2K\t\3\2\2"+
		"\2LM\t\2\2\2MR\5\22\n\2NO\7\5\2\2OQ\5\22\n\2PN\3\2\2\2QT\3\2\2\2RP\3\2"+
		"\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\r\2\2V|\3\2\2\2WX\5\22\n\2XY\7"+
		"\16\2\2YZ\5\22\n\2Z[\7\r\2\2[|\3\2\2\2\\]\7\17\2\2]^\5\22\n\2^_\7\7\2"+
		"\2_b\5\f\7\2`a\7\20\2\2ac\5\f\7\2b`\3\2\2\2bc\3\2\2\2c|\3\2\2\2de\7\21"+
		"\2\2ef\5\22\n\2fg\7\7\2\2gh\5\f\7\2h|\3\2\2\2ij\7\22\2\2jk\5\22\n\2kl"+
		"\7\r\2\2l|\3\2\2\2mn\7,\2\2nw\7\4\2\2ot\5\22\n\2pq\7\5\2\2qs\5\22\n\2"+
		"rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wo\3\2\2\2"+
		"wx\3\2\2\2xy\3\2\2\2yz\7\6\2\2z|\7\r\2\2{L\3\2\2\2{W\3\2\2\2{\\\3\2\2"+
		"\2{d\3\2\2\2{i\3\2\2\2{m\3\2\2\2|\13\3\2\2\2}\177\7\t\2\2~\u0080\5\n\6"+
		"\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\n\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0087\5\n\6\2\u0086}\3\2\2\2\u0086\u0085\3\2\2\2\u0087\r\3\2\2\2\u0088"+
		"\u0089\5\20\t\2\u0089\u008a\7\r\2\2\u008a\17\3\2\2\2\u008b\u0090\7,\2"+
		"\2\u008c\u008d\7\5\2\2\u008d\u008f\7,\2\2\u008e\u008c\3\2\2\2\u008f\u0092"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\7\7\2\2\u0094\u0095\5\24\13\2\u0095\21\3\2"+
		"\2\2\u0096\u0097\b\n\1\2\u0097\u00b2\7+\2\2\u0098\u00b2\7-\2\2\u0099\u00b2"+
		"\7.\2\2\u009a\u00b2\7,\2\2\u009b\u009c\7,\2\2\u009c\u00a5\7\4\2\2\u009d"+
		"\u00a2\5\22\n\2\u009e\u009f\7\5\2\2\u009f\u00a1\5\22\n\2\u00a0\u009e\3"+
		"\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00b2\7\6\2\2\u00a8\u00a9\7\4\2\2\u00a9"+
		"\u00aa\5\24\13\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac\5\22\n\t\u00ac\u00b2"+
		"\3\2\2\2\u00ad\u00ae\7\26\2\2\u00ae\u00b2\5\22\n\b\u00af\u00b0\7\27\2"+
		"\2\u00b0\u00b2\5\22\n\7\u00b1\u0096\3\2\2\2\u00b1\u0098\3\2\2\2\u00b1"+
		"\u0099\3\2\2\2\u00b1\u009a\3\2\2\2\u00b1\u009b\3\2\2\2\u00b1\u00a8\3\2"+
		"\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00c9\3\2\2\2\u00b3"+
		"\u00b4\f\n\2\2\u00b4\u00b5\7\25\2\2\u00b5\u00c8\5\22\n\13\u00b6\u00b7"+
		"\f\6\2\2\u00b7\u00b8\t\3\2\2\u00b8\u00c8\5\22\n\7\u00b9\u00ba\f\5\2\2"+
		"\u00ba\u00bb\t\4\2\2\u00bb\u00c8\5\22\n\6\u00bc\u00bd\f\4\2\2\u00bd\u00be"+
		"\t\5\2\2\u00be\u00c8\5\22\n\5\u00bf\u00c0\f\3\2\2\u00c0\u00c1\t\6\2\2"+
		"\u00c1\u00c8\5\22\n\4\u00c2\u00c3\f\13\2\2\u00c3\u00c4\7\23\2\2\u00c4"+
		"\u00c5\5\22\n\2\u00c5\u00c6\7\24\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00b3\3"+
		"\2\2\2\u00c7\u00b6\3\2\2\2\u00c7\u00b9\3\2\2\2\u00c7\u00bc\3\2\2\2\u00c7"+
		"\u00bf\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\23\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00db"+
		"\5\26\f\2\u00cd\u00ce\7\23\2\2\u00ce\u00cf\7+\2\2\u00cf\u00d0\7\24\2\2"+
		"\u00d0\u00db\5\24\13\2\u00d1\u00d2\7$\2\2\u00d2\u00d4\7\t\2\2\u00d3\u00d5"+
		"\5\16\b\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\n\2\2\u00d9\u00db"+
		"\3\2\2\2\u00da\u00cc\3\2\2\2\u00da\u00cd\3\2\2\2\u00da\u00d1\3\2\2\2\u00db"+
		"\25\3\2\2\2\u00dc\u00dd\t\7\2\2\u00dd\27\3\2\2\2\30\32\34*-\62AGRbtw{"+
		"\u0081\u0086\u0090\u00a2\u00a5\u00b1\u00c7\u00c9\u00d6\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
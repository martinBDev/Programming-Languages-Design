// Generated from C:/Users/usuario/Desktop/Eii/AÑO 3 GRADO INGENIERIA INFORMATICA/Diseño de Lenguaje de Programacion/DLP_Repo_Project/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import ast.definition.*;
import ast.expression.*;
import ast.node.*;
import ast.statement.*;
import ast.type.*;
import ast.type.Integer;
import ast.type.Double;
import ast.*;


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
		RULE_program = 0, RULE_funcDefinition = 1, RULE_mainProgram = 2, RULE_statement = 3, 
		RULE_stmBody = 4, RULE_variableDefinition = 5, RULE_variable = 6, RULE_expression = 7, 
		RULE_type = 8, RULE_builtInType = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "funcDefinition", "mainProgram", "statement", "stmBody", "variableDefinition", 
			"variable", "expression", "type", "builtInType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "','", "')'", "':'", "'{'", "'}'", "'main'", "'print'", 
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
		public AstNode ast;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((ProgramContext)_localctx).expression = expression(0);
			((ProgramContext)_localctx).ast =  ((ProgramContext)_localctx).expression.ast;
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(T__0);
			setState(24);
			match(ID);
			setState(25);
			match(T__1);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(26);
				variable();
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(27);
					match(T__2);
					setState(28);
					variable();
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(36);
			match(T__3);
			setState(37);
			match(T__4);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) {
				{
				setState(38);
				builtInType();
				}
			}

			setState(41);
			match(T__5);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					variableDefinition();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(T__6);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			match(T__7);
			setState(58);
			match(T__1);
			setState(59);
			match(T__3);
			setState(60);
			match(T__4);
			setState(61);
			match(T__5);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					variableDefinition();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__6);
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
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(77);
				expression(0);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(78);
					match(T__2);
					setState(79);
					expression(0);
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				expression(0);
				setState(88);
				match(T__11);
				setState(89);
				expression(0);
				setState(90);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(T__12);
				setState(93);
				expression(0);
				setState(94);
				match(T__4);
				setState(95);
				stmBody();
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(96);
					match(T__13);
					setState(97);
					stmBody();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(T__14);
				setState(101);
				expression(0);
				setState(102);
				match(T__4);
				setState(103);
				stmBody();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				match(T__15);
				setState(106);
				expression(0);
				setState(107);
				match(T__10);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				match(ID);
				setState(110);
				match(T__1);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(111);
					expression(0);
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(112);
						match(T__2);
						setState(113);
						expression(0);
						}
						}
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(121);
				match(T__3);
				setState(122);
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
		enterRule(_localctx, 8, RULE_stmBody);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__5);
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(126);
					statement();
					}
					}
					setState(129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(131);
				match(T__6);
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
				setState(133);
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
		public List<VariableDefinition> ast;
		public VariableContext v1;
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
		enterRule(_localctx, 10, RULE_variableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((VariableDefinitionContext)_localctx).v1 = variable();
			((VariableDefinitionContext)_localctx).ast =  ((VariableDefinitionContext)_localctx).v1.ast;
			setState(138);
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
		public List<VariableDefinition> ast;
		public Token i1;
		public Token id2;
		public TypeContext t1;
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
		enterRule(_localctx, 12, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((VariableContext)_localctx).i1 = match(ID);

			                                                      List<VariableDefinition> list = new ArrayList<>();
			                                                      list.add(new VariableDefinition(((VariableContext)_localctx).i1.getLine(),
			                                                                                      ((VariableContext)_localctx).i1.getCharPositionInLine(),
			                                                                                      (((VariableContext)_localctx).i1!=null?((VariableContext)_localctx).i1.getText():null),
			                                                                                      null));
			                                                    
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(142);
				match(T__2);
				setState(143);
				((VariableContext)_localctx).id2 = match(ID);

				                                                                     list.add(new VariableDefinition(((VariableContext)_localctx).id2.getLine(),
				                                                                                                     ((VariableContext)_localctx).id2.getCharPositionInLine(),
				                                                                                                     (((VariableContext)_localctx).id2!=null?((VariableContext)_localctx).id2.getText():null),
				                                                                                                     null));
				                                                                    
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(T__4);
			setState(151);
			((VariableContext)_localctx).t1 = type();

			                                                                     for(VariableDefinition vd : list){vd.setType(((VariableContext)_localctx).t1.ast);}

			                                                                    
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
		public Expression ast;
		public ExpressionContext ep1;
		public Token ID;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public ExpressionContext ep2;
		public TypeContext t1;
		public ExpressionContext e;
		public Token OP;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(155);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(),
				                    ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				{
				setState(157);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				                                       ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,
				                                       LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 3:
				{
				setState(159);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				                                                           ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,
				                                                           LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(161);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				                                            ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,
				                                            LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 5:
				{
				setState(163);
				((ExpressionContext)_localctx).ID = match(ID);

				                     FunctionInvocation fi = new FunctionInvocation(((ExpressionContext)_localctx).ID.getLine(),
				                                                   ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,
				                                                   new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)));
				           
				setState(165);
				match(T__1);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(166);
					((ExpressionContext)_localctx).ep1 = expression(0);
					fi.addExpression(((ExpressionContext)_localctx).ep1.ast);
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(168);
						match(T__2);
						setState(169);
						((ExpressionContext)_localctx).ep2 = expression(0);
						fi.addExpression(((ExpressionContext)_localctx).ep2.ast);
						}
						}
						setState(176);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(179);
				match(T__3);
				((ExpressionContext)_localctx).ast = fi;
				}
				break;
			case 6:
				{
				setState(181);
				match(T__1);
				setState(182);
				((ExpressionContext)_localctx).t1 = type();
				setState(183);
				match(T__3);
				setState(184);
				((ExpressionContext)_localctx).ep1 = expression(7);

				                ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).t1.ast.getLine(), ((ExpressionContext)_localctx).t1.ast.getColumn(),((ExpressionContext)_localctx).t1.ast,((ExpressionContext)_localctx).ep1.ast);
				        
				}
				break;
			case 7:
				{
				setState(187);
				match(T__19);
				setState(188);
				((ExpressionContext)_localctx).e = expression(6);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e.ast.getLine(),((ExpressionContext)_localctx).e.ast.getColumn(),((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 8:
				{
				setState(191);
				match(T__20);
				setState(192);
				((ExpressionContext)_localctx).e = expression(5);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).e.ast.getLine(),((ExpressionContext)_localctx).e.ast.getColumn(),((ExpressionContext)_localctx).e.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ep1 = _prevctx;
						_localctx.ep1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(198);
						match(T__18);
						setState(199);
						((ExpressionContext)_localctx).ep2 = expression(9);

						                          ((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).ep1.ast.getLine(), ((ExpressionContext)_localctx).ep1.ast.getColumn(), ((ExpressionContext)_localctx).ep1.ast, (((ExpressionContext)_localctx).ep2!=null?_input.getText(((ExpressionContext)_localctx).ep2.start,((ExpressionContext)_localctx).ep2.stop):null));
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ep1 = _prevctx;
						_localctx.ep1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(203);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						((ExpressionContext)_localctx).ep2 = expression(5);

						                      ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).ep1.ast.getLine(),
						                                            ((ExpressionContext)_localctx).ep1.ast.getColumn(),
						                                            ((ExpressionContext)_localctx).ep1.ast,
						                                            (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),
						                                            ((ExpressionContext)_localctx).ep2.ast);
						                  
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ep1 = _prevctx;
						_localctx.ep1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__24) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(209);
						((ExpressionContext)_localctx).ep2 = expression(4);

						                      ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).ep1.ast.getLine(),
						                                            ((ExpressionContext)_localctx).ep1.ast.getColumn(),
						                                            ((ExpressionContext)_localctx).ep1.ast,
						                                            (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),
						                                            ((ExpressionContext)_localctx).ep2.ast);
						              
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ep1 = _prevctx;
						_localctx.ep1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(213);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(214);
						((ExpressionContext)_localctx).ep2 = expression(3);

						                  ((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).ep1.ast.getLine(),
						                                        ((ExpressionContext)_localctx).ep1.ast.getColumn(),
						                                        ((ExpressionContext)_localctx).ep1.ast,
						                                        ((ExpressionContext)_localctx).ep2.ast,
						                                        (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						              
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ep1 = _prevctx;
						_localctx.ep1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(218);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(219);
						((ExpressionContext)_localctx).ep2 = expression(2);

						                  ((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).ep1.ast.getLine(),
						                                        ((ExpressionContext)_localctx).ep1.ast.getColumn(),
						                                        ((ExpressionContext)_localctx).ep1.ast,
						                                        ((ExpressionContext)_localctx).ep2.ast,
						                                        (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						              
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ep1 = _prevctx;
						_localctx.ep1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(223);
						match(T__16);
						setState(224);
						((ExpressionContext)_localctx).ep2 = expression(0);
						setState(225);
						match(T__17);

						                      ((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).ep1.ast.getLine(), ((ExpressionContext)_localctx).ep1.ast.getColumn(), ((ExpressionContext)_localctx).ep1.ast, ((ExpressionContext)_localctx).ep2.ast);
						                  
						}
						break;
					}
					} 
				}
				setState(232);
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
		public Type ast;
		public List<RecordField> fields = new ArrayList<RecordField>();
		public BuiltInTypeContext b1;
		public Token I1;
		public TypeContext t;
		public VariableDefinitionContext v;
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
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				((TypeContext)_localctx).b1 = builtInType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).b1.ast;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(T__16);
				setState(237);
				((TypeContext)_localctx).I1 = match(INT_CONSTANT);
				setState(238);
				match(T__17);
				setState(239);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).ast =  new Array(((TypeContext)_localctx).I1.getLine(),((TypeContext)_localctx).I1.getCharPositionInLine(),
				                                        LexerHelper.lexemeToInt((((TypeContext)_localctx).I1!=null?((TypeContext)_localctx).I1.getText():null)),
				                                        ((TypeContext)_localctx).t.ast);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(T__33);
				setState(243);
				match(T__5);
				{
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(244);
					((TypeContext)_localctx).v = variableDefinition();


					                                        for(VariableDefinition df : ((TypeContext)_localctx).v.ast){
					                                               _localctx.fields.add( new RecordField(df.getName(),
					                                                                           df.getType()
					                                                                           )
					                                                          );
					                                         }


					                                      
					}
					}
					setState(249); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				setState(251);
				match(T__6);

				                                    Struct st = new Struct(((TypeContext)_localctx).v.ast.get(0).getLine(), ((TypeContext)_localctx).v.ast.get(0).getColumn());
				                                    for(RecordField rf : _localctx.fields){st.addField(rf);}
				                                    ((TypeContext)_localctx).ast =  st;
				                                  
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
		public Type ast;
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
		enterRule(_localctx, 18, RULE_builtInType);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(T__34);
				((BuiltInTypeContext)_localctx).ast =  Char.getInstance();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(T__35);
				((BuiltInTypeContext)_localctx).ast =  Integer.getInstance();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(T__36);
				((BuiltInTypeContext)_localctx).ast =  Double.getInstance();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u010b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\5\3%\n"+
		"\3\3\3\3\3\3\3\5\3*\n\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\7\3\64\n"+
		"\3\f\3\16\3\67\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4B\n\4\f\4\16"+
		"\4E\13\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5S\n\5"+
		"\f\5\16\5V\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5e\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5u\n"+
		"\5\f\5\16\5x\13\5\5\5z\n\5\3\5\3\5\5\5~\n\5\3\6\3\6\6\6\u0082\n\6\r\6"+
		"\16\6\u0083\3\6\3\6\3\6\5\6\u0089\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\u0094\n\b\f\b\16\b\u0097\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00af\n\t"+
		"\f\t\16\t\u00b2\13\t\5\t\u00b4\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c6\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00e7\n\t\f\t\16\t\u00ea\13\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00fa\n\n\r\n\16\n"+
		"\u00fb\3\n\3\n\3\n\5\n\u0101\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0109"+
		"\n\13\3\13\2\3\20\f\2\4\6\b\n\f\16\20\22\24\2\7\3\2\13\f\3\2\30\32\4\2"+
		"\26\26\33\33\3\2\34!\3\2\"#\2\u0127\2\26\3\2\2\2\4\31\3\2\2\2\6:\3\2\2"+
		"\2\b}\3\2\2\2\n\u0088\3\2\2\2\f\u008a\3\2\2\2\16\u008e\3\2\2\2\20\u00c5"+
		"\3\2\2\2\22\u0100\3\2\2\2\24\u0108\3\2\2\2\26\27\5\20\t\2\27\30\b\2\1"+
		"\2\30\3\3\2\2\2\31\32\7\3\2\2\32\33\7,\2\2\33$\7\4\2\2\34!\5\16\b\2\35"+
		"\36\7\5\2\2\36 \5\16\b\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2"+
		"\2\"%\3\2\2\2#!\3\2\2\2$\34\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\6\2\2\')"+
		"\7\7\2\2(*\5\24\13\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+/\7\b\2\2,.\5\f\7\2"+
		"-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\65\3\2\2\2\61/\3\2\2\2"+
		"\62\64\5\b\5\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2"+
		"\668\3\2\2\2\67\65\3\2\2\289\7\t\2\29\5\3\2\2\2:;\7\3\2\2;<\7\n\2\2<="+
		"\7\4\2\2=>\7\6\2\2>?\7\7\2\2?C\7\b\2\2@B\5\f\7\2A@\3\2\2\2BE\3\2\2\2C"+
		"A\3\2\2\2CD\3\2\2\2DI\3\2\2\2EC\3\2\2\2FH\5\b\5\2GF\3\2\2\2HK\3\2\2\2"+
		"IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\t\2\2M\7\3\2\2\2NO\t\2\2"+
		"\2OT\5\20\t\2PQ\7\5\2\2QS\5\20\t\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2"+
		"\2\2UW\3\2\2\2VT\3\2\2\2WX\7\r\2\2X~\3\2\2\2YZ\5\20\t\2Z[\7\16\2\2[\\"+
		"\5\20\t\2\\]\7\r\2\2]~\3\2\2\2^_\7\17\2\2_`\5\20\t\2`a\7\7\2\2ad\5\n\6"+
		"\2bc\7\20\2\2ce\5\n\6\2db\3\2\2\2de\3\2\2\2e~\3\2\2\2fg\7\21\2\2gh\5\20"+
		"\t\2hi\7\7\2\2ij\5\n\6\2j~\3\2\2\2kl\7\22\2\2lm\5\20\t\2mn\7\r\2\2n~\3"+
		"\2\2\2op\7,\2\2py\7\4\2\2qv\5\20\t\2rs\7\5\2\2su\5\20\t\2tr\3\2\2\2ux"+
		"\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2yq\3\2\2\2yz\3\2\2\2z"+
		"{\3\2\2\2{|\7\6\2\2|~\7\r\2\2}N\3\2\2\2}Y\3\2\2\2}^\3\2\2\2}f\3\2\2\2"+
		"}k\3\2\2\2}o\3\2\2\2~\t\3\2\2\2\177\u0081\7\b\2\2\u0080\u0082\5\b\5\2"+
		"\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\t\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0089\5\b\5\2\u0088\177\3\2\2\2\u0088\u0087\3\2\2\2\u0089\13\3\2\2\2"+
		"\u008a\u008b\5\16\b\2\u008b\u008c\b\7\1\2\u008c\u008d\7\r\2\2\u008d\r"+
		"\3\2\2\2\u008e\u008f\7,\2\2\u008f\u0095\b\b\1\2\u0090\u0091\7\5\2\2\u0091"+
		"\u0092\7,\2\2\u0092\u0094\b\b\1\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7\7\2\2\u0099\u009a\5\22\n\2\u009a\u009b\b"+
		"\b\1\2\u009b\17\3\2\2\2\u009c\u009d\b\t\1\2\u009d\u009e\7,\2\2\u009e\u00c6"+
		"\b\t\1\2\u009f\u00a0\7+\2\2\u00a0\u00c6\b\t\1\2\u00a1\u00a2\7.\2\2\u00a2"+
		"\u00c6\b\t\1\2\u00a3\u00a4\7-\2\2\u00a4\u00c6\b\t\1\2\u00a5\u00a6\7,\2"+
		"\2\u00a6\u00a7\b\t\1\2\u00a7\u00b3\7\4\2\2\u00a8\u00a9\5\20\t\2\u00a9"+
		"\u00b0\b\t\1\2\u00aa\u00ab\7\5\2\2\u00ab\u00ac\5\20\t\2\u00ac\u00ad\b"+
		"\t\1\2\u00ad\u00af\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\7\6\2\2\u00b6\u00c6\b\t\1\2\u00b7\u00b8\7\4\2\2\u00b8\u00b9\5\22"+
		"\n\2\u00b9\u00ba\7\6\2\2\u00ba\u00bb\5\20\t\t\u00bb\u00bc\b\t\1\2\u00bc"+
		"\u00c6\3\2\2\2\u00bd\u00be\7\26\2\2\u00be\u00bf\5\20\t\b\u00bf\u00c0\b"+
		"\t\1\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2\7\27\2\2\u00c2\u00c3\5\20\t\7\u00c3"+
		"\u00c4\b\t\1\2\u00c4\u00c6\3\2\2\2\u00c5\u009c\3\2\2\2\u00c5\u009f\3\2"+
		"\2\2\u00c5\u00a1\3\2\2\2\u00c5\u00a3\3\2\2\2\u00c5\u00a5\3\2\2\2\u00c5"+
		"\u00b7\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\u00e8\3\2"+
		"\2\2\u00c7\u00c8\f\n\2\2\u00c8\u00c9\7\25\2\2\u00c9\u00ca\5\20\t\13\u00ca"+
		"\u00cb\b\t\1\2\u00cb\u00e7\3\2\2\2\u00cc\u00cd\f\6\2\2\u00cd\u00ce\t\3"+
		"\2\2\u00ce\u00cf\5\20\t\7\u00cf\u00d0\b\t\1\2\u00d0\u00e7\3\2\2\2\u00d1"+
		"\u00d2\f\5\2\2\u00d2\u00d3\t\4\2\2\u00d3\u00d4\5\20\t\6\u00d4\u00d5\b"+
		"\t\1\2\u00d5\u00e7\3\2\2\2\u00d6\u00d7\f\4\2\2\u00d7\u00d8\t\5\2\2\u00d8"+
		"\u00d9\5\20\t\5\u00d9\u00da\b\t\1\2\u00da\u00e7\3\2\2\2\u00db\u00dc\f"+
		"\3\2\2\u00dc\u00dd\t\6\2\2\u00dd\u00de\5\20\t\4\u00de\u00df\b\t\1\2\u00df"+
		"\u00e7\3\2\2\2\u00e0\u00e1\f\13\2\2\u00e1\u00e2\7\23\2\2\u00e2\u00e3\5"+
		"\20\t\2\u00e3\u00e4\7\24\2\2\u00e4\u00e5\b\t\1\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00c7\3\2\2\2\u00e6\u00cc\3\2\2\2\u00e6\u00d1\3\2\2\2\u00e6\u00d6\3\2"+
		"\2\2\u00e6\u00db\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\21\3\2\2\2\u00ea\u00e8\3\2\2"+
		"\2\u00eb\u00ec\5\24\13\2\u00ec\u00ed\b\n\1\2\u00ed\u0101\3\2\2\2\u00ee"+
		"\u00ef\7\23\2\2\u00ef\u00f0\7+\2\2\u00f0\u00f1\7\24\2\2\u00f1\u00f2\5"+
		"\22\n\2\u00f2\u00f3\b\n\1\2\u00f3\u0101\3\2\2\2\u00f4\u00f5\7$\2\2\u00f5"+
		"\u00f9\7\b\2\2\u00f6\u00f7\5\f\7\2\u00f7\u00f8\b\n\1\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00f6\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\t\2\2\u00fe\u00ff\b\n"+
		"\1\2\u00ff\u0101\3\2\2\2\u0100\u00eb\3\2\2\2\u0100\u00ee\3\2\2\2\u0100"+
		"\u00f4\3\2\2\2\u0101\23\3\2\2\2\u0102\u0103\7%\2\2\u0103\u0109\b\13\1"+
		"\2\u0104\u0105\7&\2\2\u0105\u0109\b\13\1\2\u0106\u0107\7\'\2\2\u0107\u0109"+
		"\b\13\1\2\u0108\u0102\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0106\3\2\2\2"+
		"\u0109\25\3\2\2\2\31!$)/\65CITdvy}\u0083\u0088\u0095\u00b0\u00b3\u00c5"+
		"\u00e6\u00e8\u00fb\u0100\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
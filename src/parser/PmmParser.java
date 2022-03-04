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
		public StatementContext statement;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(20);
					((ProgramContext)_localctx).expression = expression(0);
					((ProgramContext)_localctx).ast =  ((ProgramContext)_localctx).expression.ast;
					}
					break;
				case 2:
					{
					setState(23);
					((ProgramContext)_localctx).statement = statement();
					((ProgramContext)_localctx).ast =  ((ProgramContext)_localctx).statement.ast;
					}
					break;
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
			setState(31);
			match(T__0);
			setState(32);
			match(ID);
			setState(33);
			match(T__1);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(34);
				variable();
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(35);
					match(T__2);
					setState(36);
					variable();
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(44);
			match(T__3);
			setState(45);
			match(T__4);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) {
				{
				setState(46);
				builtInType();
				}
			}

			setState(49);
			match(T__5);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					variableDefinition();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(56);
				statement();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
			setState(64);
			match(T__0);
			setState(65);
			match(T__7);
			setState(66);
			match(T__1);
			setState(67);
			match(T__3);
			setState(68);
			match(T__4);
			setState(69);
			match(T__5);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					variableDefinition();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
		public Statement ast;
		public Token p;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token ifTxt;
		public StmBodyContext s1;
		public StmBodyContext s2;
		public Token w;
		public Token r;
		public Token i1;
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((StatementContext)_localctx).p = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
					((StatementContext)_localctx).p = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(85);
				expression(0);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(86);
					match(T__2);
					setState(87);
					expression(0);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				((StatementContext)_localctx).e1 = expression(0);
				setState(96);
				match(T__11);
				setState(97);
				((StatementContext)_localctx).e2 = expression(0);
				setState(98);
				match(T__10);
				((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(),
				                                                           ((StatementContext)_localctx).e1.ast.getColumn(),
				                                                           ((StatementContext)_localctx).e1.ast,
				                                                           ((StatementContext)_localctx).e2.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				((StatementContext)_localctx).ifTxt = match(T__12);
				setState(102);
				((StatementContext)_localctx).e1 = expression(0);
				setState(103);
				match(T__4);
				setState(104);
				((StatementContext)_localctx).s1 = stmBody();
				If ifStatement = new If(((StatementContext)_localctx).ifTxt.getLine(),
				                                                    ((StatementContext)_localctx).ifTxt.getCharPositionInLine(),
				                                                    ((StatementContext)_localctx).e1.ast);

				                                      ifStatement.addAllStatementsTrue(((StatementContext)_localctx).s1.ast);

				                                      
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(106);
					match(T__13);
					setState(107);
					((StatementContext)_localctx).s2 = stmBody();
					ifStatement.addAllStatementsFalse(((StatementContext)_localctx).s2.ast);
					}
					break;
				}
				((StatementContext)_localctx).ast =  ifStatement;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				((StatementContext)_localctx).w = match(T__14);
				setState(115);
				((StatementContext)_localctx).e1 = expression(0);
				setState(116);
				match(T__4);
				setState(117);
				((StatementContext)_localctx).s1 = stmBody();
				((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).w.getLine(),
				                                                        ((StatementContext)_localctx).w.getCharPositionInLine(),
				                                                        ((StatementContext)_localctx).e1.ast,((StatementContext)_localctx).s1.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				((StatementContext)_localctx).r = match(T__15);
				setState(121);
				((StatementContext)_localctx).e1 = expression(0);
				setState(122);
				match(T__10);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).r.getLine(),
				                                               ((StatementContext)_localctx).r.getCharPositionInLine(),
				                                               ((StatementContext)_localctx).e1.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				((StatementContext)_localctx).i1 = match(ID);
				setState(126);
				match(T__1);
				ProcedureInvocation pi = new ProcedureInvocation(((StatementContext)_localctx).i1.getLine(),
				                                                              ((StatementContext)_localctx).i1.getCharPositionInLine(),
				                                                              new Variable(((StatementContext)_localctx).i1.getLine(),
				                                                                           ((StatementContext)_localctx).i1.getCharPositionInLine(),
				                                                                           (((StatementContext)_localctx).i1!=null?((StatementContext)_localctx).i1.getText():null)));
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(128);
					((StatementContext)_localctx).e1 = expression(0);
					pi.addExpression(((StatementContext)_localctx).e1.ast);
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(130);
						match(T__2);
						setState(131);
						((StatementContext)_localctx).e2 = expression(0);
						pi.addExpression(((StatementContext)_localctx).e2.ast);
						}
						}
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(141);
				match(T__3);
				setState(142);
				match(T__10);
				((StatementContext)_localctx).ast =  pi;
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
		public List<Statement> ast;
		public List<Statement> stms = new ArrayList<>();
		public StatementContext s1;
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__5);
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					((StmBodyContext)_localctx).s1 = statement();
					_localctx.stms.add(((StmBodyContext)_localctx).s1.ast);
					}
					}
					setState(152); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(154);
				match(T__6);
				((StmBodyContext)_localctx).ast =  _localctx.stms;
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
				setState(157);
				((StmBodyContext)_localctx).s1 = statement();
				_localctx.stms.add(((StmBodyContext)_localctx).s1.ast); ((StmBodyContext)_localctx).ast =  _localctx.stms;
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
			setState(162);
			((VariableDefinitionContext)_localctx).v1 = variable();
			((VariableDefinitionContext)_localctx).ast =  ((VariableDefinitionContext)_localctx).v1.ast;
			setState(164);
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
			setState(166);
			((VariableContext)_localctx).i1 = match(ID);

			                                                      List<VariableDefinition> list = new ArrayList<>();
			                                                      list.add(new VariableDefinition(((VariableContext)_localctx).i1.getLine(),
			                                                                                      ((VariableContext)_localctx).i1.getCharPositionInLine(),
			                                                                                      (((VariableContext)_localctx).i1!=null?((VariableContext)_localctx).i1.getText():null),
			                                                                                      null));
			                                                    
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(168);
				match(T__2);
				setState(169);
				((VariableContext)_localctx).id2 = match(ID);

				                                                                     list.add(new VariableDefinition(((VariableContext)_localctx).id2.getLine(),
				                                                                                                     ((VariableContext)_localctx).id2.getCharPositionInLine(),
				                                                                                                     (((VariableContext)_localctx).id2!=null?((VariableContext)_localctx).id2.getText():null),
				                                                                                                     null));
				                                                                    
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(T__4);
			setState(177);
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
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(181);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(),
				                    ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				{
				setState(183);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				                                       ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,
				                                       LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 3:
				{
				setState(185);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				                                                           ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,
				                                                           LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(187);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				                                            ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,
				                                            LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 5:
				{
				setState(189);
				((ExpressionContext)_localctx).ID = match(ID);

				                     FunctionInvocation fi = new FunctionInvocation(((ExpressionContext)_localctx).ID.getLine(),
				                                                   ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,
				                                                   new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)));
				           
				setState(191);
				match(T__1);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(192);
					((ExpressionContext)_localctx).ep1 = expression(0);
					fi.addExpression(((ExpressionContext)_localctx).ep1.ast);
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(194);
						match(T__2);
						setState(195);
						((ExpressionContext)_localctx).ep2 = expression(0);
						fi.addExpression(((ExpressionContext)_localctx).ep2.ast);
						}
						}
						setState(202);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(205);
				match(T__3);
				((ExpressionContext)_localctx).ast = fi;
				}
				break;
			case 6:
				{
				setState(207);
				match(T__1);
				setState(208);
				((ExpressionContext)_localctx).t1 = type();
				setState(209);
				match(T__3);
				setState(210);
				((ExpressionContext)_localctx).ep1 = expression(7);

				                ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).t1.ast.getLine(), ((ExpressionContext)_localctx).t1.ast.getColumn(),((ExpressionContext)_localctx).t1.ast,((ExpressionContext)_localctx).ep1.ast);
				        
				}
				break;
			case 7:
				{
				setState(213);
				match(T__19);
				setState(214);
				((ExpressionContext)_localctx).e = expression(6);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e.ast.getLine(),((ExpressionContext)_localctx).e.ast.getColumn(),((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 8:
				{
				setState(217);
				match(T__20);
				setState(218);
				((ExpressionContext)_localctx).e = expression(5);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).e.ast.getLine(),((ExpressionContext)_localctx).e.ast.getColumn(),((ExpressionContext)_localctx).e.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ep1 = _prevctx;
						_localctx.ep1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(224);
						match(T__18);
						setState(225);
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
						setState(228);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(229);
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
						setState(230);
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
						setState(233);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(234);
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
						setState(235);
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
						setState(238);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(239);
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
						setState(240);
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
						setState(243);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(244);
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
						setState(245);
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
						setState(248);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(249);
						match(T__16);
						setState(250);
						((ExpressionContext)_localctx).ep2 = expression(0);
						setState(251);
						match(T__17);

						                      ((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).ep1.ast.getLine(), ((ExpressionContext)_localctx).ep1.ast.getColumn(), ((ExpressionContext)_localctx).ep1.ast, ((ExpressionContext)_localctx).ep2.ast);
						                  
						}
						break;
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				((TypeContext)_localctx).b1 = builtInType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).b1.ast;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T__16);
				setState(263);
				((TypeContext)_localctx).I1 = match(INT_CONSTANT);
				setState(264);
				match(T__17);
				setState(265);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).ast =  new Array(((TypeContext)_localctx).I1.getLine(),((TypeContext)_localctx).I1.getCharPositionInLine(),
				                                        LexerHelper.lexemeToInt((((TypeContext)_localctx).I1!=null?((TypeContext)_localctx).I1.getText():null)),
				                                        ((TypeContext)_localctx).t.ast);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(T__33);
				setState(269);
				match(T__5);
				{
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(270);
					((TypeContext)_localctx).v = variableDefinition();


					                                        for(VariableDefinition df : ((TypeContext)_localctx).v.ast){
					                                               _localctx.fields.add( new RecordField(df.getName(),
					                                                                           df.getType()
					                                                                           )
					                                                          );
					                                         }


					                                      
					}
					}
					setState(275); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				setState(277);
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
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(T__34);
				((BuiltInTypeContext)_localctx).ast =  Char.getInstance();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__35);
				((BuiltInTypeContext)_localctx).ast =  Integer.getInstance();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\5\3-\n\3\3\3\3\3\3\3\5\3\62\n\3\3\3\3"+
		"\3\7\3\66\n\3\f\3\16\39\13\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\7\4P\n\4\f\4\16\4S"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5q\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5\u0089\n\5\f\5\16\5\u008c\13\5\5\5\u008e\n\5\3\5\3\5\3\5"+
		"\5\5\u0093\n\5\3\6\3\6\3\6\3\6\6\6\u0099\n\6\r\6\16\6\u009a\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u00a3\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u00ae"+
		"\n\b\f\b\16\b\u00b1\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c9\n\t\f\t\16\t\u00cc"+
		"\13\t\5\t\u00ce\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00e0\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u0101\n\t\f\t\16\t\u0104\13\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u0114\n\n\r\n\16\n\u0115\3\n\3\n"+
		"\3\n\5\n\u011b\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0123\n\13\3\13"+
		"\2\3\20\f\2\4\6\b\n\f\16\20\22\24\2\7\3\2\13\f\3\2\30\32\4\2\26\26\33"+
		"\33\3\2\34!\3\2\"#\2\u0143\2\36\3\2\2\2\4!\3\2\2\2\6B\3\2\2\2\b\u0092"+
		"\3\2\2\2\n\u00a2\3\2\2\2\f\u00a4\3\2\2\2\16\u00a8\3\2\2\2\20\u00df\3\2"+
		"\2\2\22\u011a\3\2\2\2\24\u0122\3\2\2\2\26\27\5\20\t\2\27\30\b\2\1\2\30"+
		"\35\3\2\2\2\31\32\5\b\5\2\32\33\b\2\1\2\33\35\3\2\2\2\34\26\3\2\2\2\34"+
		"\31\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\3\3\2\2\2 \36\3"+
		"\2\2\2!\"\7\3\2\2\"#\7,\2\2#,\7\4\2\2$)\5\16\b\2%&\7\5\2\2&(\5\16\b\2"+
		"\'%\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*-\3\2\2\2+)\3\2\2\2,$\3\2\2"+
		"\2,-\3\2\2\2-.\3\2\2\2./\7\6\2\2/\61\7\7\2\2\60\62\5\24\13\2\61\60\3\2"+
		"\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\67\7\b\2\2\64\66\5\f\7\2\65\64\3\2"+
		"\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28=\3\2\2\29\67\3\2\2\2:<\5\b"+
		"\5\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\t"+
		"\2\2A\5\3\2\2\2BC\7\3\2\2CD\7\n\2\2DE\7\4\2\2EF\7\6\2\2FG\7\7\2\2GK\7"+
		"\b\2\2HJ\5\f\7\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LQ\3\2\2\2MK\3"+
		"\2\2\2NP\5\b\5\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3"+
		"\2\2\2TU\7\t\2\2U\7\3\2\2\2VW\t\2\2\2W\\\5\20\t\2XY\7\5\2\2Y[\5\20\t\2"+
		"ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\r"+
		"\2\2`\u0093\3\2\2\2ab\5\20\t\2bc\7\16\2\2cd\5\20\t\2de\7\r\2\2ef\b\5\1"+
		"\2f\u0093\3\2\2\2gh\7\17\2\2hi\5\20\t\2ij\7\7\2\2jk\5\n\6\2kp\b\5\1\2"+
		"lm\7\20\2\2mn\5\n\6\2no\b\5\1\2oq\3\2\2\2pl\3\2\2\2pq\3\2\2\2qr\3\2\2"+
		"\2rs\b\5\1\2s\u0093\3\2\2\2tu\7\21\2\2uv\5\20\t\2vw\7\7\2\2wx\5\n\6\2"+
		"xy\b\5\1\2y\u0093\3\2\2\2z{\7\22\2\2{|\5\20\t\2|}\7\r\2\2}~\b\5\1\2~\u0093"+
		"\3\2\2\2\177\u0080\7,\2\2\u0080\u0081\7\4\2\2\u0081\u008d\b\5\1\2\u0082"+
		"\u0083\5\20\t\2\u0083\u008a\b\5\1\2\u0084\u0085\7\5\2\2\u0085\u0086\5"+
		"\20\t\2\u0086\u0087\b\5\1\2\u0087\u0089\3\2\2\2\u0088\u0084\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u0082\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\7\6\2\2\u0090\u0091\7\r\2\2\u0091\u0093\b\5"+
		"\1\2\u0092V\3\2\2\2\u0092a\3\2\2\2\u0092g\3\2\2\2\u0092t\3\2\2\2\u0092"+
		"z\3\2\2\2\u0092\177\3\2\2\2\u0093\t\3\2\2\2\u0094\u0098\7\b\2\2\u0095"+
		"\u0096\5\b\5\2\u0096\u0097\b\6\1\2\u0097\u0099\3\2\2\2\u0098\u0095\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\7\t\2\2\u009d\u009e\b\6\1\2\u009e\u00a3\3\2"+
		"\2\2\u009f\u00a0\5\b\5\2\u00a0\u00a1\b\6\1\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u0094\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3\13\3\2\2\2\u00a4\u00a5\5\16\b"+
		"\2\u00a5\u00a6\b\7\1\2\u00a6\u00a7\7\r\2\2\u00a7\r\3\2\2\2\u00a8\u00a9"+
		"\7,\2\2\u00a9\u00af\b\b\1\2\u00aa\u00ab\7\5\2\2\u00ab\u00ac\7,\2\2\u00ac"+
		"\u00ae\b\b\1\2\u00ad\u00aa\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b3\7\7\2\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5\b\b\1\2\u00b5\17\3\2\2"+
		"\2\u00b6\u00b7\b\t\1\2\u00b7\u00b8\7,\2\2\u00b8\u00e0\b\t\1\2\u00b9\u00ba"+
		"\7+\2\2\u00ba\u00e0\b\t\1\2\u00bb\u00bc\7.\2\2\u00bc\u00e0\b\t\1\2\u00bd"+
		"\u00be\7-\2\2\u00be\u00e0\b\t\1\2\u00bf\u00c0\7,\2\2\u00c0\u00c1\b\t\1"+
		"\2\u00c1\u00cd\7\4\2\2\u00c2\u00c3\5\20\t\2\u00c3\u00ca\b\t\1\2\u00c4"+
		"\u00c5\7\5\2\2\u00c5\u00c6\5\20\t\2\u00c6\u00c7\b\t\1\2\u00c7\u00c9\3"+
		"\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00c2\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\6\2\2\u00d0"+
		"\u00e0\b\t\1\2\u00d1\u00d2\7\4\2\2\u00d2\u00d3\5\22\n\2\u00d3\u00d4\7"+
		"\6\2\2\u00d4\u00d5\5\20\t\t\u00d5\u00d6\b\t\1\2\u00d6\u00e0\3\2\2\2\u00d7"+
		"\u00d8\7\26\2\2\u00d8\u00d9\5\20\t\b\u00d9\u00da\b\t\1\2\u00da\u00e0\3"+
		"\2\2\2\u00db\u00dc\7\27\2\2\u00dc\u00dd\5\20\t\7\u00dd\u00de\b\t\1\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00b6\3\2\2\2\u00df\u00b9\3\2\2\2\u00df\u00bb\3\2"+
		"\2\2\u00df\u00bd\3\2\2\2\u00df\u00bf\3\2\2\2\u00df\u00d1\3\2\2\2\u00df"+
		"\u00d7\3\2\2\2\u00df\u00db\3\2\2\2\u00e0\u0102\3\2\2\2\u00e1\u00e2\f\n"+
		"\2\2\u00e2\u00e3\7\25\2\2\u00e3\u00e4\5\20\t\13\u00e4\u00e5\b\t\1\2\u00e5"+
		"\u0101\3\2\2\2\u00e6\u00e7\f\6\2\2\u00e7\u00e8\t\3\2\2\u00e8\u00e9\5\20"+
		"\t\7\u00e9\u00ea\b\t\1\2\u00ea\u0101\3\2\2\2\u00eb\u00ec\f\5\2\2\u00ec"+
		"\u00ed\t\4\2\2\u00ed\u00ee\5\20\t\6\u00ee\u00ef\b\t\1\2\u00ef\u0101\3"+
		"\2\2\2\u00f0\u00f1\f\4\2\2\u00f1\u00f2\t\5\2\2\u00f2\u00f3\5\20\t\5\u00f3"+
		"\u00f4\b\t\1\2\u00f4\u0101\3\2\2\2\u00f5\u00f6\f\3\2\2\u00f6\u00f7\t\6"+
		"\2\2\u00f7\u00f8\5\20\t\4\u00f8\u00f9\b\t\1\2\u00f9\u0101\3\2\2\2\u00fa"+
		"\u00fb\f\13\2\2\u00fb\u00fc\7\23\2\2\u00fc\u00fd\5\20\t\2\u00fd\u00fe"+
		"\7\24\2\2\u00fe\u00ff\b\t\1\2\u00ff\u0101\3\2\2\2\u0100\u00e1\3\2\2\2"+
		"\u0100\u00e6\3\2\2\2\u0100\u00eb\3\2\2\2\u0100\u00f0\3\2\2\2\u0100\u00f5"+
		"\3\2\2\2\u0100\u00fa\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\21\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\5\24\13"+
		"\2\u0106\u0107\b\n\1\2\u0107\u011b\3\2\2\2\u0108\u0109\7\23\2\2\u0109"+
		"\u010a\7+\2\2\u010a\u010b\7\24\2\2\u010b\u010c\5\22\n\2\u010c\u010d\b"+
		"\n\1\2\u010d\u011b\3\2\2\2\u010e\u010f\7$\2\2\u010f\u0113\7\b\2\2\u0110"+
		"\u0111\5\f\7\2\u0111\u0112\b\n\1\2\u0112\u0114\3\2\2\2\u0113\u0110\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\7\t\2\2\u0118\u0119\b\n\1\2\u0119\u011b\3\2"+
		"\2\2\u011a\u0105\3\2\2\2\u011a\u0108\3\2\2\2\u011a\u010e\3\2\2\2\u011b"+
		"\23\3\2\2\2\u011c\u011d\7%\2\2\u011d\u0123\b\13\1\2\u011e\u011f\7&\2\2"+
		"\u011f\u0123\b\13\1\2\u0120\u0121\7\'\2\2\u0121\u0123\b\13\1\2\u0122\u011c"+
		"\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0120\3\2\2\2\u0123\25\3\2\2\2\33\34"+
		"\36),\61\67=KQ\\p\u008a\u008d\u0092\u009a\u00a2\u00af\u00ca\u00cd\u00df"+
		"\u0100\u0102\u0115\u011a\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
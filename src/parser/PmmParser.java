// Generated from C:/Users/usuario/Desktop/Eii/AÑO 3 GRADO INGENIERIA INFORMATICA/Diseño de Lenguaje de Programacion/DLP_Repo_Project/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import ast.definition.*;
import ast.expression.*;
import ast.node.*;
import ast.statement.*;
import ast.type.*;
import ast.type.Integer;
import ast.type.Double;
import ast.type.Void;
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
		RULE_stmBody = 4, RULE_variableDefinition = 5, RULE_builtInVariablesWithAssignment = 6, 
		RULE_builtInVariable = 7, RULE_variable = 8, RULE_expression = 9, RULE_type = 10, 
		RULE_builtInType = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "funcDefinition", "mainProgram", "statement", "stmBody", "variableDefinition", 
			"builtInVariablesWithAssignment", "builtInVariable", "variable", "expression", 
			"type", "builtInType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "','", "')'", "':'", "'{'", "'}'", "'main'", "'print'", 
			"';'", "'input'", "'='", "'if'", "'else'", "'while'", "'return'", "'['", 
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
		public VariableDefinitionContext variableDefinition;
		public FuncDefinitionContext funcDefinition;
		public MainProgramContext mainProgram;
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
			Program program = new Program(0,0);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(31);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(25);
						((ProgramContext)_localctx).variableDefinition = variableDefinition();
						program.addAllVariableDefinitions(((ProgramContext)_localctx).variableDefinition.ast);
						}
						break;
					case T__0:
						{
						setState(28);
						((ProgramContext)_localctx).funcDefinition = funcDefinition();
						program.addDefinition(((ProgramContext)_localctx).funcDefinition.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(36);
			((ProgramContext)_localctx).mainProgram = mainProgram();
			program.addDefinition(((ProgramContext)_localctx).mainProgram.ast);
			setState(38);
			match(EOF);
			((ProgramContext)_localctx).ast =  program;
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
		public FunctionDefinition ast;
		public List<VariableDefinition> params = new ArrayList<>();
		public Token d;
		public Token i1;
		public BuiltInVariableContext v1;
		public BuiltInVariableContext v2;
		public Token col;
		public BuiltInTypeContext b;
		public VariableDefinitionContext var1;
		public StatementContext stm1;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<BuiltInVariableContext> builtInVariable() {
			return getRuleContexts(BuiltInVariableContext.class);
		}
		public BuiltInVariableContext builtInVariable(int i) {
			return getRuleContext(BuiltInVariableContext.class,i);
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
			setState(41);
			((FuncDefinitionContext)_localctx).d = match(T__0);
			setState(42);
			((FuncDefinitionContext)_localctx).i1 = match(ID);
			setState(43);
			match(T__1);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(44);
				((FuncDefinitionContext)_localctx).v1 = builtInVariable();
				_localctx.params.addAll(((FuncDefinitionContext)_localctx).v1.ast);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(46);
					match(T__2);
					setState(47);
					((FuncDefinitionContext)_localctx).v2 = builtInVariable();
					_localctx.params.addAll(((FuncDefinitionContext)_localctx).v2.ast);
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(57);
			match(T__3);
			setState(58);
			((FuncDefinitionContext)_localctx).col = match(T__4);
			Type builtIn = Void.getInstance();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) {
				{
				setState(60);
				((FuncDefinitionContext)_localctx).b = builtInType();
				builtIn=((FuncDefinitionContext)_localctx).b.ast;
				}
			}

			((FuncDefinitionContext)_localctx).ast =  new FunctionDefinition(((FuncDefinitionContext)_localctx).d.getLine(),
			                                              ((FuncDefinitionContext)_localctx).d.getCharPositionInLine()+1,
			                                              (((FuncDefinitionContext)_localctx).i1!=null?((FuncDefinitionContext)_localctx).i1.getText():null),
			                                              new FunctionType(builtIn.getLine(),
			                                                               builtIn.getColumn(),
			                                                               builtIn,
			                                                               _localctx.params)
			                                              );
			               
			setState(66);
			match(T__5);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					((FuncDefinitionContext)_localctx).var1 = variableDefinition();
					_localctx.ast.addAllVariableDefinitions(((FuncDefinitionContext)_localctx).var1.ast);
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(75);
				((FuncDefinitionContext)_localctx).stm1 = statement();
				_localctx.ast.addStatement(((FuncDefinitionContext)_localctx).stm1.ast);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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
		public FunctionDefinition ast;
		public Token d;
		public Token col;
		public VariableDefinitionContext var1;
		public StatementContext stm1;
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
			setState(85);
			((MainProgramContext)_localctx).d = match(T__0);
			setState(86);
			match(T__7);
			setState(87);
			match(T__1);
			setState(88);
			match(T__3);
			setState(89);
			((MainProgramContext)_localctx).col = match(T__4);
			((MainProgramContext)_localctx).ast =  new FunctionDefinition(((MainProgramContext)_localctx).d.getLine(),
			                                             ((MainProgramContext)_localctx).d.getCharPositionInLine()+1,
			                                             "main",
			                                             new FunctionType(((MainProgramContext)_localctx).col.getLine(),
			                                                              ((MainProgramContext)_localctx).col.getCharPositionInLine()+1,
			                                                              Void.getInstance(),
			                                                              new ArrayList<>()
			                                                              )
			                                             );
			               
			setState(91);
			match(T__5);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					((MainProgramContext)_localctx).var1 = variableDefinition();
					_localctx.ast.addAllVariableDefinitions(((MainProgramContext)_localctx).var1.ast);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(100);
				((MainProgramContext)_localctx).stm1 = statement();
				_localctx.ast.addStatement(((MainProgramContext)_localctx).stm1.ast);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
		public Token i;
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
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((StatementContext)_localctx).p = match(T__8);
				Print stm = new Print(((StatementContext)_localctx).p.getLine(),((StatementContext)_localctx).p.getCharPositionInLine()+1);
				setState(112);
				((StatementContext)_localctx).e1 = expression(0);
				stm.addExpression(((StatementContext)_localctx).e1.ast);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(114);
					match(T__2);
					setState(115);
					((StatementContext)_localctx).e2 = expression(0);
					stm.addExpression(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(T__9);
				((StatementContext)_localctx).ast =  stm;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				((StatementContext)_localctx).i = match(T__10);
				Input stm = new Input(((StatementContext)_localctx).i.getLine(),((StatementContext)_localctx).i.getCharPositionInLine()+1);
				setState(128);
				((StatementContext)_localctx).e1 = expression(0);
				stm.addExpression(((StatementContext)_localctx).e1.ast);
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
					stm.addExpression(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(T__9);
				((StatementContext)_localctx).ast =  stm;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				((StatementContext)_localctx).e1 = expression(0);
				setState(143);
				match(T__11);
				setState(144);
				((StatementContext)_localctx).e2 = expression(0);
				setState(145);
				match(T__9);
				((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(),
				                                                           ((StatementContext)_localctx).e1.ast.getColumn(),
				                                                           ((StatementContext)_localctx).e1.ast,
				                                                           ((StatementContext)_localctx).e2.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				((StatementContext)_localctx).ifTxt = match(T__12);
				setState(149);
				((StatementContext)_localctx).e1 = expression(0);
				setState(150);
				match(T__4);
				setState(151);
				((StatementContext)_localctx).s1 = stmBody();
				If ifStatement = new If(((StatementContext)_localctx).ifTxt.getLine(),
				                                                    ((StatementContext)_localctx).ifTxt.getCharPositionInLine()+1,
				                                                    ((StatementContext)_localctx).e1.ast);

				                                      ifStatement.addAllStatementsTrue(((StatementContext)_localctx).s1.ast);

				                                      
				setState(157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(153);
					match(T__13);
					setState(154);
					((StatementContext)_localctx).s2 = stmBody();
					ifStatement.addAllStatementsFalse(((StatementContext)_localctx).s2.ast);
					}
					break;
				}
				((StatementContext)_localctx).ast =  ifStatement;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				((StatementContext)_localctx).w = match(T__14);
				setState(162);
				((StatementContext)_localctx).e1 = expression(0);
				setState(163);
				match(T__4);
				setState(164);
				((StatementContext)_localctx).s1 = stmBody();
				((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).w.getLine(),
				                                                        ((StatementContext)_localctx).w.getCharPositionInLine()+1,
				                                                        ((StatementContext)_localctx).e1.ast,((StatementContext)_localctx).s1.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				((StatementContext)_localctx).r = match(T__15);
				setState(168);
				((StatementContext)_localctx).e1 = expression(0);
				setState(169);
				match(T__9);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).r.getLine(),
				                                               ((StatementContext)_localctx).r.getCharPositionInLine()+1,
				                                               ((StatementContext)_localctx).e1.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				((StatementContext)_localctx).i1 = match(ID);
				setState(173);
				match(T__1);
				FunctionInvocation pi = new FunctionInvocation(((StatementContext)_localctx).i1.getLine(),
				                                                              ((StatementContext)_localctx).i1.getCharPositionInLine()+1,
				                                                              new Variable(((StatementContext)_localctx).i1.getLine(),
				                                                                           ((StatementContext)_localctx).i1.getCharPositionInLine()+1,
				                                                                           (((StatementContext)_localctx).i1!=null?((StatementContext)_localctx).i1.getText():null)));
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(175);
					((StatementContext)_localctx).e1 = expression(0);
					pi.addExpression(((StatementContext)_localctx).e1.ast);
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(177);
						match(T__2);
						setState(178);
						((StatementContext)_localctx).e2 = expression(0);
						pi.addExpression(((StatementContext)_localctx).e2.ast);
						}
						}
						setState(185);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(188);
				match(T__3);
				setState(189);
				match(T__9);
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
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(T__5);
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(194);
					((StmBodyContext)_localctx).s1 = statement();
					_localctx.stms.add(((StmBodyContext)_localctx).s1.ast);
					}
					}
					setState(199); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(201);
				match(T__6);
				((StmBodyContext)_localctx).ast =  _localctx.stms;
				}
				break;
			case T__1:
			case T__8:
			case T__10:
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
				setState(204);
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
		public BuiltInVariablesWithAssignmentContext v2;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public BuiltInVariablesWithAssignmentContext builtInVariablesWithAssignment() {
			return getRuleContext(BuiltInVariablesWithAssignmentContext.class,0);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(209);
				((VariableDefinitionContext)_localctx).v1 = variable();
				((VariableDefinitionContext)_localctx).ast =  ((VariableDefinitionContext)_localctx).v1.ast;
				}
				break;
			case 2:
				{
				setState(212);
				((VariableDefinitionContext)_localctx).v2 = builtInVariablesWithAssignment();

				                                                                ((VariableDefinitionContext)_localctx).ast =  new ArrayList<VariableDefinition>();
				                                                                for(VariableDefinitionAssignment vd : ((VariableDefinitionContext)_localctx).v2.ast)
				                                                                            {
				                                                                             _localctx.ast.add(vd);
				                                                                            }
				                                                                          
				}
				break;
			}
			setState(217);
			match(T__9);
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

	public static class BuiltInVariablesWithAssignmentContext extends ParserRuleContext {
		public List<VariableDefinitionAssignment> ast;
		public Token i1;
		public Token id2;
		public BuiltInTypeContext t1;
		public ExpressionContext e1;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltInVariablesWithAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInVariablesWithAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterBuiltInVariablesWithAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitBuiltInVariablesWithAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBuiltInVariablesWithAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInVariablesWithAssignmentContext builtInVariablesWithAssignment() throws RecognitionException {
		BuiltInVariablesWithAssignmentContext _localctx = new BuiltInVariablesWithAssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_builtInVariablesWithAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			((BuiltInVariablesWithAssignmentContext)_localctx).i1 = match(ID);

			                                                      List<VariableDefinitionAssignment> list = new ArrayList<>();

			                                                       list.add(new VariableDefinitionAssignment(((BuiltInVariablesWithAssignmentContext)_localctx).i1.getLine(),
			                                                                                       ((BuiltInVariablesWithAssignmentContext)_localctx).i1.getCharPositionInLine()+1,
			                                                                                       (((BuiltInVariablesWithAssignmentContext)_localctx).i1!=null?((BuiltInVariablesWithAssignmentContext)_localctx).i1.getText():null),
			                                                                                       null,
			                                                                                       null));

			                                                    
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(221);
				match(T__2);
				setState(222);
				((BuiltInVariablesWithAssignmentContext)_localctx).id2 = match(ID);


				                                                               VariableDefinitionAssignment df = new VariableDefinitionAssignment(
				                                                                                     ((BuiltInVariablesWithAssignmentContext)_localctx).id2.getLine(),
				                                                                                     ((BuiltInVariablesWithAssignmentContext)_localctx).id2.getCharPositionInLine()+1,
				                                                                                     (((BuiltInVariablesWithAssignmentContext)_localctx).id2!=null?((BuiltInVariablesWithAssignmentContext)_localctx).id2.getText():null),
				                                                                                     null,
				                                                                                     null);

				                                                             if(!list.stream().map(i -> i.getName()).toList().contains((((BuiltInVariablesWithAssignmentContext)_localctx).id2!=null?((BuiltInVariablesWithAssignmentContext)_localctx).id2.getText():null))){

				                                                                list.add(df);

				                                                             }else{
				                                                                ErrorType et = new ErrorType(
				                                                                                ((BuiltInVariablesWithAssignmentContext)_localctx).id2.getLine(),
				                                                                                ((BuiltInVariablesWithAssignmentContext)_localctx).id2.getCharPositionInLine()+1,
				                                                                                "Already defined variable with name: " + (((BuiltInVariablesWithAssignmentContext)_localctx).id2!=null?((BuiltInVariablesWithAssignmentContext)_localctx).id2.getText():null));
				                                                                    }
				                                                          
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(T__4);
			setState(230);
			((BuiltInVariablesWithAssignmentContext)_localctx).t1 = builtInType();
			setState(231);
			match(T__11);
			setState(232);
			((BuiltInVariablesWithAssignmentContext)_localctx).e1 = expression(0);

			                                                      for(VariableDefinitionAssignment vd : list)
			                                                      {
			                                                        vd.setType(((BuiltInVariablesWithAssignmentContext)_localctx).t1.ast);
			                                                        vd.setValueAssigned(((BuiltInVariablesWithAssignmentContext)_localctx).e1.ast);
			                                                        }

			                                                     
			((BuiltInVariablesWithAssignmentContext)_localctx).ast =  list;
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

	public static class BuiltInVariableContext extends ParserRuleContext {
		public List<VariableDefinition> ast;
		public Token i1;
		public Token id2;
		public BuiltInTypeContext t1;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public BuiltInVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterBuiltInVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitBuiltInVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBuiltInVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInVariableContext builtInVariable() throws RecognitionException {
		BuiltInVariableContext _localctx = new BuiltInVariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_builtInVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			((BuiltInVariableContext)_localctx).i1 = match(ID);

			                                                      List<VariableDefinition> list = new ArrayList<>();

			                                                       list.add(new VariableDefinition(((BuiltInVariableContext)_localctx).i1.getLine(),
			                                                                                       ((BuiltInVariableContext)_localctx).i1.getCharPositionInLine()+1,
			                                                                                       (((BuiltInVariableContext)_localctx).i1!=null?((BuiltInVariableContext)_localctx).i1.getText():null),
			                                                                                       null));

			                                                    
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(238);
				match(T__2);
				setState(239);
				((BuiltInVariableContext)_localctx).id2 = match(ID);


				                                                               VariableDefinition df = new VariableDefinition(
				                                                                                     ((BuiltInVariableContext)_localctx).id2.getLine(),
				                                                                                     ((BuiltInVariableContext)_localctx).id2.getCharPositionInLine()+1,
				                                                                                     (((BuiltInVariableContext)_localctx).id2!=null?((BuiltInVariableContext)_localctx).id2.getText():null),
				                                                                                     null);

				                                                             if(!list.stream().map(i -> i.getName()).toList().contains((((BuiltInVariableContext)_localctx).id2!=null?((BuiltInVariableContext)_localctx).id2.getText():null))){

				                                                                list.add(df);

				                                                             }else{
				                                                                ErrorType et = new ErrorType(
				                                                                                ((BuiltInVariableContext)_localctx).id2.getLine(),
				                                                                                ((BuiltInVariableContext)_localctx).id2.getCharPositionInLine()+1,
				                                                                                "Already defined variable with name: " + (((BuiltInVariableContext)_localctx).id2!=null?((BuiltInVariableContext)_localctx).id2.getText():null));
				                                                                    }
				                                                                  
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(T__4);
			setState(247);
			((BuiltInVariableContext)_localctx).t1 = builtInType();

			                                                                     for(VariableDefinition vd : list){vd.setType(((BuiltInVariableContext)_localctx).t1.ast);}

			                                                                    
			((BuiltInVariableContext)_localctx).ast =  list;
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
		enterRule(_localctx, 16, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			((VariableContext)_localctx).i1 = match(ID);

			                                                      List<VariableDefinition> list = new ArrayList<>();

			                                                      list.add(new VariableDefinition(((VariableContext)_localctx).i1.getLine(),
			                                                                                      ((VariableContext)_localctx).i1.getCharPositionInLine()+1,
			                                                                                      (((VariableContext)_localctx).i1!=null?((VariableContext)_localctx).i1.getText():null),
			                                                                                      null));


			                                                    
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(253);
				match(T__2);
				setState(254);
				((VariableContext)_localctx).id2 = match(ID);

				                                                            VariableDefinition df = new VariableDefinition(
				                                                                                     ((VariableContext)_localctx).id2.getLine(),
				                                                                                     ((VariableContext)_localctx).id2.getCharPositionInLine()+1,
				                                                                                     (((VariableContext)_localctx).id2!=null?((VariableContext)_localctx).id2.getText():null),
				                                                                                     null);


				                                                             if(!list.stream().map(i -> i.getName()).toList().contains((((VariableContext)_localctx).id2!=null?((VariableContext)_localctx).id2.getText():null))){

				                                                               list.add(df);

				                                                             }else{
				                                                                ErrorType et = new ErrorType(
				                                                                                ((VariableContext)_localctx).id2.getLine(),
				                                                                                ((VariableContext)_localctx).id2.getCharPositionInLine()+1,
				                                                                                "Already defined variable with name: " + (((VariableContext)_localctx).id2!=null?((VariableContext)_localctx).id2.getText():null));
				                                                                    }
				                                                        
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(T__4);
			setState(262);
			((VariableContext)_localctx).t1 = type();

			                                                                     for(VariableDefinition vd : list){vd.setType(((VariableContext)_localctx).t1.ast);}

			                                                                    
			((VariableContext)_localctx).ast =  list;
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
		public ExpressionContext e1;
		public ExpressionContext ep2;
		public TypeContext t1;
		public ExpressionContext e;
		public Token OP;
		public Token i1;
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(267);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(),
				                    ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				{
				setState(269);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				                                       ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,
				                                       LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 3:
				{
				setState(271);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				                                                           ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,
				                                                           LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(273);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				                                            ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,
				                                            LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 5:
				{
				setState(275);
				match(T__1);
				setState(276);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(277);
				match(T__3);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast;
				}
				break;
			case 6:
				{
				setState(280);
				((ExpressionContext)_localctx).ID = match(ID);

				                     FunctionInvocation fi = new FunctionInvocation(((ExpressionContext)_localctx).ID.getLine(),
				                                                   ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,
				                                                   new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)));
				           
				setState(282);
				match(T__1);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(283);
					((ExpressionContext)_localctx).ep1 = expression(0);
					fi.addExpression(((ExpressionContext)_localctx).ep1.ast);
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(285);
						match(T__2);
						setState(286);
						((ExpressionContext)_localctx).ep2 = expression(0);
						fi.addExpression(((ExpressionContext)_localctx).ep2.ast);
						}
						}
						setState(293);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(296);
				match(T__3);
				((ExpressionContext)_localctx).ast = fi;
				}
				break;
			case 7:
				{
				setState(298);
				match(T__1);
				setState(299);
				((ExpressionContext)_localctx).t1 = type();
				setState(300);
				match(T__3);
				setState(301);
				((ExpressionContext)_localctx).ep1 = expression(7);

				                ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).t1.ast.getLine(), ((ExpressionContext)_localctx).t1.ast.getColumn(),((ExpressionContext)_localctx).t1.ast,((ExpressionContext)_localctx).ep1.ast);
				        
				}
				break;
			case 8:
				{
				setState(304);
				match(T__19);
				setState(305);
				((ExpressionContext)_localctx).e = expression(6);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e.ast.getLine(),((ExpressionContext)_localctx).e.ast.getColumn(),((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 9:
				{
				setState(308);
				match(T__20);
				setState(309);
				((ExpressionContext)_localctx).e = expression(5);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).e.ast.getLine(),((ExpressionContext)_localctx).e.ast.getColumn(),((ExpressionContext)_localctx).e.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(344);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ep1 = _prevctx;
						_localctx.ep1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(314);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(315);
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
						setState(316);
						((ExpressionContext)_localctx).ep2 = expression(5);

						                      ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).ep1.ast.getLine(),
						                                            ((ExpressionContext)_localctx).ep1.ast.getColumn(),
						                                            ((ExpressionContext)_localctx).ep1.ast,
						                                            (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),
						                                            ((ExpressionContext)_localctx).ep2.ast);
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ep1 = _prevctx;
						_localctx.ep1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(320);
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
						setState(321);
						((ExpressionContext)_localctx).ep2 = expression(4);

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
						setState(324);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(325);
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
						setState(326);
						((ExpressionContext)_localctx).ep2 = expression(3);

						                  ((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).ep1.ast.getLine(),
						                                        ((ExpressionContext)_localctx).ep1.ast.getColumn(),
						                                        ((ExpressionContext)_localctx).ep1.ast,
						                                        ((ExpressionContext)_localctx).ep2.ast,
						                                        (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						              
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ep1 = _prevctx;
						_localctx.ep1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(329);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(330);
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
						setState(331);
						((ExpressionContext)_localctx).ep2 = expression(2);

						                  ((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).ep1.ast.getLine(),
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
						setState(334);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(335);
						match(T__16);
						setState(336);
						((ExpressionContext)_localctx).ep2 = expression(0);
						setState(337);
						match(T__17);

						                      ((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).ep1.ast.getLine(), ((ExpressionContext)_localctx).ep1.ast.getColumn(), ((ExpressionContext)_localctx).ep1.ast, ((ExpressionContext)_localctx).ep2.ast);
						                  
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ep1 = _prevctx;
						_localctx.ep1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(340);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(341);
						match(T__18);
						setState(342);
						((ExpressionContext)_localctx).i1 = match(ID);

						                          ((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).ep1.ast.getLine(), ((ExpressionContext)_localctx).ep1.ast.getColumn(), ((ExpressionContext)_localctx).ep1.ast, (((ExpressionContext)_localctx).i1!=null?((ExpressionContext)_localctx).i1.getText():null));
						                  
						}
						break;
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				((TypeContext)_localctx).b1 = builtInType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).b1.ast;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(T__16);
				setState(353);
				((TypeContext)_localctx).I1 = match(INT_CONSTANT);
				setState(354);
				match(T__17);
				setState(355);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).ast =  new Array(((TypeContext)_localctx).I1.getLine(),((TypeContext)_localctx).I1.getCharPositionInLine()+1,
				                                        LexerHelper.lexemeToInt((((TypeContext)_localctx).I1!=null?((TypeContext)_localctx).I1.getText():null)),
				                                        ((TypeContext)_localctx).t.ast);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(T__33);
				setState(359);
				match(T__5);
				{
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(360);
					((TypeContext)_localctx).v = variableDefinition();


					                                        for(VariableDefinition df : ((TypeContext)_localctx).v.ast){

					                                            if(!_localctx.fields.stream().map(i -> i.getName()).toList().contains(df.getName())){

					                                            _localctx.fields.add( new RecordField(df.getLine(),
					                                                                    df.getColumn(),
					                                                                    df.getName(),
					                                                                   df.getType()
					                                                                   )
					                                                  );

					                                            }else{

					                                            ErrorType et = new ErrorType(
					                                                        df.getLine(),
					                                                        df.getColumn(),
					                                                        "Already defined field in struct with name: " + df.getName());

					                                            }

					                                         }


					                                      
					}
					}
					setState(365); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				setState(367);
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
		enterRule(_localctx, 22, RULE_builtInType);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(T__34);
				((BuiltInTypeContext)_localctx).ast =  Char.getInstance();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(T__35);
				((BuiltInTypeContext)_localctx).ast =  Integer.getInstance();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
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
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u017f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2%\13"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\65\n\3"+
		"\f\3\16\38\13\3\5\3:\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\3\3\7\3Q\n\3\f\3\16\3T\13\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4b\n\4\f\4\16\4e\13\4"+
		"\3\4\3\4\3\4\7\4j\n\4\f\4\16\4m\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5y\n\5\f\5\16\5|\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5\u0089\n\5\f\5\16\5\u008c\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a0\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5\u00b8\n\5\f\5\16\5\u00bb\13\5\5\5\u00bd\n\5\3\5\3\5\3\5\5\5\u00c2"+
		"\n\5\3\6\3\6\3\6\3\6\6\6\u00c8\n\6\r\6\16\6\u00c9\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u00d2\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00da\n\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u00e3\n\b\f\b\16\b\u00e6\13\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u00f4\n\t\f\t\16\t\u00f7\13\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u0103\n\n\f\n\16\n\u0106\13\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0124"+
		"\n\13\f\13\16\13\u0127\13\13\5\13\u0129\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u013b\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u015b\n\13\f\13\16\13\u015e\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u016e\n\f\r\f\16\f\u016f\3\f"+
		"\3\f\3\f\5\f\u0175\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u017d\n\r\3\r\2\3\24"+
		"\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6\3\2\30\32\4\2\26\26\33\33\3\2\34"+
		"!\3\2\"#\2\u01a1\2\32\3\2\2\2\4+\3\2\2\2\6W\3\2\2\2\b\u00c1\3\2\2\2\n"+
		"\u00d1\3\2\2\2\f\u00d9\3\2\2\2\16\u00dd\3\2\2\2\20\u00ee\3\2\2\2\22\u00fd"+
		"\3\2\2\2\24\u013a\3\2\2\2\26\u0174\3\2\2\2\30\u017c\3\2\2\2\32#\b\2\1"+
		"\2\33\34\5\f\7\2\34\35\b\2\1\2\35\"\3\2\2\2\36\37\5\4\3\2\37 \b\2\1\2"+
		" \"\3\2\2\2!\33\3\2\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3"+
		"\2\2\2%#\3\2\2\2&\'\5\6\4\2\'(\b\2\1\2()\7\2\2\3)*\b\2\1\2*\3\3\2\2\2"+
		"+,\7\3\2\2,-\7,\2\2-9\7\4\2\2./\5\20\t\2/\66\b\3\1\2\60\61\7\5\2\2\61"+
		"\62\5\20\t\2\62\63\b\3\1\2\63\65\3\2\2\2\64\60\3\2\2\2\658\3\2\2\2\66"+
		"\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\28\66\3\2\2\29.\3\2\2\29:\3\2\2\2"+
		":;\3\2\2\2;<\7\6\2\2<=\7\7\2\2=A\b\3\1\2>?\5\30\r\2?@\b\3\1\2@B\3\2\2"+
		"\2A>\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\b\3\1\2DJ\7\b\2\2EF\5\f\7\2FG\b\3\1"+
		"\2GI\3\2\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KR\3\2\2\2LJ\3\2\2"+
		"\2MN\5\b\5\2NO\b\3\1\2OQ\3\2\2\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2"+
		"\2SU\3\2\2\2TR\3\2\2\2UV\7\t\2\2V\5\3\2\2\2WX\7\3\2\2XY\7\n\2\2YZ\7\4"+
		"\2\2Z[\7\6\2\2[\\\7\7\2\2\\]\b\4\1\2]c\7\b\2\2^_\5\f\7\2_`\b\4\1\2`b\3"+
		"\2\2\2a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dk\3\2\2\2ec\3\2\2\2fg\5"+
		"\b\5\2gh\b\4\1\2hj\3\2\2\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3"+
		"\2\2\2mk\3\2\2\2no\7\t\2\2o\7\3\2\2\2pq\7\13\2\2qr\b\5\1\2rs\5\24\13\2"+
		"sz\b\5\1\2tu\7\5\2\2uv\5\24\13\2vw\b\5\1\2wy\3\2\2\2xt\3\2\2\2y|\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\f\2\2~\177\b\5\1\2\177"+
		"\u00c2\3\2\2\2\u0080\u0081\7\r\2\2\u0081\u0082\b\5\1\2\u0082\u0083\5\24"+
		"\13\2\u0083\u008a\b\5\1\2\u0084\u0085\7\5\2\2\u0085\u0086\5\24\13\2\u0086"+
		"\u0087\b\5\1\2\u0087\u0089\3\2\2\2\u0088\u0084\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7\f\2\2\u008e\u008f\b\5\1\2\u008f\u00c2\3\2"+
		"\2\2\u0090\u0091\5\24\13\2\u0091\u0092\7\16\2\2\u0092\u0093\5\24\13\2"+
		"\u0093\u0094\7\f\2\2\u0094\u0095\b\5\1\2\u0095\u00c2\3\2\2\2\u0096\u0097"+
		"\7\17\2\2\u0097\u0098\5\24\13\2\u0098\u0099\7\7\2\2\u0099\u009a\5\n\6"+
		"\2\u009a\u009f\b\5\1\2\u009b\u009c\7\20\2\2\u009c\u009d\5\n\6\2\u009d"+
		"\u009e\b\5\1\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\5\1\2\u00a2\u00c2\3\2\2\2\u00a3"+
		"\u00a4\7\21\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7"+
		"\5\n\6\2\u00a7\u00a8\b\5\1\2\u00a8\u00c2\3\2\2\2\u00a9\u00aa\7\22\2\2"+
		"\u00aa\u00ab\5\24\13\2\u00ab\u00ac\7\f\2\2\u00ac\u00ad\b\5\1\2\u00ad\u00c2"+
		"\3\2\2\2\u00ae\u00af\7,\2\2\u00af\u00b0\7\4\2\2\u00b0\u00bc\b\5\1\2\u00b1"+
		"\u00b2\5\24\13\2\u00b2\u00b9\b\5\1\2\u00b3\u00b4\7\5\2\2\u00b4\u00b5\5"+
		"\24\13\2\u00b5\u00b6\b\5\1\2\u00b6\u00b8\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00b1\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\7\6\2\2\u00bf\u00c0\7\f\2\2\u00c0\u00c2\b\5"+
		"\1\2\u00c1p\3\2\2\2\u00c1\u0080\3\2\2\2\u00c1\u0090\3\2\2\2\u00c1\u0096"+
		"\3\2\2\2\u00c1\u00a3\3\2\2\2\u00c1\u00a9\3\2\2\2\u00c1\u00ae\3\2\2\2\u00c2"+
		"\t\3\2\2\2\u00c3\u00c7\7\b\2\2\u00c4\u00c5\5\b\5\2\u00c5\u00c6\b\6\1\2"+
		"\u00c6\u00c8\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\t\2\2\u00cc"+
		"\u00cd\b\6\1\2\u00cd\u00d2\3\2\2\2\u00ce\u00cf\5\b\5\2\u00cf\u00d0\b\6"+
		"\1\2\u00d0\u00d2\3\2\2\2\u00d1\u00c3\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2"+
		"\13\3\2\2\2\u00d3\u00d4\5\22\n\2\u00d4\u00d5\b\7\1\2\u00d5\u00da\3\2\2"+
		"\2\u00d6\u00d7\5\16\b\2\u00d7\u00d8\b\7\1\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d3\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\f"+
		"\2\2\u00dc\r\3\2\2\2\u00dd\u00de\7,\2\2\u00de\u00e4\b\b\1\2\u00df\u00e0"+
		"\7\5\2\2\u00e0\u00e1\7,\2\2\u00e1\u00e3\b\b\1\2\u00e2\u00df\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\7\2\2\u00e8\u00e9\5\30\r\2\u00e9"+
		"\u00ea\7\16\2\2\u00ea\u00eb\5\24\13\2\u00eb\u00ec\b\b\1\2\u00ec\u00ed"+
		"\b\b\1\2\u00ed\17\3\2\2\2\u00ee\u00ef\7,\2\2\u00ef\u00f5\b\t\1\2\u00f0"+
		"\u00f1\7\5\2\2\u00f1\u00f2\7,\2\2\u00f2\u00f4\b\t\1\2\u00f3\u00f0\3\2"+
		"\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\7\2\2\u00f9\u00fa\5\30"+
		"\r\2\u00fa\u00fb\b\t\1\2\u00fb\u00fc\b\t\1\2\u00fc\21\3\2\2\2\u00fd\u00fe"+
		"\7,\2\2\u00fe\u0104\b\n\1\2\u00ff\u0100\7\5\2\2\u0100\u0101\7,\2\2\u0101"+
		"\u0103\b\n\1\2\u0102\u00ff\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0108\7\7\2\2\u0108\u0109\5\26\f\2\u0109\u010a\b\n\1\2\u010a\u010b\b"+
		"\n\1\2\u010b\23\3\2\2\2\u010c\u010d\b\13\1\2\u010d\u010e\7,\2\2\u010e"+
		"\u013b\b\13\1\2\u010f\u0110\7+\2\2\u0110\u013b\b\13\1\2\u0111\u0112\7"+
		".\2\2\u0112\u013b\b\13\1\2\u0113\u0114\7-\2\2\u0114\u013b\b\13\1\2\u0115"+
		"\u0116\7\4\2\2\u0116\u0117\5\24\13\2\u0117\u0118\7\6\2\2\u0118\u0119\b"+
		"\13\1\2\u0119\u013b\3\2\2\2\u011a\u011b\7,\2\2\u011b\u011c\b\13\1\2\u011c"+
		"\u0128\7\4\2\2\u011d\u011e\5\24\13\2\u011e\u0125\b\13\1\2\u011f\u0120"+
		"\7\5\2\2\u0120\u0121\5\24\13\2\u0121\u0122\b\13\1\2\u0122\u0124\3\2\2"+
		"\2\u0123\u011f\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u011d\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7\6\2\2\u012b\u013b\b\13"+
		"\1\2\u012c\u012d\7\4\2\2\u012d\u012e\5\26\f\2\u012e\u012f\7\6\2\2\u012f"+
		"\u0130\5\24\13\t\u0130\u0131\b\13\1\2\u0131\u013b\3\2\2\2\u0132\u0133"+
		"\7\26\2\2\u0133\u0134\5\24\13\b\u0134\u0135\b\13\1\2\u0135\u013b\3\2\2"+
		"\2\u0136\u0137\7\27\2\2\u0137\u0138\5\24\13\7\u0138\u0139\b\13\1\2\u0139"+
		"\u013b\3\2\2\2\u013a\u010c\3\2\2\2\u013a\u010f\3\2\2\2\u013a\u0111\3\2"+
		"\2\2\u013a\u0113\3\2\2\2\u013a\u0115\3\2\2\2\u013a\u011a\3\2\2\2\u013a"+
		"\u012c\3\2\2\2\u013a\u0132\3\2\2\2\u013a\u0136\3\2\2\2\u013b\u015c\3\2"+
		"\2\2\u013c\u013d\f\6\2\2\u013d\u013e\t\2\2\2\u013e\u013f\5\24\13\7\u013f"+
		"\u0140\b\13\1\2\u0140\u015b\3\2\2\2\u0141\u0142\f\5\2\2\u0142\u0143\t"+
		"\3\2\2\u0143\u0144\5\24\13\6\u0144\u0145\b\13\1\2\u0145\u015b\3\2\2\2"+
		"\u0146\u0147\f\4\2\2\u0147\u0148\t\4\2\2\u0148\u0149\5\24\13\5\u0149\u014a"+
		"\b\13\1\2\u014a\u015b\3\2\2\2\u014b\u014c\f\3\2\2\u014c\u014d\t\5\2\2"+
		"\u014d\u014e\5\24\13\4\u014e\u014f\b\13\1\2\u014f\u015b\3\2\2\2\u0150"+
		"\u0151\f\13\2\2\u0151\u0152\7\23\2\2\u0152\u0153\5\24\13\2\u0153\u0154"+
		"\7\24\2\2\u0154\u0155\b\13\1\2\u0155\u015b\3\2\2\2\u0156\u0157\f\n\2\2"+
		"\u0157\u0158\7\25\2\2\u0158\u0159\7,\2\2\u0159\u015b\b\13\1\2\u015a\u013c"+
		"\3\2\2\2\u015a\u0141\3\2\2\2\u015a\u0146\3\2\2\2\u015a\u014b\3\2\2\2\u015a"+
		"\u0150\3\2\2\2\u015a\u0156\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d\25\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160"+
		"\5\30\r\2\u0160\u0161\b\f\1\2\u0161\u0175\3\2\2\2\u0162\u0163\7\23\2\2"+
		"\u0163\u0164\7+\2\2\u0164\u0165\7\24\2\2\u0165\u0166\5\26\f\2\u0166\u0167"+
		"\b\f\1\2\u0167\u0175\3\2\2\2\u0168\u0169\7$\2\2\u0169\u016d\7\b\2\2\u016a"+
		"\u016b\5\f\7\2\u016b\u016c\b\f\1\2\u016c\u016e\3\2\2\2\u016d\u016a\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\7\t\2\2\u0172\u0173\b\f\1\2\u0173\u0175\3\2"+
		"\2\2\u0174\u015f\3\2\2\2\u0174\u0162\3\2\2\2\u0174\u0168\3\2\2\2\u0175"+
		"\27\3\2\2\2\u0176\u0177\7%\2\2\u0177\u017d\b\r\1\2\u0178\u0179\7&\2\2"+
		"\u0179\u017d\b\r\1\2\u017a\u017b\7\'\2\2\u017b\u017d\b\r\1\2\u017c\u0176"+
		"\3\2\2\2\u017c\u0178\3\2\2\2\u017c\u017a\3\2\2\2\u017d\31\3\2\2\2\37!"+
		"#\669AJRckz\u008a\u009f\u00b9\u00bc\u00c1\u00c9\u00d1\u00d9\u00e4\u00f5"+
		"\u0104\u0125\u0128\u013a\u015a\u015c\u016f\u0174\u017c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
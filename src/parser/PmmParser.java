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
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(27);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(21);
						((ProgramContext)_localctx).variableDefinition = variableDefinition();
						program.addAllVariableDefinitions(((ProgramContext)_localctx).variableDefinition.ast);
						}
						break;
					case T__0:
						{
						setState(24);
						((ProgramContext)_localctx).funcDefinition = funcDefinition();
						program.addDefinition(((ProgramContext)_localctx).funcDefinition.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(32);
			((ProgramContext)_localctx).mainProgram = mainProgram();
			program.addDefinition(((ProgramContext)_localctx).mainProgram.ast);
			setState(34);
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
		public VariableContext v1;
		public VariableContext v2;
		public Token col;
		public BuiltInTypeContext b;
		public VariableDefinitionContext var1;
		public StatementContext stm1;
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
			setState(37);
			((FuncDefinitionContext)_localctx).d = match(T__0);
			setState(38);
			((FuncDefinitionContext)_localctx).i1 = match(ID);
			setState(39);
			match(T__1);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(40);
				((FuncDefinitionContext)_localctx).v1 = variable();
				_localctx.params.addAll(((FuncDefinitionContext)_localctx).v1.ast);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(42);
					match(T__2);
					setState(43);
					((FuncDefinitionContext)_localctx).v2 = variable();
					_localctx.params.addAll(((FuncDefinitionContext)_localctx).v2.ast);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(53);
			match(T__3);
			setState(54);
			((FuncDefinitionContext)_localctx).col = match(T__4);
			Type builtIn = new Void(((FuncDefinitionContext)_localctx).col.getLine(),((FuncDefinitionContext)_localctx).col.getCharPositionInLine()+1);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) {
				{
				setState(56);
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
			               
			setState(62);
			match(T__5);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63);
					((FuncDefinitionContext)_localctx).var1 = variableDefinition();
					_localctx.ast.addAllVariableDefinitions(((FuncDefinitionContext)_localctx).var1.ast);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(71);
				((FuncDefinitionContext)_localctx).stm1 = statement();
				_localctx.ast.addStatement(((FuncDefinitionContext)_localctx).stm1.ast);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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
			setState(81);
			((MainProgramContext)_localctx).d = match(T__0);
			setState(82);
			match(T__7);
			setState(83);
			match(T__1);
			setState(84);
			match(T__3);
			setState(85);
			((MainProgramContext)_localctx).col = match(T__4);
			((MainProgramContext)_localctx).ast =  new FunctionDefinition(((MainProgramContext)_localctx).d.getLine(),
			                                             ((MainProgramContext)_localctx).d.getCharPositionInLine()+1,
			                                             "main",
			                                             new FunctionType(((MainProgramContext)_localctx).col.getLine(),
			                                                              ((MainProgramContext)_localctx).col.getCharPositionInLine()+1,
			                                                              new Void(0,0),
			                                                              new ArrayList<>()
			                                                              )
			                                             );
			               
			setState(87);
			match(T__5);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					((MainProgramContext)_localctx).var1 = variableDefinition();
					_localctx.ast.addAllVariableDefinitions(((MainProgramContext)_localctx).var1.ast);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(96);
				((MainProgramContext)_localctx).stm1 = statement();
				_localctx.ast.addStatement(((MainProgramContext)_localctx).stm1.ast);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				((StatementContext)_localctx).p = match(T__8);
				Print stm = new Print(((StatementContext)_localctx).p.getLine(),((StatementContext)_localctx).p.getCharPositionInLine()+1);
				setState(108);
				((StatementContext)_localctx).e1 = expression(0);
				stm.addExpression(((StatementContext)_localctx).e1.ast);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(110);
					match(T__2);
					setState(111);
					((StatementContext)_localctx).e2 = expression(0);
					stm.addExpression(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(T__9);
				((StatementContext)_localctx).ast =  stm;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				((StatementContext)_localctx).i = match(T__10);
				Input stm = new Input(((StatementContext)_localctx).i.getLine(),((StatementContext)_localctx).i.getCharPositionInLine()+1);
				setState(124);
				((StatementContext)_localctx).e1 = expression(0);
				stm.addExpression(((StatementContext)_localctx).e1.ast);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(126);
					match(T__2);
					setState(127);
					((StatementContext)_localctx).e2 = expression(0);
					stm.addExpression(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(T__9);
				((StatementContext)_localctx).ast =  stm;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				((StatementContext)_localctx).e1 = expression(0);
				setState(139);
				match(T__11);
				setState(140);
				((StatementContext)_localctx).e2 = expression(0);
				setState(141);
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
				setState(144);
				((StatementContext)_localctx).ifTxt = match(T__12);
				setState(145);
				((StatementContext)_localctx).e1 = expression(0);
				setState(146);
				match(T__4);
				setState(147);
				((StatementContext)_localctx).s1 = stmBody();
				If ifStatement = new If(((StatementContext)_localctx).ifTxt.getLine(),
				                                                    ((StatementContext)_localctx).ifTxt.getCharPositionInLine()+1,
				                                                    ((StatementContext)_localctx).e1.ast);

				                                      ifStatement.addAllStatementsTrue(((StatementContext)_localctx).s1.ast);

				                                      
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(149);
					match(T__13);
					setState(150);
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
				setState(157);
				((StatementContext)_localctx).w = match(T__14);
				setState(158);
				((StatementContext)_localctx).e1 = expression(0);
				setState(159);
				match(T__4);
				setState(160);
				((StatementContext)_localctx).s1 = stmBody();
				((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).w.getLine(),
				                                                        ((StatementContext)_localctx).w.getCharPositionInLine()+1,
				                                                        ((StatementContext)_localctx).e1.ast,((StatementContext)_localctx).s1.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				((StatementContext)_localctx).r = match(T__15);
				setState(164);
				((StatementContext)_localctx).e1 = expression(0);
				setState(165);
				match(T__9);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).r.getLine(),
				                                               ((StatementContext)_localctx).r.getCharPositionInLine()+1,
				                                               ((StatementContext)_localctx).e1.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				((StatementContext)_localctx).i1 = match(ID);
				setState(169);
				match(T__1);
				ProcedureInvocation pi = new ProcedureInvocation(((StatementContext)_localctx).i1.getLine(),
				                                                              ((StatementContext)_localctx).i1.getCharPositionInLine()+1,
				                                                              new Variable(((StatementContext)_localctx).i1.getLine(),
				                                                                           ((StatementContext)_localctx).i1.getCharPositionInLine()+1,
				                                                                           (((StatementContext)_localctx).i1!=null?((StatementContext)_localctx).i1.getText():null)));
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(171);
					((StatementContext)_localctx).e1 = expression(0);
					pi.addExpression(((StatementContext)_localctx).e1.ast);
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(173);
						match(T__2);
						setState(174);
						((StatementContext)_localctx).e2 = expression(0);
						pi.addExpression(((StatementContext)_localctx).e2.ast);
						}
						}
						setState(181);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(184);
				match(T__3);
				setState(185);
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
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(T__5);
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(190);
					((StmBodyContext)_localctx).s1 = statement();
					_localctx.stms.add(((StmBodyContext)_localctx).s1.ast);
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(197);
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
				setState(200);
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
			setState(205);
			((VariableDefinitionContext)_localctx).v1 = variable();
			((VariableDefinitionContext)_localctx).ast =  ((VariableDefinitionContext)_localctx).v1.ast;
			setState(207);
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
			setState(209);
			((VariableContext)_localctx).i1 = match(ID);

			                                                      List<VariableDefinition> list = new ArrayList<>();
			                                                      list.add(new VariableDefinition(((VariableContext)_localctx).i1.getLine(),
			                                                                                      ((VariableContext)_localctx).i1.getCharPositionInLine()+1,
			                                                                                      (((VariableContext)_localctx).i1!=null?((VariableContext)_localctx).i1.getText():null),
			                                                                                      null));
			                                                    
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(211);
				match(T__2);
				setState(212);
				((VariableContext)_localctx).id2 = match(ID);

				                                                                     list.add(new VariableDefinition(((VariableContext)_localctx).id2.getLine(),
				                                                                                                     ((VariableContext)_localctx).id2.getCharPositionInLine()+1,
				                                                                                                     (((VariableContext)_localctx).id2!=null?((VariableContext)_localctx).id2.getText():null),
				                                                                                                     null));
				                                                                    
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(T__4);
			setState(220);
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(225);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(),
				                    ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				{
				setState(227);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				                                       ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,
				                                       LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 3:
				{
				setState(229);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				                                                           ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,
				                                                           LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(231);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				                                            ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,
				                                            LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 5:
				{
				setState(233);
				((ExpressionContext)_localctx).ID = match(ID);

				                     FunctionInvocation fi = new FunctionInvocation(((ExpressionContext)_localctx).ID.getLine(),
				                                                   ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,
				                                                   new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)));
				           
				setState(235);
				match(T__1);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(236);
					((ExpressionContext)_localctx).ep1 = expression(0);
					fi.addExpression(((ExpressionContext)_localctx).ep1.ast);
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(238);
						match(T__2);
						setState(239);
						((ExpressionContext)_localctx).ep2 = expression(0);
						fi.addExpression(((ExpressionContext)_localctx).ep2.ast);
						}
						}
						setState(246);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(249);
				match(T__3);
				((ExpressionContext)_localctx).ast = fi;
				}
				break;
			case 6:
				{
				setState(251);
				match(T__1);
				setState(252);
				((ExpressionContext)_localctx).t1 = type();
				setState(253);
				match(T__3);
				setState(254);
				((ExpressionContext)_localctx).ep1 = expression(7);

				                ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).t1.ast.getLine(), ((ExpressionContext)_localctx).t1.ast.getColumn(),((ExpressionContext)_localctx).t1.ast,((ExpressionContext)_localctx).ep1.ast);
				        
				}
				break;
			case 7:
				{
				setState(257);
				match(T__19);
				setState(258);
				((ExpressionContext)_localctx).e = expression(6);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e.ast.getLine(),((ExpressionContext)_localctx).e.ast.getColumn(),((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 8:
				{
				setState(261);
				match(T__20);
				setState(262);
				((ExpressionContext)_localctx).e = expression(5);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).e.ast.getLine(),((ExpressionContext)_localctx).e.ast.getColumn(),((ExpressionContext)_localctx).e.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ep1 = _prevctx;
						_localctx.ep1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(268);
						match(T__18);
						setState(269);
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
						setState(272);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(273);
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
						setState(274);
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
						setState(277);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(278);
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
						setState(279);
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
						setState(282);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(283);
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
						setState(284);
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
						setState(287);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(288);
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
						setState(289);
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
						setState(292);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(293);
						match(T__16);
						setState(294);
						((ExpressionContext)_localctx).ep2 = expression(0);
						setState(295);
						match(T__17);

						                      ((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).ep1.ast.getLine(), ((ExpressionContext)_localctx).ep1.ast.getColumn(), ((ExpressionContext)_localctx).ep1.ast, ((ExpressionContext)_localctx).ep2.ast);
						                  
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				((TypeContext)_localctx).b1 = builtInType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).b1.ast;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(T__16);
				setState(307);
				((TypeContext)_localctx).I1 = match(INT_CONSTANT);
				setState(308);
				match(T__17);
				setState(309);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).ast =  new Array(((TypeContext)_localctx).I1.getLine(),((TypeContext)_localctx).I1.getCharPositionInLine()+1,
				                                        LexerHelper.lexemeToInt((((TypeContext)_localctx).I1!=null?((TypeContext)_localctx).I1.getText():null)),
				                                        ((TypeContext)_localctx).t.ast);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				match(T__33);
				setState(313);
				match(T__5);
				{
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(314);
					((TypeContext)_localctx).v = variableDefinition();


					                                        for(VariableDefinition df : ((TypeContext)_localctx).v.ast){
					                                               _localctx.fields.add( new RecordField(df.getName(),
					                                                                           df.getType()
					                                                                           )
					                                                          );
					                                         }


					                                      
					}
					}
					setState(319); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				setState(321);
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
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(T__34);
				((BuiltInTypeContext)_localctx).ast =  Char.getInstance();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(T__35);
				((BuiltInTypeContext)_localctx).ast =  Integer.getInstance();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0151\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64\13"+
		"\3\5\3\66\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"E\n\3\f\3\16\3H\13\3\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\4\3\4\3\4"+
		"\7\4f\n\4\f\4\16\4i\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5u"+
		"\n\5\f\5\16\5x\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0085"+
		"\n\5\f\5\16\5\u0088\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009c\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00b4\n"+
		"\5\f\5\16\5\u00b7\13\5\5\5\u00b9\n\5\3\5\3\5\3\5\5\5\u00be\n\5\3\6\3\6"+
		"\3\6\3\6\6\6\u00c4\n\6\r\6\16\6\u00c5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ce"+
		"\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u00d9\n\b\f\b\16\b\u00dc"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00f5\n\t\f\t\16\t\u00f8\13\t\5\t\u00fa"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u010c\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u012d\n\t\f\t\16\t\u0130\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\6\n\u0140\n\n\r\n\16\n\u0141\3\n\3\n\3\n\5\n\u0147\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u014f\n\13\3\13\2\3\20\f\2\4\6\b"+
		"\n\f\16\20\22\24\2\6\3\2\30\32\4\2\26\26\33\33\3\2\34!\3\2\"#\2\u0171"+
		"\2\26\3\2\2\2\4\'\3\2\2\2\6S\3\2\2\2\b\u00bd\3\2\2\2\n\u00cd\3\2\2\2\f"+
		"\u00cf\3\2\2\2\16\u00d3\3\2\2\2\20\u010b\3\2\2\2\22\u0146\3\2\2\2\24\u014e"+
		"\3\2\2\2\26\37\b\2\1\2\27\30\5\f\7\2\30\31\b\2\1\2\31\36\3\2\2\2\32\33"+
		"\5\4\3\2\33\34\b\2\1\2\34\36\3\2\2\2\35\27\3\2\2\2\35\32\3\2\2\2\36!\3"+
		"\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\5\6\4\2#$\b"+
		"\2\1\2$%\7\2\2\3%&\b\2\1\2&\3\3\2\2\2\'(\7\3\2\2()\7,\2\2)\65\7\4\2\2"+
		"*+\5\16\b\2+\62\b\3\1\2,-\7\5\2\2-.\5\16\b\2./\b\3\1\2/\61\3\2\2\2\60"+
		",\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\66\3\2\2\2\64\62"+
		"\3\2\2\2\65*\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\6\2\289\7\7\2\2"+
		"9=\b\3\1\2:;\5\24\13\2;<\b\3\1\2<>\3\2\2\2=:\3\2\2\2=>\3\2\2\2>?\3\2\2"+
		"\2?@\b\3\1\2@F\7\b\2\2AB\5\f\7\2BC\b\3\1\2CE\3\2\2\2DA\3\2\2\2EH\3\2\2"+
		"\2FD\3\2\2\2FG\3\2\2\2GN\3\2\2\2HF\3\2\2\2IJ\5\b\5\2JK\b\3\1\2KM\3\2\2"+
		"\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\t\2"+
		"\2R\5\3\2\2\2ST\7\3\2\2TU\7\n\2\2UV\7\4\2\2VW\7\6\2\2WX\7\7\2\2XY\b\4"+
		"\1\2Y_\7\b\2\2Z[\5\f\7\2[\\\b\4\1\2\\^\3\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3"+
		"\2\2\2_`\3\2\2\2`g\3\2\2\2a_\3\2\2\2bc\5\b\5\2cd\b\4\1\2df\3\2\2\2eb\3"+
		"\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\t\2\2k\7"+
		"\3\2\2\2lm\7\13\2\2mn\b\5\1\2no\5\20\t\2ov\b\5\1\2pq\7\5\2\2qr\5\20\t"+
		"\2rs\b\5\1\2su\3\2\2\2tp\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2"+
		"\2xv\3\2\2\2yz\7\f\2\2z{\b\5\1\2{\u00be\3\2\2\2|}\7\r\2\2}~\b\5\1\2~\177"+
		"\5\20\t\2\177\u0086\b\5\1\2\u0080\u0081\7\5\2\2\u0081\u0082\5\20\t\2\u0082"+
		"\u0083\b\5\1\2\u0083\u0085\3\2\2\2\u0084\u0080\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\7\f\2\2\u008a\u008b\b\5\1\2\u008b\u00be\3\2"+
		"\2\2\u008c\u008d\5\20\t\2\u008d\u008e\7\16\2\2\u008e\u008f\5\20\t\2\u008f"+
		"\u0090\7\f\2\2\u0090\u0091\b\5\1\2\u0091\u00be\3\2\2\2\u0092\u0093\7\17"+
		"\2\2\u0093\u0094\5\20\t\2\u0094\u0095\7\7\2\2\u0095\u0096\5\n\6\2\u0096"+
		"\u009b\b\5\1\2\u0097\u0098\7\20\2\2\u0098\u0099\5\n\6\2\u0099\u009a\b"+
		"\5\1\2\u009a\u009c\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\b\5\1\2\u009e\u00be\3\2\2\2\u009f\u00a0\7\21"+
		"\2\2\u00a0\u00a1\5\20\t\2\u00a1\u00a2\7\7\2\2\u00a2\u00a3\5\n\6\2\u00a3"+
		"\u00a4\b\5\1\2\u00a4\u00be\3\2\2\2\u00a5\u00a6\7\22\2\2\u00a6\u00a7\5"+
		"\20\t\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9\b\5\1\2\u00a9\u00be\3\2\2\2\u00aa"+
		"\u00ab\7,\2\2\u00ab\u00ac\7\4\2\2\u00ac\u00b8\b\5\1\2\u00ad\u00ae\5\20"+
		"\t\2\u00ae\u00b5\b\5\1\2\u00af\u00b0\7\5\2\2\u00b0\u00b1\5\20\t\2\u00b1"+
		"\u00b2\b\5\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00b7\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00ad\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bb\7\6\2\2\u00bb\u00bc\7\f\2\2\u00bc\u00be\b\5\1\2\u00bd"+
		"l\3\2\2\2\u00bd|\3\2\2\2\u00bd\u008c\3\2\2\2\u00bd\u0092\3\2\2\2\u00bd"+
		"\u009f\3\2\2\2\u00bd\u00a5\3\2\2\2\u00bd\u00aa\3\2\2\2\u00be\t\3\2\2\2"+
		"\u00bf\u00c3\7\b\2\2\u00c0\u00c1\5\b\5\2\u00c1\u00c2\b\6\1\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\t\2\2\u00c8\u00c9\b\6"+
		"\1\2\u00c9\u00ce\3\2\2\2\u00ca\u00cb\5\b\5\2\u00cb\u00cc\b\6\1\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00bf\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\13\3\2\2"+
		"\2\u00cf\u00d0\5\16\b\2\u00d0\u00d1\b\7\1\2\u00d1\u00d2\7\f\2\2\u00d2"+
		"\r\3\2\2\2\u00d3\u00d4\7,\2\2\u00d4\u00da\b\b\1\2\u00d5\u00d6\7\5\2\2"+
		"\u00d6\u00d7\7,\2\2\u00d7\u00d9\b\b\1\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\7\7\2\2\u00de\u00df\5\22\n\2\u00df\u00e0\b"+
		"\b\1\2\u00e0\u00e1\b\b\1\2\u00e1\17\3\2\2\2\u00e2\u00e3\b\t\1\2\u00e3"+
		"\u00e4\7,\2\2\u00e4\u010c\b\t\1\2\u00e5\u00e6\7+\2\2\u00e6\u010c\b\t\1"+
		"\2\u00e7\u00e8\7.\2\2\u00e8\u010c\b\t\1\2\u00e9\u00ea\7-\2\2\u00ea\u010c"+
		"\b\t\1\2\u00eb\u00ec\7,\2\2\u00ec\u00ed\b\t\1\2\u00ed\u00f9\7\4\2\2\u00ee"+
		"\u00ef\5\20\t\2\u00ef\u00f6\b\t\1\2\u00f0\u00f1\7\5\2\2\u00f1\u00f2\5"+
		"\20\t\2\u00f2\u00f3\b\t\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00ee\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\7\6\2\2\u00fc\u010c\b\t\1\2\u00fd\u00fe\7\4"+
		"\2\2\u00fe\u00ff\5\22\n\2\u00ff\u0100\7\6\2\2\u0100\u0101\5\20\t\t\u0101"+
		"\u0102\b\t\1\2\u0102\u010c\3\2\2\2\u0103\u0104\7\26\2\2\u0104\u0105\5"+
		"\20\t\b\u0105\u0106\b\t\1\2\u0106\u010c\3\2\2\2\u0107\u0108\7\27\2\2\u0108"+
		"\u0109\5\20\t\7\u0109\u010a\b\t\1\2\u010a\u010c\3\2\2\2\u010b\u00e2\3"+
		"\2\2\2\u010b\u00e5\3\2\2\2\u010b\u00e7\3\2\2\2\u010b\u00e9\3\2\2\2\u010b"+
		"\u00eb\3\2\2\2\u010b\u00fd\3\2\2\2\u010b\u0103\3\2\2\2\u010b\u0107\3\2"+
		"\2\2\u010c\u012e\3\2\2\2\u010d\u010e\f\n\2\2\u010e\u010f\7\25\2\2\u010f"+
		"\u0110\5\20\t\13\u0110\u0111\b\t\1\2\u0111\u012d\3\2\2\2\u0112\u0113\f"+
		"\6\2\2\u0113\u0114\t\2\2\2\u0114\u0115\5\20\t\7\u0115\u0116\b\t\1\2\u0116"+
		"\u012d\3\2\2\2\u0117\u0118\f\5\2\2\u0118\u0119\t\3\2\2\u0119\u011a\5\20"+
		"\t\6\u011a\u011b\b\t\1\2\u011b\u012d\3\2\2\2\u011c\u011d\f\4\2\2\u011d"+
		"\u011e\t\4\2\2\u011e\u011f\5\20\t\5\u011f\u0120\b\t\1\2\u0120\u012d\3"+
		"\2\2\2\u0121\u0122\f\3\2\2\u0122\u0123\t\5\2\2\u0123\u0124\5\20\t\4\u0124"+
		"\u0125\b\t\1\2\u0125\u012d\3\2\2\2\u0126\u0127\f\13\2\2\u0127\u0128\7"+
		"\23\2\2\u0128\u0129\5\20\t\2\u0129\u012a\7\24\2\2\u012a\u012b\b\t\1\2"+
		"\u012b\u012d\3\2\2\2\u012c\u010d\3\2\2\2\u012c\u0112\3\2\2\2\u012c\u0117"+
		"\3\2\2\2\u012c\u011c\3\2\2\2\u012c\u0121\3\2\2\2\u012c\u0126\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\21\3\2\2"+
		"\2\u0130\u012e\3\2\2\2\u0131\u0132\5\24\13\2\u0132\u0133\b\n\1\2\u0133"+
		"\u0147\3\2\2\2\u0134\u0135\7\23\2\2\u0135\u0136\7+\2\2\u0136\u0137\7\24"+
		"\2\2\u0137\u0138\5\22\n\2\u0138\u0139\b\n\1\2\u0139\u0147\3\2\2\2\u013a"+
		"\u013b\7$\2\2\u013b\u013f\7\b\2\2\u013c\u013d\5\f\7\2\u013d\u013e\b\n"+
		"\1\2\u013e\u0140\3\2\2\2\u013f\u013c\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\t"+
		"\2\2\u0144\u0145\b\n\1\2\u0145\u0147\3\2\2\2\u0146\u0131\3\2\2\2\u0146"+
		"\u0134\3\2\2\2\u0146\u013a\3\2\2\2\u0147\23\3\2\2\2\u0148\u0149\7%\2\2"+
		"\u0149\u014f\b\13\1\2\u014a\u014b\7&\2\2\u014b\u014f\b\13\1\2\u014c\u014d"+
		"\7\'\2\2\u014d\u014f\b\13\1\2\u014e\u0148\3\2\2\2\u014e\u014a\3\2\2\2"+
		"\u014e\u014c\3\2\2\2\u014f\25\3\2\2\2\34\35\37\62\65=FN_gv\u0086\u009b"+
		"\u00b5\u00b8\u00bd\u00c5\u00cd\u00da\u00f6\u00f9\u010b\u012c\u012e\u0141"+
		"\u0146\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
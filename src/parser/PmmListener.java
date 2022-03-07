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


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PmmParser}.
 */
public interface PmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefinition(PmmParser.FuncDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefinition(PmmParser.FuncDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void enterMainProgram(PmmParser.MainProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void exitMainProgram(PmmParser.MainProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#stmBody}.
	 * @param ctx the parse tree
	 */
	void enterStmBody(PmmParser.StmBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#stmBody}.
	 * @param ctx the parse tree
	 */
	void exitStmBody(PmmParser.StmBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(PmmParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(PmmParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#builtInVariable}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInVariable(PmmParser.BuiltInVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#builtInVariable}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInVariable(PmmParser.BuiltInVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PmmParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PmmParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PmmParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInType(PmmParser.BuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInType(PmmParser.BuiltInTypeContext ctx);
}
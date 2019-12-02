// Generated from /home/marcio/Documentos/UFLA/2019_2/compiladores/TP/TP_Compiladores/trab01/src/main/resources/JMMParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JMMParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JMMParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JMMParserParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdentifier(JMMParserParser.QualifiedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JMMParserParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(JMMParserParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JMMParserParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JMMParserParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDecl(JMMParserParser.MemberDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JMMParserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JMMParserParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JMMParserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JMMParserParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JMMParserParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(JMMParserParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(JMMParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JMMParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JMMParserParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JMMParserParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JMMParserParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JMMParserParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JMMParserParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(JMMParserParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(JMMParserParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(JMMParserParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JMMParserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(JMMParserParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(JMMParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(JMMParserParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JMMParserParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JMMParserParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JMMParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(JMMParserParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleUnaryExpression(JMMParserParser.SimpleUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(JMMParserParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(JMMParserParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JMMParserParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(JMMParserParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#newArrayDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArrayDeclarator(JMMParserParser.NewArrayDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JMMParserParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JMMParserParser.LiteralContext ctx);
}
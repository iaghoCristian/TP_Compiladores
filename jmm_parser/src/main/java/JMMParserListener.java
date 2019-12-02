// Generated from /home/marcio/Documentos/UFLA/2019_2/compiladores/TP/TP_Compiladores/trab01/src/main/resources/JMMParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JMMParserParser}.
 */
public interface JMMParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JMMParserParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JMMParserParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdentifier(JMMParserParser.QualifiedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdentifier(JMMParserParser.QualifiedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JMMParserParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JMMParserParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(JMMParserParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(JMMParserParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JMMParserParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JMMParserParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JMMParserParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JMMParserParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void enterMemberDecl(JMMParserParser.MemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void exitMemberDecl(JMMParserParser.MemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JMMParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JMMParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JMMParserParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JMMParserParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JMMParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JMMParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JMMParserParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JMMParserParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JMMParserParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JMMParserParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JMMParserParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JMMParserParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JMMParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JMMParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JMMParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JMMParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JMMParserParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JMMParserParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JMMParserParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JMMParserParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JMMParserParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JMMParserParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JMMParserParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JMMParserParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JMMParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JMMParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(JMMParserParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(JMMParserParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(JMMParserParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(JMMParserParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JMMParserParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JMMParserParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JMMParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JMMParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JMMParserParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JMMParserParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(JMMParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(JMMParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JMMParserParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JMMParserParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JMMParserParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JMMParserParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JMMParserParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JMMParserParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JMMParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JMMParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JMMParserParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JMMParserParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUnaryExpression(JMMParserParser.SimpleUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUnaryExpression(JMMParserParser.SimpleUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JMMParserParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JMMParserParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(JMMParserParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(JMMParserParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JMMParserParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JMMParserParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(JMMParserParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(JMMParserParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#newArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayDeclarator(JMMParserParser.NewArrayDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#newArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayDeclarator(JMMParserParser.NewArrayDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMMParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JMMParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMMParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JMMParserParser.LiteralContext ctx);
}
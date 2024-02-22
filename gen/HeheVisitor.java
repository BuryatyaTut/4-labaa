// Generated from C:/Users/slove/Itmo/tmp/Trans-methods/Lab4/src/Hehe.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HeheParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HeheVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HeheParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(HeheParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeheParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(HeheParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeheParser#makeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeRule(HeheParser.MakeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeheParser#makeTerminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeTerminal(HeheParser.MakeTerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeheParser#apply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApply(HeheParser.ApplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeheParser#applyNotTerminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyNotTerminal(HeheParser.ApplyNotTerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeheParser#applyTerminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyTerminal(HeheParser.ApplyTerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeheParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(HeheParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeheParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(HeheParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeheParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(HeheParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeheParser#otherArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherArgs(HeheParser.OtherArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeheParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(HeheParser.ReturnContext ctx);
}
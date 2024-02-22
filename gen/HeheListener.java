// Generated from C:/Users/slove/Itmo/tmp/Trans-methods/Lab4/src/Hehe.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HeheParser}.
 */
public interface HeheListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HeheParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(HeheParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link HeheParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(HeheParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link HeheParser#all}.
	 * @param ctx the parse tree
	 */
	void enterAll(HeheParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by {@link HeheParser#all}.
	 * @param ctx the parse tree
	 */
	void exitAll(HeheParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by {@link HeheParser#makeRule}.
	 * @param ctx the parse tree
	 */
	void enterMakeRule(HeheParser.MakeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HeheParser#makeRule}.
	 * @param ctx the parse tree
	 */
	void exitMakeRule(HeheParser.MakeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HeheParser#makeTerminal}.
	 * @param ctx the parse tree
	 */
	void enterMakeTerminal(HeheParser.MakeTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HeheParser#makeTerminal}.
	 * @param ctx the parse tree
	 */
	void exitMakeTerminal(HeheParser.MakeTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HeheParser#apply}.
	 * @param ctx the parse tree
	 */
	void enterApply(HeheParser.ApplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HeheParser#apply}.
	 * @param ctx the parse tree
	 */
	void exitApply(HeheParser.ApplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HeheParser#applyNotTerminal}.
	 * @param ctx the parse tree
	 */
	void enterApplyNotTerminal(HeheParser.ApplyNotTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HeheParser#applyNotTerminal}.
	 * @param ctx the parse tree
	 */
	void exitApplyNotTerminal(HeheParser.ApplyNotTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HeheParser#applyTerminal}.
	 * @param ctx the parse tree
	 */
	void enterApplyTerminal(HeheParser.ApplyTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HeheParser#applyTerminal}.
	 * @param ctx the parse tree
	 */
	void exitApplyTerminal(HeheParser.ApplyTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HeheParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(HeheParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HeheParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(HeheParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HeheParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(HeheParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HeheParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(HeheParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HeheParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(HeheParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HeheParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(HeheParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HeheParser#otherArgs}.
	 * @param ctx the parse tree
	 */
	void enterOtherArgs(HeheParser.OtherArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HeheParser#otherArgs}.
	 * @param ctx the parse tree
	 */
	void exitOtherArgs(HeheParser.OtherArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HeheParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(HeheParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HeheParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(HeheParser.ReturnContext ctx);
}
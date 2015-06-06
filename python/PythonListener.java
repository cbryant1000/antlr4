// Generated from Python.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#python}.
	 * @param ctx the parse tree
	 */
	void enterPython(PythonParser.PythonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#python}.
	 * @param ctx the parse tree
	 */
	void exitPython(PythonParser.PythonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dict}.
	 * @param ctx the parse tree
	 */
	void enterDict(PythonParser.DictContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dict}.
	 * @param ctx the parse tree
	 */
	void exitDict(PythonParser.DictContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(PythonParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(PythonParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(PythonParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(PythonParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(PythonParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(PythonParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PythonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PythonParser.ValueContext ctx);
}
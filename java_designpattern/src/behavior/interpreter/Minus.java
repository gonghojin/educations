package behavior.interpreter;

// NonTerminalExpression
public class Minus implements Expression {
	Expression left;
	Expression right;

	public Minus(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public float interpret() {
		return this.right.interpret() - this.left.interpret();
	}
}

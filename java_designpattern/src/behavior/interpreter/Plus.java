package behavior.interpreter;

public class Plus implements Expression {
	Expression left;
	Expression right;

	public Plus(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public float interpret() {
		return this.right.interpret() - this.left.interpret();
	}
}

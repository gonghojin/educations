package behavior.interpreter;

// TerminalExpression
public class Number implements Expression {
	private float number;

	public Number(float number) {
		this.number = number;
	}

	@Override
	public float interpret() {
		return this.number;
	}
}

package behavior.interpreter;

import java.util.Stack;

public class Evaluator {
	public float evaluate(String expression) {
		Stack<Expression> stack = new Stack<>();
		float result = 0;

		for (String token : expression.split(" ")) {
			if (isOperator(token)) {
				Expression exp = null;

				if (token.equals("+")) {
					exp = stack.push(new Plus(stack.pop(), stack.pop()));
				} else if (token.equals("-")) {
					exp = stack.push(new Minus(stack.pop(), stack.pop()));
				}

				if (exp != null) {
					result = exp.interpret();
					stack.push(new Number(result));
				}
			}

			if (isNumber(token)) {
				stack.push(new Number(Float.parseFloat(token)));
			}
		}

		return result;
	}

	private boolean isNumber(String token) {
		try {
			Float.parseFloat(token);

			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private boolean isOperator(String token) {
		return (token.equals("+") || token.equals("-") ? true : false);
	}


}

package behavior.interpreter;

public class Client {
	public static void main(String[] args) {
		Evaluator evaluator = new Evaluator();
		System.out.println(evaluator.evaluate("2 3 +")); //3 + 2
		System.out.println(evaluator.evaluate("4 3 -")); //4 - 3
		System.out.println(evaluator.evaluate("4 3 - 2 +")); //2+(4-3)
	}
}

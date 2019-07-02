package behavior.chain;

public class Client {
	public static void main(String[] args) {
		Boundary voltage = new NormalVoltage(230, 210);
		Boundary warn = new WarningVoltage(240, 200);
		Boundary fault = new FaultVoltage(Integer.MAX_VALUE, Integer.MIN_VALUE);

		// normal -> warn -> fault
		voltage.setNested(warn);
		warn.setNested(fault);

		voltage.action(220);
		voltage.action(235);
		voltage.action(245);
	}

}

package behavior.chain;

public class WarningVoltage extends Boundary {

	public WarningVoltage(int upper, int lower) {
		super(upper, lower);
	}

	@Override
	protected void individualAction() {
		System.out.println("warn operation");
	}
}

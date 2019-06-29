package behavior.chain;

public class NormalVoltage extends Boundary {

	public NormalVoltage(int upper, int lower) {
		super(upper, lower);
	}

	@Override
	protected void individualAction() {
		System.out.println("normal operation");
	}
}

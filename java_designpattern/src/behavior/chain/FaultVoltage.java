package behavior.chain;

public class FaultVoltage extends Boundary {

	public FaultVoltage(int upper, int lower) {
		super(upper, lower);
	}

	@Override
	protected void individualAction() {
		System.out.println("fault operation");
	}
}

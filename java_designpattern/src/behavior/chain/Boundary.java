package behavior.chain;

public abstract class Boundary {
	protected int upper;
	protected int lower;

	protected Boundary nested = null;

	public Boundary(int upper, int lower) {
		this.upper = upper;
		this.lower = lower;
	}

	public void setNested(Boundary nested) {
		this.nested = nested;
	}

	public void action(int value) {
		/*
			가능하면 본인이 처리
			불가능하면 다음 객체에게 처리 요청
			본인이 마지막이면 본인 코드로 처리
		 */
		if (isInBoundary(value)) {
			individualAction();
		} else if(nested != null) {
			nested.action(value);
		}
	}

	protected abstract void individualAction();

	private boolean isInBoundary(int value) {
		if (value >= lower && value <= upper) {
			return true;
		}

		return false;
	}

}

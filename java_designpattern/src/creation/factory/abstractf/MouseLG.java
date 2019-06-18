package creation.factory.abstractf;

public class MouseLG implements Mouse {
	public MouseLG() {
		System.out.println("LG 마우스 생성자");
	}

	@Override
	public String getName() {
		return "LG Mouse";
	}
}

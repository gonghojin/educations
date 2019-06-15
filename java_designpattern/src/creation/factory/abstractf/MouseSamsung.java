package creation.factory.abstractf;

public class MouseSamsung implements Mouse {
	public MouseSamsung() {
		System.out.println("Samsung 마우스 생성자");
	}

	@Override
	public String getName() {
		return "Samsung Mouse";
	}
}

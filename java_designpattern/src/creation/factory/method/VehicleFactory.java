package creation.factory.method;

// Factory 자체를 추상화하여 여러 스타일(car or truck factory)의 concrete class를 구현
public abstract class VehicleFactory {
	// 객체 생성을 concrete 객체에 위임
	protected abstract Vehicle createVehicle(String size);

	public Vehicle orderVehicle(String size, String color) {
		Vehicle vehicle = createVehicle(size);
		vehicle.testVehicle();
		vehicle.setColor(color);

		return vehicle;
	}
}

abstract class Vehicle {
	String color;

	// abstract Vehicle class
	public void testVehicle() {
		// implementation here
	}

	public void setColor(String color) {
		this.color = color;
	}

}


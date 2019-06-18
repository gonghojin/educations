package creation.factory.simple;

public class Client {

	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();
		Vehicle bike = vehicleFactory.create(VehicleType.Bike);
		Vehicle car = vehicleFactory.create(VehicleType.Car);
		Vehicle truck = vehicleFactory.create(VehicleType.Truck);

		bike.doSomething();
        car.doSomething();
		truck.doSomething();
	}

}

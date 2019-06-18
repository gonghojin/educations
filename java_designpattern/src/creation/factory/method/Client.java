package creation.factory.method;

public class Client {

    public static void main(String s[]) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.orderVehicle("large", "red");
        System.out.println("car color : " + car.color);

        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.orderVehicle("large", "blue");
        System.out.println("truck color : " + truck.color);

        // 익명 구현체
        VehicleFactory bikeFactory = new VehicleFactory() {
            @Override
            protected Vehicle createVehicle(String size) {
                if (size.equals("small")) {

                    return new MountainBike();
                } else if (size.equals("large")) {
                    return new CityBike();
                } else {
                    return null;
                }
            }
        };

        Vehicle bike = bikeFactory.orderVehicle("large", "green");
        System.out.println("bike color : " + bike.color );
    }
}


// 익명 구현체로 factory concrete 만들어 보기
abstract class Bike extends Vehicle {

}

class MountainBike extends Bike {

}

class CityBike extends Bike {

}
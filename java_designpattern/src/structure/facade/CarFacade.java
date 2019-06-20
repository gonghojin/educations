package structure.facade;

// Facade
public class CarFacade {
    private Car car;

    public CarFacade(Car car) {
        this.car = car;
    }

    public void drive() {
        car.enginStart();
        car.doorLock();
        car.wheelsRoll();
    }

    public void stop() {
        car.enginStop();
        car.doorLock();
        car.wheelsStop();
    }

    public void park() {
        car.enginStop();
        car.doorLock();
        car.wheelsStop();
    }
}

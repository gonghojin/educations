package structure.facade;

public class Client {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade(new Car());

        /*
            자동차 머신의 기계적 처리에 대해 운전자는 알 필요가 없음(캡슐화를 통해)
         */
        System.out.println("운전");
        carFacade.drive();

        System.out.println("정지");
        carFacade.stop();

        System.out.println("주차");
        carFacade.park();
    }
}

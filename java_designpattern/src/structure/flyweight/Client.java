package structure.flyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        // Tag - 신규 셍상히거 pool 저장
        Flyweight f1 = factory.getFlyweight("A");
        System.out.println(f1);

        Flyweight f2 = factory.getFlyweight("B");
        System.out.println(f2);

        Flyweight f3 = factory.getFlyweight("C");
        System.out.println(f3);
        // -End

        // pool에서 가져옴(sharedObject)
        Flyweight f4 = factory.getFlyweight("B");
        System.out.println(f4);

        Flyweight f5 = factory.getFlyweight("A");
        System.out.println(f5);
    }
}

package structure.proxy;

public class Client {
    public static void main(String[] args) {
        // 직접 호출하지 않고 프록시를 호출
        IService proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
}

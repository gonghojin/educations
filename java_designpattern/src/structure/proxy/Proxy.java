package structure.proxy;

// ProxySubject
public class Proxy implements IService {
    IService realService;

    @Override
    public String runSomething() {
        System.out.println("호출에 대한 흐름 제어가 주목적, 변환 결과를 그대로 전달");

        realService = new Service();

        // Proxy가 원 객체를 호출하고 호출자에게 응답
        return realService.runSomething();
    }
}

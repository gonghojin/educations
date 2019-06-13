package creation.singleton.simple;

public class Singleton {
    private static Singleton instance;

    // 생성자 호출 차단
    private Singleton() {
        System.out.println("Singleton is Instantiated.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void doSomething() {
        System.out.println("Something is Done.");
    }
}


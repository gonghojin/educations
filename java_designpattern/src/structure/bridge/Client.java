package structure.bridge;

public class Client {
    public static void main(String[] args) {
        new Warrior(new Sword()).handle();
        System.out.println();

        new Warrior(new Bow()).handle();
        System.out.println();

        new Smith(new Sword()).handle();
        System.out.println();

        new Smith(new Bow()).handle();
    }
}

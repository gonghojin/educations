package creation.factory.abstractf;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "keyboard=" + keyboard.getName() +
                ", mouse=" + mouse.getName() +
                '}';
    }
}

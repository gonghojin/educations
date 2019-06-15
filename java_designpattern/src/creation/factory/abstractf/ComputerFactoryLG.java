package creation.factory.abstractf;

public class ComputerFactoryLG implements ComputerFactory {

    @Override
    public Keyboard createKeyBoard() {
        return new KeyboardLG();
    }

    @Override
    public Mouse createMouse() {
        return new MouseLG();
    }
}

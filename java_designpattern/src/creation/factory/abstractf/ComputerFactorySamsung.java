package creation.factory.abstractf;

public class ComputerFactorySamsung implements ComputerFactory {
    @Override
    public Keyboard createKeyBoard() {
        return new KeyboardSamsung();
    }

    @Override
    public Mouse createMouse() {
        return new MouseSamsung();
    }

}


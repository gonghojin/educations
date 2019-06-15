package creation.factory.abstractf;

public class FactoryOfComputerFactory {
    public Computer createComputer(String type) {
        ComputerFactory computerFactory = null;

        switch (type) {
            case "LG":
                computerFactory = new ComputerFactoryLG();
                break;
            case "Samsung":
                computerFactory = new ComputerFactorySamsung();
                break;
        }

        Keyboard keyboard = computerFactory.createKeyBoard();
        Mouse mouse = computerFactory.createMouse();

        return new Computer(keyboard, mouse);
    }
}


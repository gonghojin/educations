package creation.factory.abstractf;

public class Client {
	public static void main(String[] args) {
		FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
		Computer lgComputer = factoryOfComputerFactory.createComputer("LG");

		System.out.println(lgComputer);
	}

}

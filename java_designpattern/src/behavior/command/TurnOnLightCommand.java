package behavior.command;

// ConcreteCommand
public class TurnOnLightCommand implements Command {
	private Light light; // Receiver

	public TurnOnLightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn(); // receiver.action()
	}
}

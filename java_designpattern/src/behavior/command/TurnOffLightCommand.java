package behavior.command;

// ConcreteCommand
public class TurnOffLightCommand implements Command {
	private Light light; // Receiver

	public TurnOffLightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff(); // receiver.action()
	}
}

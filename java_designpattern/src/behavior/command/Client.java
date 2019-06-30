package behavior.command;

public class Client {
	public static void main(String[] args) {
		Light light = new Light();
		Command switchUp = new TurnOnLightCommand(light);
		Command switchDown = new TurnOffLightCommand(light);

		Switch s = new Switch(switchUp, switchDown);
		s.flipUp();
		s.flipOff();
	}
}

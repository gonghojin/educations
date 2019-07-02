package behavior.command;

public class Client {
	public static void main(String[] args) {
		// 1. Receiver 생성
		Light light = new Light();

		// 2. Command 생성하고, Receiver 등록
		Command switchUp = new TurnOnLightCommand(light);
		Command switchDown = new TurnOffLightCommand(light);

		// 3. Invokver 생성하고, Command 등록
		Switch s = new Switch(switchUp, switchDown);

		// 4. Invoker를 통해 Command execute
		s.flipUp();
		s.flipOff();
	}
}

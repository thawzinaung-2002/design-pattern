package behavioral.command;

public class Demo {

	public static void main(String[] args) {
		
		RemoteControl control = new RemoteControl();
		Light light = new Light();
		var lightOn = new LightOnCommand(light);
		var lightOff = new LightOffCommand(light);
		
		control.setCommand(lightOn);
		control.pressButton();
		
		control.setCommand(lightOff);
		control.pressButton();
		
	}
	
}

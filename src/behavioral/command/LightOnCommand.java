package behavioral.command;

public class LightOnCommand implements Command{
	
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchOn();
		System.out.println("Light is on");
	}

}

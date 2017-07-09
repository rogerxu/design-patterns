package demo.designpatterns.command;

/**
 * Created by rogerxu on 2017/7/9.
 */
public class LightOnCommand implements Command {
	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}
}

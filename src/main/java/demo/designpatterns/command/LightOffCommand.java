package demo.designpatterns.command;

/**
 * Created by rogerxu on 2017/7/9.
 */
public class LightOffCommand implements Command {
	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff();
	}
}

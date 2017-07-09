package demo.designpatterns.command;

/**
 * Created by rogerxu on 2017/7/9.
 */
public class FanOffCommand implements Command {
	private Fan fan;

	public FanOffCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.stop();
	}
}

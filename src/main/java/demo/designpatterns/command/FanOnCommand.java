package demo.designpatterns.command;

/**
 * Created by rogerxu on 2017/7/9.
 */
public class FanOnCommand implements Command {
	private Fan fan;

	public FanOnCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.start();
	}
}

package demo.designpatterns.command;

/**
 * Created by rogerxu on 2017/7/9.
 */
public class Switch {
	private Command upCommand;
	private Command downCommand;

	public Switch(Command up, Command down) {
		upCommand = up;
		downCommand = down;
	}

	public void flipUp() {
		upCommand.execute();
	}

	public void flipDown() {
		downCommand.execute();
	}
}

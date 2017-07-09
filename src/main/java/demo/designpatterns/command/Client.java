package demo.designpatterns.command;

/**
 * Created by rogerxu on 2017/7/9.
 */
public class Client {
	public static void main(String[] args) {
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);

		Switch switcher = new Switch(lightOnCommand, lightOffCommand);
		switcher.flipUp();
		switcher.flipDown();

		Fan fan = new Fan();
		FanOnCommand fanOnCommand = new FanOnCommand(fan);
		FanOffCommand fanOffCommand = new FanOffCommand(fan);

		switcher = new Switch(fanOnCommand, fanOffCommand);
		switcher.flipUp();
		switcher.flipDown();
	}
}

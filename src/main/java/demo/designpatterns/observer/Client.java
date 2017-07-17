package demo.designpatterns.observer;

/**
 * Created by rogerxu on 2017/7/17.
 */
public class Client {
	public static void main(String[] args) {
		SensorSystem system = new SensorSystem();
		system.register(new Gate());
		system.register(new Lighting());
		system.register(new Surveillance());

		system.soundTheAlarm();
	}
}

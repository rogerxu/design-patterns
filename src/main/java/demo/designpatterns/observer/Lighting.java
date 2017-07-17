package demo.designpatterns.observer;

/**
 * Created by rogerxu on 2017/7/17.
 */
public class Lighting implements AlarmListener {
	@Override
	public void alarm() {
		System.out.println("Auto turn on the light");
	}
}

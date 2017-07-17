package demo.designpatterns.observer;

/**
 * Created by rogerxu on 2017/7/17.
 */
public class Gate implements AlarmListener {
	@Override
	public void alarm() {
		System.out.println("Auto close the door");
	}
}

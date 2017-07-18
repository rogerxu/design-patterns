package demo.designpatterns.state;

/**
 * Created by rogerxu on 2017/7/18.
 */
public class Car {
	private State current;

	public Car() {
		current = new Off();
		System.out.println("New car is created, it is Off state");
	}

	public void setState(State state) {
		current = state;
	}

	public void pull() {
		current.pull(this);
	}
}

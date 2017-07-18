package demo.designpatterns.state;

/**
 * Created by rogerxu on 2017/7/18.
 */
public abstract class State {
	public void pull(Car wrapper) {
		wrapper.setState(new Off());
		System.out.println("turning off");
	}
}

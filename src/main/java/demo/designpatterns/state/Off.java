package demo.designpatterns.state;

/**
 * Created by rogerxu on 2017/7/18.
 */
public class Off extends State {
	@Override
	public void pull(Car wrapper) {
		wrapper.setState(new Low());
		System.out.println("low state");
	}
}

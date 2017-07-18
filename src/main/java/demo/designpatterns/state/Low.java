package demo.designpatterns.state;

/**
 * Created by rogerxu on 2017/7/18.
 */
public class Low extends State {
	@Override
	public void pull(Car wrapper) {
		wrapper.setState(new Medium());
		System.out.println("medium state");
	}
}

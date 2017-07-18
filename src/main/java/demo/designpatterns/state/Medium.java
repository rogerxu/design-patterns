package demo.designpatterns.state;

/**
 * Created by rogerxu on 2017/7/18.
 */
public class Medium extends State {
	@Override
	public void pull(Car wrapper) {
		wrapper.setState(new High());
		System.out.println("high state");
	}
}

package demo.designpatterns.factorymethod;

/**
 * Created by rogerxu on 2017/6/25.
 */
public class Nokia implements Mobile {
	@Override
	public void call() {
		System.out.println("Nokia mobile");
	}
}

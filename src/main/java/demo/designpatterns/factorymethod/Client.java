package demo.designpatterns.factorymethod;

/**
 * Created by rogerxu on 2017/6/25.
 */
public class Client {
	public static void main(String[] args) {
		MobileFactory mobileFactory;
		Mobile mobile;

		mobileFactory = new NokiaFactory();
		mobile = mobileFactory.produceMobile();
		mobile.call();

		mobileFactory = new MotorolaFactory();
		mobile = mobileFactory.produceMobile();
		mobile.call();
	}
}

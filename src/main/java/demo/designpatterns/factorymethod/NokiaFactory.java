package demo.designpatterns.factorymethod;

/**
 * Created by rogerxu on 2017/6/25.
 */
public class NokiaFactory implements MobileFactory {
	@Override
	public Mobile produceMobile() {
		System.out.println("Nokia factory");
		return new Nokia();
	}
}

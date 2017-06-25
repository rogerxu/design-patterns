package demo.designpatterns.factorymethod;

/**
 * Created by rogerxu on 2017/6/25.
 */
public class MotorolaFactory implements MobileFactory {

	@Override
	public Mobile produceMobile() {
		System.out.println("Motorola factory");
		return new Motorola();
	}
}

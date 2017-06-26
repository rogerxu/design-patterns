package demo.designpatterns.abstractfactory;

/**
 * Created by rogerxu on 2017/6/26.
 */
public class IBM extends ComputerFactory {
	IBM() {
		cpu = new Intel();
		hd = new WestDigit();
		mb = new MSIB250M();
	}
}

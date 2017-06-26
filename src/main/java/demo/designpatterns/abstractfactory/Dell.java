package demo.designpatterns.abstractfactory;

/**
 * Created by rogerxu on 2017/6/26.
 */
public class Dell extends ComputerFactory {
	Dell() {
		cpu = new AMD();
		hd = new Seagate();
		mb = new MSIB350M();
	}
}

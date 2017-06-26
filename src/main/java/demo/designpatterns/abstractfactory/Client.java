package demo.designpatterns.abstractfactory;

/**
 * Created by rogerxu on 2017/6/26.
 */
public class Client {
	public static void main(String[] args) {
		ComputerFactory ibm = new IBM();
		ibm.show();

		ComputerFactory dell = new Dell();
		dell.show();
	}
}

package demo.designpatterns.state;

/**
 * Created by rogerxu on 2017/7/18.
 */
public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		car.pull();
		car.pull();
		car.pull();
		car.pull();
	}
}

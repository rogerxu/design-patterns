package demo.designpatterns.mediator;

/**
 * Created by rogerxu on 2017/7/13.
 */
public class Client {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		new Producer(mediator).start();
		new Producer(mediator).start();
		new Consumer(mediator).start();
		new Consumer(mediator).start();
		new Consumer(mediator).start();
		new Consumer(mediator).start();
	}
}

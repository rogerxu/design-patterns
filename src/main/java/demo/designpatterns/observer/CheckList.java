package demo.designpatterns.observer;

/**
 * Created by rogerxu on 2017/7/17.
 */
public class CheckList {
	public void byTheNumbers() {
		localize();
		isolate();
		identify();
	}

	protected void localize() {
		System.out.println("Set up boundary");
	}

	protected void isolate() {
		System.out.println("Isolation");
	}

	protected void identify() {
		System.out.println("Identify the thing is a cat");
	}
}

package demo.designpatterns.observer;

/**
 * Created by rogerxu on 2017/7/17.
 */
public class Surveillance extends CheckList implements AlarmListener {
	@Override
	public void alarm() {
		System.out.println("Auto surveillance system launched:");
		byTheNumbers();
	}

	@Override
	protected void isolate() {
		System.out.println("Camera targeted");
	}
}

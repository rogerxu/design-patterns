package demo.designpatterns.prototype;

/**
 * Created by rogerxu on 2017/6/29.
 */
public class Rectangle implements Prototype, Command {

	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException ex) {
			System.err.println("Clone is not supported");
		}
	}

	@Override
	public String getName() {
		return "Retangle";
	}

	@Override
	public void draw() {
		System.out.println("Draw a rectangle");
	}
}

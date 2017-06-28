package demo.designpatterns.prototype;

/**
 * Created by rogerxu on 2017/6/29.
 */
public class Circle implements Prototype, Command {
	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException ex) {
			System.err.println("Clone is not supported");
		}

		return clone;
	}

	@Override
	public String getName() {
		return "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Draw a circle");
	}
}

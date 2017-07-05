package demo.designpatterns.flyweight;

/**
 * Created by rogerxu on 2017/7/5.
 */
public class Client {
	public static void main(String[] args) {
		ImageFactory factory = new ImageFactory();

		MyImage image = factory.getMyImage("a");
		image.draw();

		image = factory.getMyImage("b");
		image.draw();

		image = factory.getMyImage("c");
		image.draw();
	}
}

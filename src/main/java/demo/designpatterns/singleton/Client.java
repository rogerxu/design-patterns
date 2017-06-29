package demo.designpatterns.singleton;

/**
 * Created by rogerxu on 2017/6/29.
 */
public class Client {
	public static void main(String[] args) {
		Logger.init();

		Logger logger = Logger.getLogger();
	}
}

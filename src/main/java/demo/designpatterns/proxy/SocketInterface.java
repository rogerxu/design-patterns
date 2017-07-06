package demo.designpatterns.proxy;

/**
 * Created by rogerxu on 2017/7/6.
 */
public interface SocketInterface {
	String readLine();
	void writeLine(String str);
	void dispose();
}

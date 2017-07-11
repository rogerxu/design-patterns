package demo.designpatterns.iterator;

/**
 * Created by rogerxu on 2017/7/11.
 */
public class Client {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.addChannel(new Channel("CCTV"));
		tv.addChannel(new Channel("STV"));
		tv.addChannel(new Channel("BTV"));

		TVControl control = new TVControl(tv);
		Channel channel;
		while ((channel = control.next()) != null) {
			System.out.println(channel.getName());
		}
	}
}

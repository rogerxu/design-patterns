package demo.designpatterns.proxy;

/**
 * Created by rogerxu on 2017/7/6.
 */
public class ServerThread extends Thread {
	private SocketInterface serverSocket;
	String str;

	@Override
	public void run() {
		serverSocket = new SocketProxy("127.0.0.1", 8189, true);
		System.out.println("thread begin");

		while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}

			str = serverSocket.readLine();
			if (str.length() > 0 ) {
				if (str.equals("quit")) {
					break;
				}

				str = "(server echo)" + str;
				serverSocket.writeLine(str);

				if (str.equals("quit")) {
					str = "";
				}
			}
		}

		serverSocket.dispose();
		System.out.println("thread end");
	}
}

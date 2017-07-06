package demo.designpatterns.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by rogerxu on 2017/7/6.
 */
public class Client {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		Thread st = new Thread(new ServerThread());
		st.start();

		SocketInterface socket = new SocketProxy("127.0.0.1", 8189, false);
		String str = null;
		boolean skip = true;

		while (true) {
			if (skip) {
				skip = !skip;
			} else {
				str = socket.readLine();
				System.out.println("Receive - " + str);
				if (str.equals("quit")) {
					break;
				}
			}

			System.out.println("Send ---- ");

			try {
				str = in.readLine();
			} catch (IOException e) {
				System.out.println(e);
			}
			socket.writeLine(str);

			if (str.equals("quit")) {
				break;
			}
		}

		socket.dispose();
	}
}

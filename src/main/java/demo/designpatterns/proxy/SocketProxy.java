package demo.designpatterns.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by rogerxu on 2017/7/6.
 */
public class SocketProxy implements SocketInterface {
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;

	public SocketProxy(String host, int port, boolean wait) {
		try {
			if (wait) {
				ServerSocket server = new ServerSocket(port);
				socket = server.accept();
			} else {
				socket = new Socket(host, port);
			}

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String readLine() {
		String str = "";

		try {
			str = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return str;
	}

	@Override
	public void writeLine(String str) {
		out.println(str);
	}

	@Override
	public void dispose() {
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

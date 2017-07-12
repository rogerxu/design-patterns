package demo.designpatterns.mediator;

import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/7/13.
 */
public class Consumer extends Thread {
	private Mediator mediator;
	private int id;
	private static int num = 1;

	public Consumer(Mediator mediator) {
		this.mediator = mediator;
		id = num++;
	}

	@Override
	public void run() {
		while (true) {
			System.out.print(MessageFormat.format("c{0}-{1}  ", id, mediator.receiveMessage()));
		}
	}
}

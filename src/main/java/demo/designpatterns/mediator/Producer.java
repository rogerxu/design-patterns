package demo.designpatterns.mediator;

import java.text.MessageFormat;
import java.util.Random;

/**
 * Created by rogerxu on 2017/7/13.
 */
public class Producer extends Thread {
	private Mediator mediator;
	private int id;
	private static int num = 1;

	public Producer(Mediator mediator) {
		this.mediator = mediator;
		id = num++;
	}

	@Override
	public void run() {
		int num;

		Random rand = new Random();
		while (true) {
			mediator.storeMessage(num = rand.nextInt(100));
			System.out.print(MessageFormat.format("p{0}-{1}  ", id, num));
		}
	}
}

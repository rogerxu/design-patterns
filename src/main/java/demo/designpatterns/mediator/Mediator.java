package demo.designpatterns.mediator;

/**
 * Created by rogerxu on 2017/7/13.
 */
public class Mediator {
	private int number;
	private boolean isSlotFull = false;

	public synchronized void storeMessage(int num) {
		while (isSlotFull == true) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}

		isSlotFull = true;
		number = num;
		notifyAll();
	}

	public synchronized int receiveMessage() {
		while (isSlotFull == false) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}

		isSlotFull = false;
		notifyAll();
		return  number;
	}
}

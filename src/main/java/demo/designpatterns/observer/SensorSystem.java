package demo.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rogerxu on 2017/7/17.
 */
public class SensorSystem {
	private List<AlarmListener> listeners = new ArrayList<AlarmListener>();

	public void register(AlarmListener listener) {
		listeners.add(listener);
	}

	public void soundTheAlarm() {
		System.out.println("Sensor system detected incident");

		for (AlarmListener listener : listeners) {
			listener.alarm();
		}
	}
}

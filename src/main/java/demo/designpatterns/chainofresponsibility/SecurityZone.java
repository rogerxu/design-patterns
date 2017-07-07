package demo.designpatterns.chainofresponsibility;

import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/7/7.
 */
public abstract class SecurityZone {
	private SecurityZone parent;

	public String name;

	public SecurityZone(String name) {
		this.name = name;
	}

	public SecurityZone getParent() {
		return parent;
	}

	public void setParent(SecurityZone parent) {
		this.parent = parent;
	}

	void notify(int measurement, Sensor sensor) {
		if (!handleNotification(measurement, sensor) && parent != null) {
			parent.notify(measurement, sensor);
		}
	}

	abstract boolean handleNotification(int measurement, Sensor sensor);

	void fireAlarm(SecurityZone zone, Sensor sensor) {
		System.out.println(MessageFormat.format("{0} {1} water is on", this.name, sensor.position));
		if (parent != null) {
			parent.fireAlarm(zone, sensor);
		}
	}
}

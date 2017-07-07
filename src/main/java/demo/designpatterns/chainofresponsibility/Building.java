package demo.designpatterns.chainofresponsibility;

import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/7/7.
 */
public class Building extends SecurityZone {
	public Building(String name) {
		super(name);
	}

	@Override
	boolean handleNotification(int measurement, Sensor sensor) {
		return false;
	}

	@Override
	void fireAlarm(SecurityZone zone, Sensor sensor) {
		if (zone instanceof Area) {
			System.out.println(MessageFormat.format("{0} building is on fire", this.name));

			if (getParent() != null) {
				getParent().fireAlarm(zone, sensor);
			}

			return;
		}

		super.fireAlarm(zone, sensor);
	}
}

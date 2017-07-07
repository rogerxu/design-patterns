package demo.designpatterns.chainofresponsibility;

import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/7/7.
 */
public class Warehouse extends SecurityZone {
	public Warehouse(String position) {
		super(position);
	}

	@Override
	boolean handleNotification(int measurement, Sensor sensor) {
		return false;
	}

	@Override
	void fireAlarm(SecurityZone zone, Sensor sensor) {
		if (zone instanceof Area) {
			System.out.println(MessageFormat.format("Security staff please check {0} {1}", this.name, zone.name));

			if (getParent() != null) {
				getParent().fireAlarm(zone, sensor);
			}

			return;
		}

		super.fireAlarm(zone, sensor);
	}
}

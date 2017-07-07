package demo.designpatterns.chainofresponsibility;

/**
 * Created by rogerxu on 2017/7/7.
 */
public class Area extends SecurityZone {
	public Area(String position) {
		super(position);
	}

	@Override
	boolean handleNotification(int measurement, Sensor sensor) {
		if (sensor instanceof TemperatureSensor) {
			if (measurement > 150) {
				fireAlarm(this, sensor);
				return true;
			}
		}

		return false;
	}
}

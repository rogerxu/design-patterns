package demo.designpatterns.chainofresponsibility;

/**
 * Created by rogerxu on 2017/7/7.
 */
public class Client {
	public static void main(String[] args) {
		Area area = new Area("Manager office");
		Warehouse warehouse = new Warehouse("Warehouse B");
		TemperatureSensor sensorAtCorner = new TemperatureSensor("Right Corner");
		area.setParent(warehouse);
		Building building = new Building("#2");
		warehouse.setParent(building);
		area.notify(200, sensorAtCorner);
	}
}

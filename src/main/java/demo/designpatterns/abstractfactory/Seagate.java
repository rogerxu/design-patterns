package demo.designpatterns.abstractfactory;

/**
 * Created by rogerxu on 2017/6/26.
 */
public class Seagate implements HardDisk {
	@Override
	public String getSize() {
		return "Seagate Backup Plus 4T";
	}
}

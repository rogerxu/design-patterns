package demo.designpatterns.builder;

/**
 * Created by rogerxu on 2017/6/27.
 */
public class Director {
	public House buildHouse(boolean hasBackyard) {
		if (hasBackyard) {
			return new SingleFamilyHome();
		} else {
			return new Apartment();
		}
	}
}

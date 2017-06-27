package demo.designpatterns.builder;

/**
 * Created by rogerxu on 2017/6/27.
 */
public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		House house = director.buildHouse(false);
		System.out.println(house.description());
	}
}

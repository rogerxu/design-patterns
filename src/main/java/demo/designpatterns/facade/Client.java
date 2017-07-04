package demo.designpatterns.facade;

/**
 * Created by rogerxu on 2017/7/4.
 */
public class Client {
	public static void main(String[] args) {
		TeaMaker teaMaker = new TeaMaker();
		TeaCup teaCup = teaMaker.makeTea();
	}
}

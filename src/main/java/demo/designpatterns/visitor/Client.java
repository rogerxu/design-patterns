package demo.designpatterns.visitor;

public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		Visitor visitor = new Engineer("Peter");
		car.accept(visitor);
	}
}

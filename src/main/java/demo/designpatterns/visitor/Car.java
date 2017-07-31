package demo.designpatterns.visitor;

public class Car {
	private Engine engine = new Engine();
	private Body body = new Body();
	private Wheel[] wheels = {
		new Wheel("left front"),
		new Wheel("right front")
	};

	void accept(Visitor visitor) {
		visitor.visit(this);

		engine.accept(visitor);
		body.accept(visitor);
		for (Wheel wheel : wheels) {
			wheel.accept(visitor);
		}
	}
}

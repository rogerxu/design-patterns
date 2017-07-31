package demo.designpatterns.visitor;

public class Engineer implements Visitor {
	protected String name;

	public Engineer(String name) {
		this.name = name;
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("check " + wheel.getName());
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("check engine");
	}

	@Override
	public void visit(Body body) {
		System.out.println("check body");
	}

	@Override
	public void visit(Car car) {
		System.out.println(this.name + " check car");
	}
}

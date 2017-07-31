package demo.designpatterns.visitor;

public class Wheel {
	private String name;

	Wheel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	void accept(Visitor visitor) {
		visitor.visit(this);
	}
}

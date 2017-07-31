package demo.designpatterns.visitor;

public class Engine {
	void accept(Visitor visitor) {
		visitor.visit(this);
	}
}

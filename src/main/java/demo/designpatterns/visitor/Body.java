package demo.designpatterns.visitor;

public class Body {
	void accept(Visitor visitor) {
		visitor.visit(this);
	}
}

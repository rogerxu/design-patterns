package demo.designpatterns.interpreter;

/**
 * Created by rogerxu on 2017/7/10.
 */
public class CommandNode implements Node {
	private Node node;

	@Override
	public void parse(Context context) {
		if (context.currentToken().equals("REPEAT")) {
			node = new RepeatCommandNode();
			node.parse(context);
		} else {
			node = new PrimitiveCommandNode();
			node.parse(context);
		}
	}

	@Override
	public void execute() {
		node.execute();
	}

	@Override
	public String toString() {
		return node.toString();
	}
}

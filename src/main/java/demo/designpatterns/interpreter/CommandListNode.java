package demo.designpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rogerxu on 2017/7/10.
 */
public class CommandListNode implements Node {
	private List<Node> list = new ArrayList<Node>();

	@Override
	public void parse(Context context) {
		while (true) {
			if (context.currentToken() == null) {
				System.err.println("Missing 'END'");
				break;
			} else if (context.currentToken().equals("END")) {
				context.skipToken("END");
				break;
			} else {
				Node commandNode = new CommandNode();
				commandNode.parse(context);
				list.add(commandNode);
			}
		}
	}

	@Override
	public void execute() {
		for (Node node : list) {
			node.execute();
		}
	}
}

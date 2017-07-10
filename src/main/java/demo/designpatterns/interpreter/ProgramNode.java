package demo.designpatterns.interpreter;

import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/7/10.
 */
public class ProgramNode implements Node {
	private Node commandListNode;

	@Override
	public void parse(Context context) {
		context.skipToken("PROGRAM");
		commandListNode = new CommandListNode();
		commandListNode.parse(context);
	}

	@Override
	public void execute() {
		commandListNode.execute();
	}

	@Override
	public String toString() {
		return MessageFormat.format("[PROGRAM {0}]", commandListNode);
	}
}

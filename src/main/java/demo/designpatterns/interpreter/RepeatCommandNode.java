package demo.designpatterns.interpreter;

import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/7/10.
 */
public class RepeatCommandNode implements Node {
	private int number;
	private Node commandListNode;

	@Override
	public void parse(Context context) {
		context.skipToken("REPEAT");
		number = context.currentNumber();
		context.nextToken();
		commandListNode = new CommandListNode();
		commandListNode.parse(context);
	}

	@Override
	public void execute() {
		for (int i = 0; i < number; i++) {
			commandListNode.execute();
		}
	}

	@Override
	public String toString() {
		return MessageFormat.format("[REPEAT {0} {1}]", number, commandListNode);
	}
}

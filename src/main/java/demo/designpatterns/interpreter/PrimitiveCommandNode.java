package demo.designpatterns.interpreter;

import java.util.Arrays;

/**
 * Created by rogerxu on 2017/7/10.
 */
public class PrimitiveCommandNode implements Node {
	private String name;
	private String text;

	@Override
	public void parse(Context context) {
		name = context.currentToken();
		context.skipToken(name);

		String[] words = {"PRINT", "BREAK", "LINEBREAK", "SPACE"};
		if (!Arrays.asList(words).contains(name)) {
			System.err.println("Undefined Command");
		}

		if (name.equals("PRINT")) {
			text = context.currentToken();
			context.nextToken();
		}
	}

	@Override
	public void execute() {
		switch (name) {
			case "PRINT":
				System.out.print(text);
				break;
			case "SPACE":
				System.out.print(" ");
				break;
			case "BREAK":
				System.out.println();
				break;
			case "LINEBREAK":
				System.out.println("\n-----------------------------------");
				break;
		}
	}

	@Override
	public String toString() {
		return name;
	}
}

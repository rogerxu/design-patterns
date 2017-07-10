package demo.designpatterns.interpreter;

import java.text.MessageFormat;
import java.util.StringTokenizer;

/**
 * Created by rogerxu on 2017/7/10.
 */
public class Context {
	private StringTokenizer tokenizer;
	private String currentToken;

	public Context(String text) {
		tokenizer = new StringTokenizer(text);
		nextToken();
	}

	public String nextToken() {
		if (tokenizer.hasMoreTokens()) {
			currentToken = tokenizer.nextToken();
		} else {
			currentToken = null;
		}

		return currentToken;
	}

	public String currentToken() {
		return currentToken;
	}

	public void skipToken(String token) {
		if (!token.equals(currentToken)) {
			System.err.println(MessageFormat.format("Warning: {0} is expected, but {1} is found.", token, currentToken));
		}

		nextToken();
	}

	public int currentNumber() {
		int number = 0;

		try {
			number = Integer.parseInt(currentToken);
		} catch (NumberFormatException e) {
			System.err.println("Warning: " + e);
		}

		return number;
	}
}

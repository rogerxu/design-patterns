package demo.designpatterns.interpreter;

import java.io.BufferedReader;
import java.io.StringReader;
import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/7/10.
 */
public class Client {
	public static void main(String[] args) {
		try {
			String textContent = "PROGRAM REPEAT 4 LINEBREAK PRINT justin SPACE PRINT momor LINEBREAK END END";
			BufferedReader reader = new BufferedReader(new StringReader(textContent));
			String text;
			while ((text = reader.readLine()) != null) {
            System.out.println(MessageFormat.format("text = {0}", text));

				Node node = new ProgramNode();
				node.parse(new Context(text));
				System.out.println(MessageFormat.format("node = {0}", node));

				node.execute();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

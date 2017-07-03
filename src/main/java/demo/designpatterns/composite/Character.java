package demo.designpatterns.composite;

import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/7/3.
 */
public class Character implements DocumentElement {
	int x, y;

	public Character(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println(MessageFormat.format("Draw a character at {0},{1}", x, y));
	}
}

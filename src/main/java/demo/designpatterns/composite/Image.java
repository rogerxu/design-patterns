package demo.designpatterns.composite;

import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/7/3.
 */
public class Image implements DocumentElement {
	int x, y;

	public Image(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println(MessageFormat.format("Draw an image at {0},{1}", x, y));
	}
}

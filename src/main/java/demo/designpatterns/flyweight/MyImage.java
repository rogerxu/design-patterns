package demo.designpatterns.flyweight;

import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/7/5.
 */
public class MyImage {
	String file;

	public MyImage(String file) {
		this.file = file;
	}

	public void draw() {
		System.out.println(MessageFormat.format("Draw image {0}", file));
	}
}

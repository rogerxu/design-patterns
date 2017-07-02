package demo.designpatterns.bridge;

import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/7/2.
 */
public class BMPImage extends Image {
	@Override
	public void method(String str) {
    String s1 = MessageFormat.format("{0}\nBMP Image", str);
		this.impToUse.doPaint(s1);
	}
}

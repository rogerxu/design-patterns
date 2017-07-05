package demo.designpatterns.flyweight;

import java.util.HashMap;

/**
 * Created by rogerxu on 2017/7/5.
 */
public class ImageFactory {
	private HashMap<String, MyImage> pool = new HashMap<String, MyImage>();
	public ImageFactory() {

	}

	public MyImage getMyImage(String name) {
		MyImage image = pool.get(name);

		if (image == null) {
			image = new MyImage(name);
			pool.put(name, image);
		}

		return image;
	}
}

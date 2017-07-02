package demo.designpatterns.bridge;

/**
 * Created by rogerxu on 2017/7/2.
 */
public abstract class Image {
	protected ImageImp impToUse;

	public void setImageImp(ImageImp imp) {
		impToUse = imp;
	}

	public abstract void method(String str);
}

package demo.designpatterns.bridge;

/**
 * Created by rogerxu on 2017/7/2.
 */
public class Client {
	public static void main(String[] args) {
		BMPImage bmp = new BMPImage();
		ImageImp winImp = new WinImp();
		bmp.setImageImp(winImp);
		bmp.method("BMP begin to paint");

		ImageImp unixImp = new UnixImp();
		bmp.setImageImp(unixImp);
		bmp.method("BMP begin to paint");
	}
}

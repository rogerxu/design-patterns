package demo.designpatterns.composite;

/**
 * Created by rogerxu on 2017/7/3.
 */
public class Client {
	public static void main(String[] args) {
		Page page = new Page();
		Character char1 = new Character(1, 1);
		Image img1 = new Image(2, 2);
		Column col = new Column();
		Character char2 = new Character(1, 3);
		Image img2 = new Image(2, 3);

		col.add(char2);
		col.add(img2);
		page.add(char1);
		page.add(img1);
		page.add(col);

		page.draw();
	}
}

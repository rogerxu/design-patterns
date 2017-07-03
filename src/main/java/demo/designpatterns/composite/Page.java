package demo.designpatterns.composite;

/**
 * Created by rogerxu on 2017/7/3.
 */
public class Page extends CompositeDocumentElement {
	@Override
	public void draw() {
		System.out.println("Page content:");
		super.draw();
	}
}

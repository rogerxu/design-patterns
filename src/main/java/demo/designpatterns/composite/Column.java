package demo.designpatterns.composite;

/**
 * Created by rogerxu on 2017/7/3.
 */
public class Column extends CompositeDocumentElement {
	@Override
	public void draw() {
		System.out.println("Column content:");
		super.draw();
	}
}

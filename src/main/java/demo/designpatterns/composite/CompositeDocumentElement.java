package demo.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rogerxu on 2017/7/3.
 */
public abstract class CompositeDocumentElement implements DocumentElement {
	private List<DocumentElement> items = new ArrayList<DocumentElement>();

	@Override
	public void draw() {
		for (DocumentElement element : items) {
			element.draw();
		}
	}

	public void add(DocumentElement doc) {
		items.add(doc);
	}
}

package demo.designpatterns.decorator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by rogerxu on 2017/7/3.
 */
public class CustomJButton extends JComponent {
	protected JComponent child;

	public CustomJButton(JComponent component) {
		child = component;

		this.setLayout(new BorderLayout());
		this.add(child);

		component.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				repaint();
			}
		});

		component.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				repaint();
			}

			@Override
			public void focusLost(FocusEvent e) {
				repaint();
			}
		});
	}

	public void paint(Graphics g) {
		super.paint(g);

		int height = this.getHeight();
		int width = this.getWidth();
		g.setColor(Color.red);
		g.setFont(new Font("", Font.BOLD, 2));
		g.drawLine(0, 0, width, height);
	}
}

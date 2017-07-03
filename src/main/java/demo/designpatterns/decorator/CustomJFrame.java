package demo.designpatterns.decorator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rogerxu on 2017/7/3.
 */
public class CustomJFrame extends JFrame {
	public CustomJFrame() {
		setSize(400, 200);
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(new CustomJButton(new JButton("Save")));
		setVisible(true);
	}

	public static void main(String[] args) {
		new CustomJFrame();
	}
}

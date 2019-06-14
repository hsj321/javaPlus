package exam2;

import java.awt.*;
import javax.swing.*;

public class Show {

	public static void main(String[] args) {
		ComboBox box = new ComboBox();
		ColorList list = new ColorList();
		JFrame app = new JFrame("A simple paint program");
		DrawRect paintPanel = new DrawRect();
		
		app.add(box, BorderLayout.NORTH);
		app.add(list, BorderLayout.SOUTH);
		app.add(paintPanel, BorderLayout.CENTER);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(1000, 800);
		app.setVisible(true);
	}
}

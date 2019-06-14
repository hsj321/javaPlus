package Test;

import javax.swing.JPanel;
import java.awt.Graphics;

class DrawRect extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
		g.drawRect(10, 10, 50, 50);
	}
}

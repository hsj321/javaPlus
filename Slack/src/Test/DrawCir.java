package Test;

import javax.swing.JPanel;
import java.awt.Graphics;

class DrawCir extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
		g.drawOval(10, 10, 50, 50);
	}
}
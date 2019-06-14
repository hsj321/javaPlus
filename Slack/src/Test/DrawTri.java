package Test;

import javax.swing.JPanel;
import java.awt.Graphics;

class DrawTri extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
		
		int[] x = {10, 60, 10};
		int[] y = {10, 60, 60};
		

		
		g.drawPolygon(x, y, 3);
	}
}
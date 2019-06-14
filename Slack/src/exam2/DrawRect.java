package exam2;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.JPanel;




public class DrawRect extends JPanel {
	
	
	private int pointCount = 0;
	
	private double x,y;
	double temp;
	static TwoShape[] shape = new TwoShape[3];
	
	private Point[] points = new Point[3];
	
	private ColorList list = new ColorList();
	
	public DrawRect() {
		setBackground(Color.WHITE);
		
		addMouseMotionListener( 
			new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent event) {
					//click = event.getPoint();
					repaint();
					if(pointCount < points.length) {
						if(pointCount == 0) {
							x = event.getX();
							y = event.getY();
							temp = x;
							pointCount++;
						} else {
							shape[pointCount-1] = null;
							if(pointCount == 2) 
								pointCount = 1;
							shape[pointCount] = new TwoShape((int)x, (int)y,(int)(event.getX() - x),(int)(event.getY() - y), ColorList.shapeColor,ColorList.lineSize);
							pointCount++;
							repaint();
						}
					}
				}
			}
		);
		
		addMouseListener( 
			new MouseAdapter() {
				public void mouseReleased(MouseEvent event) {
					System.out.println("tat");
					pointCount = 0;
					for(TwoShape shapes : shape) {
						shapes = null;
					}
					repaint();
				}
			}
		);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(ComboBox.i == 0) {
			for(TwoShape shapes : shape) {
				if(shapes == null)
					continue;
				shapes.FillSquare(g);
			}
		} else if(ComboBox.i == 1) {

			for(TwoShape shapes : shape) {
				if(shapes == null)
					continue;
				shapes.FillCircle(g);
			}
		}
	}
}

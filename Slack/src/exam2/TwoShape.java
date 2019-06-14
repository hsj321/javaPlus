package exam2;

import java.awt.Graphics;
import java.awt.Color;

public class TwoShape { 
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private Color mycolor;
	private int size = 0;

	
	public TwoShape(int x1, int y1, int x2, int y2, Color color, int size) { //생성자(정수 4개와 색을 입력받는다.)
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		mycolor = color;
		this.size = size;
	}
	void Circle(Graphics g) { //삼각형
		g.setColor(mycolor);
		g.drawOval(x1, y1, x2, y2);
	}
	void Square(Graphics g) { //사각형
		g.setColor(mycolor);
		g.drawRect(x1, y1, x2, y2);
	}
	
	void FillCircle(Graphics g) {
		if(size == 1) {
			g.setColor(mycolor);
			g.drawOval(x1, y1, x2, y2);
		} else { 
			g.setColor(mycolor);
			g.fillOval(x1, y1, x2, y2);
			g.setColor(Color.WHITE);
			g.fillOval(x1+size, y1+size, x2-(size*2), y2-(size*2));
		}
	}
	
	void FillSquare(Graphics g) {
		if(size == 1) {
			g.setColor(mycolor);
			g.drawRect(x1, y1, x2, y2);
		} else {
			g.setColor(mycolor);
			g.fillRect(x1, y1, x2, y2);
			g.clearRect(x1+size, y1+size, (x2-size*2), y2-(size*2));
		}
	}
}


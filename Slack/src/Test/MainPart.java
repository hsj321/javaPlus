package Test;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class MainPart {

	public static void main(String[] args) {
		
		JFrame jfla = new JFrame();
		DrawRect squ = new DrawRect();
		DrawTri tri = new DrawTri();
		DrawCir cir = new DrawCir();
			
		while(true) {
			String shape = JOptionPane.showInputDialog("모양을 입력\n1. 삼각  2. 사각  3. 원  -1. 종료");
			if(shape.equals("1")) {
				jfla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jfla.add(tri);
				jfla.setSize(300, 300);
				jfla.setVisible(true);
			} else if(shape.equals("2")) {
				jfla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jfla.add(squ);
				jfla.setSize(300, 300);
				jfla.setVisible(true);
			} else if(shape.equals("3")) {
				jfla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jfla.add(cir);
				jfla.setSize(300, 300);
				jfla.setVisible(true);
			} else if(shape.equals("-1")) {
				System.out.println("Bye\n");
				break;
			}
		}
	}

}

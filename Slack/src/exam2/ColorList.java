package exam2;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class ColorList extends JPanel {
	
	private JList colorList;
	private JList sizeList;
	static int lineSize = 1;
	static Color shapeColor = Color.BLACK;
	
	DrawRect draw = new DrawRect();
	
	private static final String[] colorName = {"Black","Yellow", "Red", "Blue"};
	private static final Color[] colors = {Color.BLACK, Color.YELLOW, Color.RED, Color.BLUE};
	private static final String[] size = {"1", "5", "10", "15", "20"};
	
	public ColorList() {
		colorList = new JList(colorName);
		colorList.setVisibleRowCount(3);
		colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(colorList));
		colorList.addListSelectionListener(
			new ListSelectionListener()
			{
				public void valueChanged(ListSelectionEvent event)
				{
					shapeColor = colors[colorList.getSelectedIndex()];
					repaint();
				}
			}	
		);
		sizeList = new JList(size);
		sizeList.setVisibleRowCount(2);
		sizeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(sizeList));
		sizeList.addListSelectionListener(
			new ListSelectionListener()
			{
				public void valueChanged(ListSelectionEvent event)
				{
					lineSize = Integer.parseInt(size[sizeList.getSelectedIndex()]);
					repaint();
				}
			}	
		);
	}
}

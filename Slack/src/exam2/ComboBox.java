package exam2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBox extends JPanel
{
	private String[] shapeName = {"rect", "oval"};
	static int i = 0;
	
	private JComboBox box;
	
	public ComboBox() {
		setLayout(new FlowLayout());
		box = new JComboBox(shapeName);
		
		box.addItemListener(
			new ItemListener()
			{
				public void itemStateChanged(ItemEvent event) {
					if(event.getStateChange() == ItemEvent.SELECTED)
						i = box.getSelectedIndex();
				}
			}
		);
		add(box);
	}
	
}

package panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ListItem extends JPanel
{
	private static final long serialVersionUID = 1L;

	ListItem(String item)
	{
		setPreferredSize(new Dimension(400, 20));
		setBackground(Color.BLUE);
		
		JLabel label = new JLabel(item);
		add(label);
	}
}

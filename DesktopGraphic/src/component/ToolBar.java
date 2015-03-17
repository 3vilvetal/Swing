package component;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar
{
	private static final long serialVersionUID = 1L;

	public ToolBar()
	{
		setLayout(new FlowLayout(0, 5, 3));
		
		JButton butNew = new JButton("", new ImageIcon("images/Icon_new.jpg"));
		JButton butNew1 = new JButton("TEXT", new ImageIcon("images/Icon_new.jpg"));
		
		add(butNew);  
		add(butNew1);
	}
}

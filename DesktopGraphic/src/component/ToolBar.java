package component;

import java.awt.FlowLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar
{
	private static final long serialVersionUID = 1L;

	public ToolBar()
	{
		setLayout(new FlowLayout(0, 5, 3));
		
		URL imageURL = ToolBar.class.getResource("Icon_new.jpg");
		
		JButton butNew = new JButton("", new ImageIcon(imageURL));
		JButton butNew1 = new JButton("TEXT", new ImageIcon(imageURL));
		
		add(butNew);  
		add(butNew1);
	}
}

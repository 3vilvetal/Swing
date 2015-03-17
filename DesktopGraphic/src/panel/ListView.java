package panel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListView extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public ListView()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(0, 20, 3));
		
		
		ListItem item1 = new ListItem("1");
		ListItem item2 = new ListItem("2");
		ListItem item3 = new ListItem("3");
		
		JScrollPane scrl = new JScrollPane(panel);
		scrl.setPreferredSize(new Dimension(300, 300));
		panel.setPreferredSize(new Dimension(200, 200));
		
		add(scrl);
		
		panel.add(item1);
		panel.add(item2);
		panel.add(item3);
	}
}

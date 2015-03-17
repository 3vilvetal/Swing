package window;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class About extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	Container content;
	
	public About() {
		content = getContentPane();
		
		setTitle("About Bug Searcher");
		setSize(600, 480);
		setLocation(400, 300);
		setResizable(false);
		
		JLabel img = new JLabel(new ImageIcon("images/About.jpg"));
		
		final JButton button = new JButton("    OK    ");
		button.addActionListener(new ActionListener()
				{
					public void actionPerformed (ActionEvent e) {
						setVisible(false);
					}
				});		

		//------------------Horizontal_1
		Box hbox1 = Box.createHorizontalBox();
		hbox1.add(Box.createGlue());
		hbox1.add(img);
		
		//	------------------Horizontal_2
		Box hbox2 = Box.createHorizontalBox();
		hbox2.add(Box.createHorizontalStrut(200));
		hbox2.add(Box.createGlue());
		hbox2.add(button);	
		
		//------------------Vertical		
		Box vbox = Box.createVerticalBox();
		vbox.add(hbox1);
		vbox.add(Box.createVerticalStrut(5));
		vbox.add(hbox2);
		
		JPanel panel = new JPanel();
		panel.add(vbox);
		
		content.add(panel);
		
		Dimension dim = this.getToolkit().getScreenSize();
		Rectangle abounds = this.getBounds();
		this.setLocation((dim.width - abounds.width) / 2,(dim.height - abounds.height) / 2);
		
		setVisible(true);
		pack();
	}
}

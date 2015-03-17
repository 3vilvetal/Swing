package panel;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SourcePanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public JTextArea area;
	public static int [][] KEYWORDS;
	
	public SourcePanel()
	{
		setBackground(Color.DARK_GRAY);
		
		JLabel image = new JLabel(new ImageIcon("image/frame_2.png"));
		JLabel label = new JLabel("Enter the source of key: ");
		area = new JTextArea(20,80);
		
		JScrollPane scroll=new JScrollPane(area);
		
		//---------------------------1
		Box hbox11=Box.createHorizontalBox();
		hbox11.add(Box.createHorizontalStrut(0));
		hbox11.add(label);	
		hbox11.add(Box.createHorizontalGlue());
		
		//---------------------------2
		Box hbox22=Box.createHorizontalBox();
		hbox22.add(Box.createHorizontalStrut(0));
		hbox22.add(scroll);
		hbox11.add(Box.createHorizontalGlue());
		
		//---------------------------3
		Box hbox33=Box.createHorizontalBox();
		hbox33.add(Box.createHorizontalStrut(0));
		hbox33.add(image);
		hbox33.add(Box.createHorizontalGlue());
		
		//--------------------------Vertical
		Box vbox11=Box.createVerticalBox();
		vbox11.add(Box.createVerticalStrut(0));
		vbox11.add(hbox11);
		vbox11.add(Box.createVerticalStrut(0));
		vbox11.add(hbox22);
		vbox11.add(Box.createVerticalStrut(0));
		vbox11.add(hbox33);
		vbox11.add(Box.createVerticalGlue());
		
		add(vbox11);
	}
}

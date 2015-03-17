package action;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.tree.DefaultMutableTreeNode;

import window.MainFrame;

public class Save extends AbstractAction
{	
	public void actionPerformed(ActionEvent arg0) 
	{
		//Dialog window
		final JFrame save=new JFrame();
		save.setTitle("Dialog window");
		save.setSize(300,150);

		Dimension dim = save.getToolkit().getScreenSize();
		Rectangle abounds = save.getBounds();
		save.setLocation((dim.width - abounds.width) / 2,(dim.height - abounds.height) / 2);
		
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		final JTextField field = new JTextField(20);
		JLabel label = new JLabel("Enter the name: ");
		
		JButton OK = new JButton("OK");
		OK.addActionListener(new ActionListener()
				{
			public void actionPerformed (ActionEvent e)
				{
					String key, source;
					key = field.getText();
					source = MainFrame.source.area.getText();
					
					try
					{				
						//----- take from open
						PrintWriter SAVE = new PrintWriter(new FileWriter("Keys/" + key + ".java"));
						SAVE.println(source);
						SAVE.close();	
					}
					catch (IOException exception)
					{
						exception.printStackTrace();
					}
					
					DefaultMutableTreeNode node=new DefaultMutableTreeNode(key + ".java");
					MainFrame.source_tools.top.add(node);	
					MainFrame.source_tools.tree.updateUI();
					MainFrame.source_tools.scrl.updateUI();
					MainFrame.source_tools.updateUI();
					
					save.setVisible(false);
					System.out.println("Ok");
				}
		});
		
		JButton Cancel=new JButton("Cancel");
		Cancel.addActionListener(new ActionListener()
				{
			public void actionPerformed (ActionEvent e)
				{
				    save.setVisible(false);
					System.out.println("Cancel");
				}
		});
		
		//---------------------------1
		Box hbox11=Box.createHorizontalBox();
		hbox11.add(Box.createHorizontalStrut(0));
		hbox11.add(label);	
		hbox11.add(Box.createHorizontalStrut(10));
		hbox11.add(field);	
		hbox11.add(Box.createHorizontalGlue());
		
		//---------------------------2
		Box hbox2=Box.createHorizontalBox();
		hbox2.add(Box.createHorizontalGlue());
		hbox2.add(OK);	
		hbox2.add(Box.createHorizontalStrut(10));
		hbox2.add(Cancel);	
		
		//--------------------------Vertical
		Box vbox11=Box.createVerticalBox();
		vbox11.add(Box.createVerticalStrut(15));
		vbox11.add(hbox11);
		vbox11.add(Box.createVerticalStrut(20));
		vbox11.add(hbox2);
		
		panel.add(vbox11);
		
		save.getContentPane().add(panel, BorderLayout.WEST);
		save.getContentPane().add(panel1, BorderLayout.EAST);
		
		save.setVisible(true);
		
		System.out.println("Save");
	}
}

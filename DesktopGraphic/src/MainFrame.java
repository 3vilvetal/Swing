import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.net.URL;

import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import component.ToolBar;
import panel.ListView;
import panel.SourcePanel;
import panel.TreeView;

public class MainFrame extends JFrame
{
	private static final long serialVersionUID = -6971701335711326462L;

	Container content;
	
	public static TreeView tree;
	public static ListView list;
	public static ToolBar tool;
	public static SourcePanel source;
	public static Source_picture source_picture;
	public static Source_tools source_tools;
	public static Source_tools_buttons source_tools_buttons;
	public static Broker_panel broker_panel;
	public static SmartTarget_panel smart_target;
	public JPanel topPanel;
	
	public MainFrame()
	{
		setTitle("Bug Searcher");
		setLocation(new Point(200,70));
		setSize(870,800);
		
		
		content=getContentPane();
		
		JMenuBar menu=new JMenuBar();
		setJMenuBar(menu);
		
		JMenu file=new JMenu("File");
		file.add(new AbstractAction ("New...")
		{
			public void actionPerformed (ActionEvent event)
			{
				
			}
		});
		
		JMenu about=new JMenu(" Help ");
		about.add(new AbstractAction (" About ")
		{
			public void actionPerformed (ActionEvent event)
			{
				About window=new About();
//				MAIN.window.setCursor(3);
			}
		});
		
		menu.add(file);
		menu.add(about);
		
		tree=new Tree_View();
		list=new List_View();
		tool=new Tool_bar();
		
		source=new Source_panel();
		source_picture=new Source_picture();
		source_tools=new Source_tools();
		source_tools_buttons=new Source_tools_buttons();
		broker_panel=new Broker_panel();
		smart_target=new SmartTarget_panel();
//------------------panels		
		topPanel=new JPanel();
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
//------------------panels	
		panel2.add(tree, BorderLayout.EAST);
		panel2.add(list, BorderLayout.WEST);
		panel2.add(tool, BorderLayout.NORTH);
//		panel2.add(source_tools, BorderLayout.EAST);
//		panel2.add(source, BorderLayout.WEST);

//-----------panel1 comp	
//------------------Horizontal_1
		Box hbox1=Box.createHorizontalBox();
		hbox1.add(Box.createHorizontalStrut(20));
		hbox1.add(source_tools);	
		hbox1.add(Box.createHorizontalStrut(20));
		hbox1.add(source);
		hbox1.add(Box.createGlue());
//------------------Horizontal_2
		Box hbox2=Box.createHorizontalBox();
		hbox2.add(Box.createHorizontalStrut(20));
		hbox2.add(source_tools_buttons);
//------------------Vertical		
		Box vbox=Box.createVerticalBox();
		vbox.add(Box.createVerticalStrut(5));
		vbox.add(hbox2);
		vbox.add(Box.createVerticalStrut(20));
		vbox.add(hbox1);
		panel1.add(vbox);
//-----------panel1 comp
		
//-----------panel4 comp	
//------------------Horizontal_1
				Box hbox41=Box.createHorizontalBox();
				hbox41.add(Box.createHorizontalStrut(20));
				hbox41.add(broker_panel);	
				hbox41.add(Box.createHorizontalStrut(20));
				hbox41.add(Box.createGlue());
//------------------Vertical		
				Box vbox4=Box.createVerticalBox();
				vbox4.add(Box.createVerticalStrut(5));
				vbox4.add(Box.createVerticalStrut(20));
				vbox4.add(hbox41);
				panel4.add(vbox4);
//-----------panel4 comp
				
//-----------panel5 comp	
//------------------Horizontal_1
								Box hbox51=Box.createHorizontalBox();
								hbox51.add(Box.createHorizontalStrut(20));
								hbox51.add(smart_target);	
								hbox51.add(Box.createHorizontalStrut(20));
								hbox51.add(Box.createGlue());
//------------------Vertical		
								Box vbox5=Box.createVerticalBox();
								vbox5.add(Box.createVerticalStrut(5));
								vbox5.add(Box.createVerticalStrut(20));
								vbox5.add(hbox51);
								panel5.add(vbox5);
//-----------panel5 comp
		
//===========Tabs		
		JTabbedPane tabs=new JTabbedPane();
		
		tabs.addTab("Broker",panel4);
		
		tabs.addTab("SmartTarget",panel5);
		
		tabs.addTab("Source Keywords",panel1);
		tabs.addTab("Tree+List",panel2);
		tabs.addTab("info",panel3);
		
//		if (tabs.isShowing()) 
//		System.out.println("TRUE");
//===========Tabs	

		//===========Picture_1
		URL imageURL1=Main_Frame.class.getResource("frame_1.png");
		JLabel image_1=new JLabel(new ImageIcon(imageURL1));
		//-----------Picture_1
		
//----TOP_PANEL via STRUTS		
		//---------------------------1
		Box hbox11=Box.createHorizontalBox();
		hbox11.add(Box.createHorizontalStrut(0));
		hbox11.add(image_1);	
		hbox11.add(Box.createHorizontalGlue());
		//---------------------------2
		Box hbox22=Box.createHorizontalBox();
		hbox22.add(Box.createHorizontalStrut(0));
		hbox22.add(tabs);
		hbox11.add(Box.createHorizontalGlue());
		//--------------------------Vertical
		Box vbox11=Box.createVerticalBox();
		vbox11.add(Box.createVerticalStrut(0));
		vbox11.add(hbox11);
		vbox11.add(Box.createVerticalStrut(0));
		vbox11.add(hbox22);
		
		topPanel.add(vbox11);		
		
		content.add(source_tools_buttons, BorderLayout.PAGE_START);
		content.add(topPanel, BorderLayout.WEST);
		
	}
}
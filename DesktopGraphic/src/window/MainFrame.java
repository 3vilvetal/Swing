package window;
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
import panel.BrokerPanel;
import panel.ListView;
import panel.SourcePanel;
import panel.SourcePicture;
import panel.SourceTools;
import panel.SourceToolsButtons;
import panel.TreeView;

public class MainFrame extends JFrame
{
	private static final long serialVersionUID = -6971701335711326462L;

	Container content;
	
	public static TreeView tree;
	public static ListView list;
	public static ToolBar tool;
	public static SourcePanel source;
	public static SourcePicture source_picture;
	public static SourceTools source_tools;
	public static SourceToolsButtons source_tools_buttons;
	public static BrokerPanel broker_panel;
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
				About window = new About();
//				MAIN.window.setCursor(3);
			}
		});
		
		menu.add(file);
		menu.add(about);
		
		tree = new TreeView();
		list = new ListView();
		tool = new ToolBar();
		
		source = new SourcePanel();
		source_picture = new SourcePicture();
		source_tools = new SourceTools();
		source_tools_buttons = new SourceToolsButtons();
		broker_panel = new BrokerPanel();

		//------------------panels		
		topPanel=new JPanel();
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();

		//------------------panels	
		panel2.add(tree, BorderLayout.EAST);
		panel2.add(list, BorderLayout.WEST);
		panel2.add(tool, BorderLayout.NORTH);

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
		
//===========Tabs		
		JTabbedPane tabs=new JTabbedPane();
		tabs.addTab("Broker",panel4);
		tabs.addTab("Source Keywords",panel1);
		tabs.addTab("Tree+List",panel2);
		tabs.addTab("info",panel3);
//===========Tabs	

		//===========Picture_1
		JLabel image_1=new JLabel(new ImageIcon("images/frame_1.png"));
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
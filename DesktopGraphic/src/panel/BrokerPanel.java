package panel;

import java.awt.TextArea;

import javax.swing.Action;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import action.CheckAll;

public class BrokerPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public TextArea area;
	public JTable table;
	public JScrollPane scrollPane;
	public DefaultTableModel model;
	public Object[][] data;
	
	public BrokerPanel()
	{
		JLabel label = new JLabel("Multiple Test: ");
		
		String[] columnNames = {"Number", " Use Case ", "Broker<->DB", "Broker<->CM"};
		data = new String [1][4];
		
		
		model = new DefaultTableModel(data, columnNames);
	    JTable table = new JTable(model);
	    
	    //change column size	
	    TableColumn col0 = table.getColumnModel().getColumn(0);
	    col0.setPreferredWidth(40);
	    TableColumn col1 = table.getColumnModel().getColumn(1);
	    col1.setPreferredWidth(540);
				
		scrollPane = new JScrollPane(table);
		
		JButton check_all = new JButton();
		Action check_all_action = new CheckAll();
		
		check_all.setAction(check_all_action);
		check_all.setText("Check All");
		
		area = new TextArea(5, 70);
		JScrollPane scrollPane_area=new JScrollPane(area);
		
		//-1
		Box hbox00=Box.createHorizontalBox();
		hbox00.add(Box.createHorizontalStrut(1000));
		
		//------------------Horizontal_0
		Box hbox0=Box.createHorizontalBox();
		hbox0.add(label);
		hbox0.add(Box.createGlue());
		
		//------------------Horizontal_1
		Box hbox1=Box.createHorizontalBox();
		hbox1.add(scrollPane);
		hbox1.add(Box.createGlue());
		
		//------------------Horizontal_2
		Box hbox2=Box.createHorizontalBox();
		hbox2.add(check_all);	
		hbox2.add(Box.createGlue());
		
		//------------------Horizontal_3
		Box hbox3=Box.createHorizontalBox();
		hbox3.add(scrollPane_area);
		hbox3.add(Box.createGlue());
		
		//------------------Vertical		
		Box vbox=Box.createVerticalBox();
		vbox.add(hbox00);
		vbox.add(hbox0);
		vbox.add(Box.createVerticalStrut(5));
		vbox.add(hbox1);
		vbox.add(Box.createVerticalStrut(10));
		vbox.add(hbox2);
		vbox.add(Box.createVerticalStrut(10));
		vbox.add(hbox3);
		
		add(vbox);
	}
}
package action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import window.MainFrame;

public class CheckAllAction extends AbstractAction
{
	private static final long serialVersionUID = 1L;
	
	public int N_T;
	public int FTests, STests;
	
	public CheckAllAction() {	
	}
		
		public void actionPerformed(ActionEvent event) 
		{	
			MainFrame.broker_panel.model.insertRow(0, new Object[]{"number", "test", "hello", "world"});
			MainFrame.broker_panel.area.setText("Hello world test!");
		}
}
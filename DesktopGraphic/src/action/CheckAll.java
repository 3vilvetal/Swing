package action;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import window.MainFrame;

public class CheckAll extends AbstractAction
{
	private static final long serialVersionUID = 1L;
	
	public void actionPerformed(ActionEvent event) 
	{	
		MainFrame.broker_panel.model.insertRow(0, new Object[]{"number", "test", "hello", "world"});
		MainFrame.broker_panel.area.setText("Hello world test!");
	}
}
package panel;

import java.awt.Dimension;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import action.Open;
import action.Save;

public class SourceToolsButtons extends JToolBar
{
	private static final long serialVersionUID = 1L;

	public SourceToolsButtons()
	{
		//New button
		JButton butNew = new JButton();
		String labNew = "new";
		
		butNew.setIcon(new ImageIcon("images/new.png", labNew));
		butNew.setSize(100,100);
		
		//Save button
		JButton butSave = new JButton();
		
		//Save Action 		
		Action save = new Save();
		butSave.setAction(save);
		
		String labSave="save";
		butSave.setIcon(new ImageIcon("images/save.png", labSave));
		
		//Delete button
		JButton butDel = new JButton();
		String labDel = "del";                     
		butDel.setIcon(new ImageIcon("images/delete.png", labDel));
		
		//Open button
		JButton butOpen = new JButton();
		String labOpen = "open";
		
		//Open Action 		
		Action open = new Open();
		butOpen.setAction(open);
		butOpen.setIcon(new ImageIcon("image/open.png", labOpen));
		
		//Run button
		JButton butRun = new JButton();
		String labRun = "run";           
		butRun.setIcon(new ImageIcon("images/run.png", labRun));
		
		//Pause button
		JButton butPause=new JButton();
		String labPause="pause";
		butPause.setIcon(new ImageIcon("images/pause.png", labPause));
		
		//Stop button
		JButton butStop = new JButton();
		String labStop = "stop";
		butStop.setIcon(new ImageIcon("images/stop.png", labStop));
		
		//Composition
		add(butOpen);
		add(butNew);
		add(butSave);
		add(butDel);
		addSeparator(new Dimension(10, 40));
		add(butRun);
		add(butPause);
		add(butStop);
		addSeparator(new Dimension(10, 40));
	}
}

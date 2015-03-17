package action;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.tree.DefaultMutableTreeNode;

import window.MainFrame;

public class Open extends AbstractAction
{
	public String keys[];
	public Open()
	{	
			
	}
	
	public void actionPerformed(ActionEvent arg0) 
	{		
			int LC = 0;
			
			//--change on value from Open: "Keys"
			File dir = new File("Keys");

			File[] files = dir.listFiles();
			LC = files.length;
			keys = new String [LC];
			
			for(int i=0;i<LC;i++)
			{		
					keys[i]=files[i].getName();
//					System.out.println("OPEN: "+files[i].getName());
			}
				
//			BufferedReader in=new BufferedReader(new FileReader("SOURCE/MAIN.keys"));
//			int LC=0;
//			while (in.readLine()!=null)
//			{
//				LC++;
//			}
//			
//			keys=new String [LC];
//			BufferedReader inn=new BufferedReader(new FileReader("SOURCE/MAIN.keys"));
//			for (int i=0;i<LC;i++)
//			{
//				keys[i]=inn.readLine();
//				System.out.println(i+1+". "+keys[i]);
//			}
//			in.close();
			
			DefaultMutableTreeNode node[]=new DefaultMutableTreeNode[LC];
			
			for (int i=0;i<LC;i++)
			{
				node[i]=new DefaultMutableTreeNode(keys[i]);
			}
			
			MainFrame.source_tools.top.removeAllChildren();
			
			for (int i=0;i<LC;i++)
			{
				MainFrame.source_tools.top.add(node[i]);
			}
			
			
			MainFrame.source_tools.tree.updateUI();
			MainFrame.source_tools.scrl.updateUI();
			MainFrame.source_tools.updateUI();	
	}
}

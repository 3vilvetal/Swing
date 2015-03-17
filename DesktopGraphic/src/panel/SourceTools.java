package panel;

import java.awt.Dimension;
import java.io.File;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

import listener.TreeListener;

public class SourceTools extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public static JTree tree;
	public static DefaultMutableTreeNode top;
	public static JScrollPane scrl;
	public SourceTools()
	{
		top = new DefaultMutableTreeNode("TREE");
		tree = new JTree(top);
		
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		TreeListener listener=new TreeListener();
		tree.addTreeSelectionListener(listener);
				
		int LC=0;

		//--change on value from Open: "Keys"
		String keys[];
		File dir = new File("Keys");

		File[] files = dir.listFiles();
		LC = files.length;
		
		keys=new String [LC];
		for(int i = 0; i < LC; i++) {		
				keys[i] = files[i].getName();
		}
		
		DefaultMutableTreeNode node[]=new DefaultMutableTreeNode[LC];
		
		for (int i = 0; i < LC; i++) {
			node[i] = new DefaultMutableTreeNode(keys[i]);
		}
				
		for (int i = 0; i < LC; i++)
		{
			top.add(node[i]);
		}
		
		//-------------open action		
		
//		final JToolBar toolbar = new JToolBar("Source Toolbar", JToolBar.VERTICAL);
//		
//		toolbar.setRollover(true);
//		
//		final URL imageURL=Tool_bar.class.getResource("Icon_new.jpg");
//		JButton butNew=new JButton("NEWMAIN",new ImageIcon(imageURL));
//		butNew.addActionListener(new 
//				ActionListener()
//				{
//					public void actionPerformed(ActionEvent event)
//					{
//						JButton butNew=new JButton("NEWMAIN",new ImageIcon(imageURL));
//						toolbar.add(butNew);
//					}
//				});
//		
//		toolbar.add(butNew);
		
		scrl=new JScrollPane(tree);
		scrl.setPreferredSize(new Dimension(200,600));
		add(scrl);
	}
}
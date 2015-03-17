package panel;


import java.awt.Dimension;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

import listener.TreeListener;

public class TreeView extends JPanel
{
	private static final long serialVersionUID = 1L;
	public static JTree tree;
	
	public TreeView()
	{
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Tree");
		DefaultMutableTreeNode category = new DefaultMutableTreeNode("Category");
		DefaultMutableTreeNode keyword = new DefaultMutableTreeNode ("Keyword");
		
		top.add(category);
		category.add(keyword);
		
		DefaultMutableTreeNode book = new DefaultMutableTreeNode("BOoK");
		keyword.add(book);
		
		tree = new JTree(top);
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		
		TreeListener listener = new TreeListener();
		tree.addTreeSelectionListener(listener);
		
		JScrollPane treeView = new JScrollPane(tree);
		JEditorPane htmlPane = new JEditorPane();
		htmlPane.setEditable(false);
		
		JScrollPane htmlView = new JScrollPane();
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		splitPane.setTopComponent(treeView);
		splitPane.setBottomComponent(htmlView);
		splitPane.setDividerLocation(100);
		splitPane.setPreferredSize(new Dimension(200,500));
		
		add(splitPane);
	}
}
package panel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SourcePicture extends JPanel
{
	private static final long serialVersionUID = 1L;

	public SourcePicture()
	{
		JLabel img = new JLabel(new ImageIcon("images/Source_img.jpg"));
		add(img);
	}
}
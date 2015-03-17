import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main 
{
	public static MainFrame window;
	
	public static void main(String args[])
	{
		window = new MainFrame();
		
		//Splash screen
		JWindow splash = new JWindow();
		
		JPanel content = new JPanel();
	    content.setBackground(Color.white);

	    // Set the window's bounds, centering the window
	    Dimension splashDimension = splash.getToolkit().getScreenSize();
	    splash.setBounds(300, 100, 800, 604);
		
	    Rectangle splashAbounds = splash.getBounds();
		splash.setBounds((splashDimension.width - splashAbounds.width) / 2, 
						(splashDimension.height - splashAbounds.height) / 2, 
						((splashDimension.width - splashAbounds.width) / 2) + 250, 
						((splashDimension.height - splashAbounds.height) / 2) + 313);

	    // Build the splash screen
	    JLabel label = new JLabel(new ImageIcon("images/splash1.png"));
	    JLabel copyrt = new JLabel("Copyright 2010, Vitalii Lopushansky", JLabel.CENTER);
	    
	    copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
	    content.add(label, BorderLayout.CENTER);
	    splash.getContentPane().add(content);
	    
	    // Display it
	    splash.setVisible(true);

	    // Wait a little while, maybe while loading resources
	    try { Thread.sleep(1000); } catch (Exception e) {}
	    splash.setVisible(false);
	    
		try
		{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
		catch(Exception e)
		{
             JOptionPane.showMessageDialog(null,"You have not apropriate JDK","ERROR",JOptionPane.ERROR_MESSAGE);
        }
		SwingUtilities.updateComponentTreeUI(window);
		
		//Set window location in the center
		Dimension windowDimension = window.getToolkit().getScreenSize();
		Rectangle windowAbounds = window.getBounds();
		
		window.setLocation((windowDimension.width - windowAbounds.width) / 2,
						   (windowDimension.height - windowAbounds.height) / 2);
		window.setVisible(true);
	}
}
package BlockBreaker;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

@SuppressWarnings("serial")

public class WindowView extends JFrame {
	
	private JLabel winTitle;
	private JLabel winFooter;
	
	// Constructors
	public WindowView() {
		super("BlockBreaker");
	}
	
	public void displayTitle(String title) {
		winTitle = new JLabel(title, SwingConstants.CENTER);
		winTitle.setBounds(61, 0, 400, 20);
		winTitle.setBackground(Color.YELLOW);
		winTitle.setOpaque(true); // need this for setBackground to work
		add(winTitle, BorderLayout.NORTH);
	}
	
	public void displayFooter(String footer) {
		winFooter = new JLabel(footer, SwingConstants.CENTER);
        winFooter.setBounds(61, 300, 400, 20);
        winFooter.setBackground(Color.YELLOW);
        winFooter.setOpaque(true); // need this for setBackground to work
        add(winFooter, BorderLayout.SOUTH);
	}
	
	public void displayJFrame(int width, int height, boolean visible) {
		setBounds(0, 0, width, height);		
	    setSize(width,height);
	    setVisible(visible);
			
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(null);
	}
}

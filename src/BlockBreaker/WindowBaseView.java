package BlockBreaker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")

public class WindowBaseView extends JFrame {
	
	private JLabel title;
	private JLabel footer;
	
	// Constructors
	public WindowBaseView() {
		super("BlockBreaker");
	}
		
	public void displayTitle(String title) {
		this.title = new JLabel(title, SwingConstants.CENTER);
		this.title.setBounds(61, 0, 400, 20);
		this.title.setBackground(Color.white);
		this.title.setOpaque(true); // need this for setBackground to work
		add(this.title, BorderLayout.NORTH);
	}
	
	public void displayFooter(String footer) {
		this.footer = new JLabel(footer, SwingConstants.CENTER);
        this.footer.setBounds(61, 300, 400, 20);
        this.footer.setBackground(Color.white);
        this.footer.setOpaque(true); // need this for setBackground to work
        add(this.footer, BorderLayout.SOUTH);
	}
	
	public void displayJFrame(int width, int height, boolean visible) {
		setBounds(0, 0, width, height);		
	    setSize(width,height);
	    setVisible(visible);
			
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //setLayout(null);
	}
	
}

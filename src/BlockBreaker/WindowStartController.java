package BlockBreaker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class WindowStartController extends WindowBaseController {
	
	private WindowStartModel model;
	private WindowStartView view;
	
	public WindowStartController(){
		super("Inicio", "by aldov500");
		
		model = new WindowStartModel();
		
		view = new WindowStartView();
		
		loadFunctionality();

	}
		
	private void loadFunctionality() {		
		addListenerInicio();
		addListenerConfig(); 
		addListenerAcercaDe();
	}
	
	private void addListenerInicio() {
		view.getButtonInicio().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Inicio");
			}
		});
	}
	
	private void addListenerConfig() {
		view.getButtonConfig().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Config");
			}
		});
	}

	private void addListenerAcercaDe() {
		view.getButtonAcercaDe().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Acerca de");
			}
		});
	}
}

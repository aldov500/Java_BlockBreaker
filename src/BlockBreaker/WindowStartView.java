package BlockBreaker;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class WindowStartView extends WindowBaseView {
	
	private JButton buttonInicio;
	private JButton buttonConfig;
	private JButton buttonAcercaDe;
	
	private String captionButtonInicio;
	private String captionButtonConfig;
	private String captionButtonAcercaDe;
	
	// Default Constructor
	public WindowStartView() {
		super();
		displayTitle("Title");
		displayFooter("Footer");		
		displayJFrame(600,480,true);
		addButtons();
	}
	
	public void addButtons() {
		
		buttonInicio = new JButton("Inicio");
		buttonInicio.setBounds(225,200,150,30);
        add(buttonInicio);
        
        buttonConfig = new JButton("Configuracion");
        buttonConfig.setBounds(225,240,150,30);
        add(buttonConfig);
        
        buttonAcercaDe = new JButton("Acerca de");
        buttonAcercaDe.setBounds(225,280,150,30);
        add(buttonAcercaDe);
        
	}
	
	public JButton getButtonInicio() {
		return buttonInicio;
	}
	
	public JButton getButtonConfig() {
		return buttonConfig;
	}
	
	public JButton getButtonAcercaDe() {
		return buttonAcercaDe;
	}
	
	/*public void addButton(String caption, int coordX, int coordY, int width, int height) {
		buttonInicio = new JButton(caption);
		buttonInicio.setBounds(300,200,100,30);
        add(buttonInicio);
	}*/
	
	
}

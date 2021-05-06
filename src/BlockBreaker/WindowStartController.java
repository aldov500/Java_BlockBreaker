package BlockBreaker;

public class WindowStartController extends WindowBaseController {
	
	WindowStartModel model;
	WindowStartView view;
	
	
	
	public WindowStartController(){
		super("Inicio", "by aldov500");
		super.addImage("path to image");
		super.addButton("Inicio",250, 200, 150, 30);
		super.addButton("Configuracion",250, 240, 150, 30);
		super.addButton("Acerca de",250, 280, 150, 30);        
	}
	
}

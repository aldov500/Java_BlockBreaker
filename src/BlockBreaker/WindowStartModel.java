package BlockBreaker;

public class WindowStartModel {
	
	private int buttonWidth;
	private int buttonHeight;
	
	private String buttonCaption1;
	private String buttonCaption2;
	private String buttonCaption3;
	
	public WindowStartModel() {
		buttonWidth = 150;
		buttonHeight = 30;
		
		buttonCaption1 = "Inicio";
		buttonCaption2 = "Configuracion";
		buttonCaption3 = "Acerca de";
	}
	
	
	public void setButtonWidth(int width) {
		buttonWidth = width;
	}
	
	public void setButtonHeight(int height) {
		buttonHeight = height;
	}
	
	public void setButtonCaption1(String caption) {
		buttonCaption1 = caption;
	}
	
	public void setButtonCaption2(String caption) {
		buttonCaption2 = caption;
	}
	
	public void setButtonCaption3(String caption) {
		buttonCaption3 = caption;
	}
	
	
	public String getButtonCaption1() {
		return buttonCaption1;
	}
	
	public String getButtonCaption2() {
		return buttonCaption2;
	}
	
	public String getButtonCaption3() {
		return buttonCaption3;
	}
	
	public int getButtonWidth() {
		return buttonWidth;
	}
	
	public int getButtonHeight() {
		return buttonHeight;
	}
	
}

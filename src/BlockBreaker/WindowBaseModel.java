package BlockBreaker;

public class WindowBaseModel {
	// Dimensions
	private int height;
	private int width;
	private boolean visibility;
	// Colors
	private String primaryColor;
	private String secondaryColor;
	// winTitles
	private String winTitle;
	private String winFooter;
	
	// Constructors
	public WindowBaseModel(){
		height = 480;
		width = 600;
		visibility = true;
		
		primaryColor = "color";
		secondaryColor = "front";
		
		winTitle = "New Window";
		winFooter = "Element footer";
		
		
	}
	
	public WindowBaseModel(int height, int width, String primaryColor, String secondaryColor, String winwinTitle, String winFooter){
		this.height = height;
		this.width = width;
		this.primaryColor = primaryColor;
		this.secondaryColor = secondaryColor;
		this.winTitle = winwinTitle;
		this.winFooter = winFooter;
	}
	
	// Getters
	public int getHeight() { return height; }
	public int getWidth() { return width; }
	public boolean getVisibility() { return visibility; }
	public String getprimaryColor() { return primaryColor; }
	public String getWindowwinTitle() { return winTitle; }
	public String getWindowFooter() { return winFooter; }
	
	// Setters
	protected void setHeight(int height) {
		this.height = height;
	}
	
	protected void setWidth(int width) {
		this.width = width;
	}
	
	protected void setVisibility(boolean visibility) {		
		this.visibility = visibility;
	}
	
	protected void setprimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}
	
	protected String getsecondaryColor() {
		return secondaryColor;
	}
	
	protected void setsecondaryColor(String secondaryColor) {
		this.secondaryColor = secondaryColor;
	}
	
	protected void setWindowTitle(String winTitle) {
		this.winTitle = winTitle;
	}
	
	protected void setWindowFooter(String winFooter) {
		this.winFooter = winFooter;
	}

}

package BlockBreaker;

public class WindowController {
	
	private WindowModel model;
	private WindowView view;
	
	public WindowController(){
		view = new WindowView();
		model = new WindowModel();
		
	}
	
	public WindowController(String title, String footer) {
		view = new WindowView();
		model = new WindowModel();
		
		setCaptions(title, footer);
		
		displayWindow();	
		
	}
	
	public WindowModel getModel() {
		return model;
	}
	
	public WindowView getView() {
		return view;
	}
	
	protected void setWindowModel(WindowModel model) {
		this.model = model;
	}
	
	protected void setWindowView(WindowView view){
		this.view = view;
	}
	
	public void setTitle(String title) {
		model.setWindowTitle(title);
	}
	
	public void setFooter(String footer) {
		model.setWindowFooter(footer);
	}
	
	public void setCaptions(String title, String footer) {
		model.setWindowTitle(title);
		model.setWindowFooter(footer);
	}
	
	public void displayWindow() {
		view.displayTitle(model.getWindowwinTitle());
		view.displayFooter(model.getWindowFooter());		
		view.displayJFrame(model.getWidth(),
							model.getHeight(),
							true);
	}
}

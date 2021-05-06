package BlockBreaker;

public class WindowBaseController {
	
	private WindowBaseModel model;
	private WindowBaseView view;
	
	public WindowBaseController(){
		view = new WindowBaseView();
		model = new WindowBaseModel();
		
	}
	
	public WindowBaseController(String title, String footer) {
		view = new WindowBaseView();
		model = new WindowBaseModel();
		
		setCaptions(title, footer);
		
		displayWindow();	
		
	}
	
	public WindowBaseModel getModel() {
		return model;
	}
	
	public WindowBaseView getView() {
		return view;
	}
	
	protected void setWindowModel(WindowBaseModel model) {
		this.model = model;
	}
	
	protected void setWindowView(WindowBaseView view){
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
	
	public void addButton(String caption, int coordX, int coordY, int width, int height) {
		view.addButton(caption, coordX, coordY, width, height);
	}
	
	public void addImage(String path) {
		
	}
}

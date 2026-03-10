package abstract_factory;

public class GUIBuilder {

	public void buildWindow(AbstractWidgetFactory factory) {
		Window window = factory.createWindow();
		window.setTitle("New Window");
		factory.createScroll();
		factory.createNavigationButtons();
	}
	
}

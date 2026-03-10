package abstract_factory;

public interface AbstractWidgetFactory {
	
	public Window createWindow();
	public Scroll createScroll();
	public Button[] createNavigationButtons();

}

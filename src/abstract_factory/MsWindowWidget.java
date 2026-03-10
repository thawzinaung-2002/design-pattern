package abstract_factory;

public class MsWindowWidget implements AbstractWidgetFactory{

	@Override
	public Window createWindow() {
		return new MsWindow();
	}

	@Override
	public Scroll createScroll() {
		return new MsScroll();
	}

	@Override
	public Button[] createNavigationButtons() {
		Button[] buttons = {
	               new MsButton("close window"),
	               new MsButton("expand window"),
	               new MsButton("collapse window"),
	               new MsButton("back"),
		};
		return buttons;
	}

}

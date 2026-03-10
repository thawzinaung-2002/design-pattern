package abstract_factory;

public class Demo {

	public static void main(String[] args) {
		
		GUIBuilder builder = new GUIBuilder();
		
		AbstractWidgetFactory widgetFactory = null;
		
		String platform = "window";
		
		if (platform.equals("MACOSX")) {
			widgetFactory = new MacWidget();
		} else {
			widgetFactory = new MsWindowWidget();
		}
		
		builder.buildWindow(widgetFactory);
		
	}
	
}

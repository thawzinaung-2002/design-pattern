package behavioral.template;

public class Demo {

	public static void main(String[] args) {
		
		CrossCompiler iphone = new IPhoneCompiler();
		iphone.compile();
		System.out.println("=============================");
		CrossCompiler android = new AndroidCompiler();
		android.compile();
		
	}
	
}

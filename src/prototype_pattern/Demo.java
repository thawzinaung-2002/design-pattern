package prototype_pattern;

import java.io.File;

public class Demo {

	public static void main(String[] args) {
		
		String zip = "zip";
		String rar = "rar";
		
		var zipArchiver = ArchiverFactory.getPrototypeForType(zip);
		var rarArchiver = ArchiverFactory.getPrototypeForType(rar);
		
		zipArchiver.zip(new File(""));
		rarArchiver.zip(new File(""));
		
		ArchiverFactory.factories.get("zip").setModeOnOff(true);
		
		var zipArchiver2 = ArchiverFactory.getPrototypeForType(zip);
		zipArchiver2.zip(new File(""));
		zipArchiver.zip(new File(""));
	}
	
}

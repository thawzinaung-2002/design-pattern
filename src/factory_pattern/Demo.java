package factory_pattern;

import java.io.File;

public class Demo {

	public static void main(String[] args) {
		
		var zip1 = FactoryClass.getObjFromType("zip");
		var rar1 = FactoryClass.getObjFromType("rar");
		var zip2 = FactoryClass.getObjFromType("zip");
		
		rar1.archive(new File(" "));
		zip1.archive(new File(" "));
		zip2.archive(new File(" "));
		
		System.out.println(zip1 == zip2);
		
	}
	
}

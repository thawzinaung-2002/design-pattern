package factory_pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryClass {

	public static Map<String, Supplier<Archiver>> factories = new HashMap<>();
	
	static {
		factories.put("zip", ZipArchiver::new);
		factories.put("rar", RarArchiver::new);
	}
	
	public static Archiver getObjFromType(String type) {
		return factories.get(type) == null ? null : factories.get(type).get();
	}
	
}

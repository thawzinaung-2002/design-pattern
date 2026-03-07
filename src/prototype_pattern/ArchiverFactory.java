package prototype_pattern;

import java.util.HashMap;
import java.util.Map;

public class ArchiverFactory {

	public static Map<String, Archiver> factories = new HashMap<>();
	
	static {
		factories.put("zip", new ZipArchiver());
		factories.put("rar", new RarArchiver());
	}
	
	public static Archiver getPrototypeForType(String type) {
		//Cloning object's current state
		return factories.get(type).clone();
	}
	
}

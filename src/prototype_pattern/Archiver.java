package prototype_pattern;

import java.io.File;

public interface Archiver {

	void zip(File dir);
	
	Archiver clone();
	
	void setModeOnOff(boolean flag);
	
}

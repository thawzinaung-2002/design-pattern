package prototype_pattern;

import java.io.File;
import java.io.Serializable;

import org.apache.commons.lang3.SerializationUtils;

public class ZipArchiver implements Archiver, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean lowMemoryMode = false;

	@Override
	public void zip(File dir) {
		String mode = lowMemoryMode ? "(Low Memory Mode)" : "(High Performance Mode)";
        System.out.println("Zip Archiver working in " + mode);
	}
	
	@Override
	public Archiver clone() {
		return (Archiver) SerializationUtils.clone(this);
	}
	
	@Override
	public void setModeOnOff(boolean flag) {
		this.lowMemoryMode = flag;
	}
	
}

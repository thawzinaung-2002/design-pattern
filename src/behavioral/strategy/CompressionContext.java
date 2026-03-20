package behavioral.strategy;

import java.io.File;
import java.util.List;

public class CompressionContext {
	
	private CompressionStrategy strategy;
	
	public void setCompressionStrategy(CompressionStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void createArchive(List<File> files) {
		strategy.compressFiles(files);
	}
	
	public void createArchive(List<File> files, CompressionStrategy cs) {
		cs.compressFiles(files);
	}

}

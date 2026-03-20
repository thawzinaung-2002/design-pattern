package behavioral.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		var cs = new CompressionContext();
		cs.setCompressionStrategy(new ZipCompressionStrategy());
		
		List<File> fileList = new ArrayList<>();
		cs.createArchive(fileList);
		
		cs.createArchive(fileList, file -> System.out.println("Any Compression Strategy"));
		cs.createArchive(fileList, Demo::customCompressionStrategy);
		
		fileList.sort((file1, file2) -> file1.getName().compareTo(file2.getName()));
		
		
	}
	
	public static void customCompressionStrategy(List<File> files) {
		System.out.println("Custom compression strategy");
	}

}

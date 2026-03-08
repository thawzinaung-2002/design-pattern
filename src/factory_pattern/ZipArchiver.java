package factory_pattern;

import java.io.File;

public class ZipArchiver implements Archiver{

	@Override
	public void archive(File dir) {
		System.out.println("Zip Archiver!");
	}

}

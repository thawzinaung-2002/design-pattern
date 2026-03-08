package factory_pattern;

import java.io.File;

public class RarArchiver implements Archiver{

	@Override
	public void archive(File dir) {
		System.out.println("Rar Archiver!");
	}

}

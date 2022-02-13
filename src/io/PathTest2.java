package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest2 {

	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("/home/afrinfajila123g/pg-fsd2022/phase1/io-basics/file1.txt");
		
		System.out.format("Path %s exists : %b%n", p1, Files.exists(p1, LinkOption.NOFOLLOW_LINKS));
		
		Path createFile = Paths.get("/home/afrinfajila123g/pg-fsd2022/phase1/io-basics/file4.txt");
		Files.createFile(createFile);
		
	}
}
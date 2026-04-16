package com.fileIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("D:\\IO\\Program\\Sample.txt");
		Path p = Files.createFile(path);

		System.out.println("File Created at path: " + p);

	}
}
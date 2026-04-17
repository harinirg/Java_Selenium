package com.fileIO;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {
public static void main(String args[]) {
	FileSystem fs=FileSystems.getDefault();
	Path p1=fs.getPath("D:\\JavaGit\\HariniRG_Assessment13\\src\\com\\Assessment13\\Problem1");
	System.out.print(p1);
	
	
}
}

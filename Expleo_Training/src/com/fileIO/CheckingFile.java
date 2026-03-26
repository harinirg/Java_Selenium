package com.fileIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p=Paths.get("D:\\\\JavaGit\\\\HariniRG_Assessment13\\\\src\\\\com\\\\Assessment13\\\\Problem1.java");
		Boolean result=Files.exists(p);
		System.out.println("Path "+p+"\nexists: "+result);
		
		

	}

}

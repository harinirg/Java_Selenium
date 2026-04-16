package com.fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SoftLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path existingFilePath=Paths.get("D:\\JavaGit\\HariniRG_Assessment13\\src\\com\\Assessment13\\Problem1.java");
		Path symLinkPath=Paths.get("D:\\Demo2.docx");
		try {
			Files.createSymbolicLink(symLinkPath,existingFilePath);
		}
		catch(IOException x){
			System.err.println(x);
		}
		catch(UnsupportedOperationException x) {
			System.err.println(x);
		}
		

	}

}

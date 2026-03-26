package com.handson9;
import java.io.File;
import java.util.Scanner;

public class E2_FileExtension {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			File folder = new File("D:\\EclipseGit\\Java_Practice_And_HandsOn\\Training_Java_handsOn"); 
			File[] files = folder.listFiles();
			System.out.print("Enter the extension type: ");
			String extension = sc.next(); 
			boolean found = false;
			for(File f : files) {
				if(f.isFile() && f.getName().endsWith(extension)) {
					System.out.println(f.getName());
					found = true;
				}
			}
			if(!found)
				System.out.println("No file found with this extension");
		}
		catch(Exception e) {
			System.out.println("Error in accessing this folder");
		}
		
	}

}

package com.handson9;

import java.io.File;

public class E3_FileOrDirectoryExists {

	public static void main(String[] args) {
		try {
			File f = new File("D:\\EclipseGit\\Java_Practice_And_HandsOn\\Training_Java_handsOn");

			if (f.exists()) {
				System.out.println("File or Directory exists");
			} 
			else {
				System.out.println("File or Directory does not exist");
			}
		}
		catch (Exception e) {
			System.out.println("Error checking the path");
		}
	}

}

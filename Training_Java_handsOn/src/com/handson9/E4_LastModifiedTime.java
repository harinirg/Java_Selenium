package com.handson9;
import java.io.File;
import java.util.Date;

public class E4_LastModifiedTime {

	public static void main(String[] args) {
		try {
			File f = new File("handson9.txt");

			if (f.exists()) {
				long time = f.lastModified();
				Date d = new Date(time);
				System.out.println("Last modified time: " + d);
			} 
			else {
				System.out.println("File does not exist");
			}
		}
		catch (Exception e) {
			System.out.println("Error reading file");
		}
	}

}

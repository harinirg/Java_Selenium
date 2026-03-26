package com.handson9;

import java.io.File;
import java.util.Scanner;

public class E5_FileReadLineByLine {
	public static void main(String[] args) {
		try {
			File f = new File("handson9.txt");
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}

		} catch (Exception e) {
			System.out.println("Error reading file");
		}
	}

}

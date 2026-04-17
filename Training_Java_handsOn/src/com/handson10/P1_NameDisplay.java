/*
 * This program asks the user to enter how many names they want to input.
 * It stores the names in an ArrayList and displays only those names
 * whose length is greater than 5 characters.
 */
package com.handson10;

import java.util.ArrayList;
import java.util.Scanner;

public class P1_NameDisplay {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.print("How many names you want ? ");
		int n = scan.nextInt();
		scan.nextLine();

		ArrayList<String> names = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter name : ");
			String name = scan.nextLine();
			names.add(name);
		}
		System.out.println("Names longer than 5 characters:");

		for (String name : names) {
			if (name.length() > 5) {
				System.out.println(name);
			}
		}

		scan.close();
	}
}

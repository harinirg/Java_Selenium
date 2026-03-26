/*
 * This program returns first 2 characters of a string.
 * If length of String is less than 2 returns remaining with '@'.
 */
package com.assessment15;
import java.util.Scanner;

public class Problem2_SubstringAndConcat {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();

		String result = "";

		if (str.length() >= 2) {
			result = str.substring(0, 2);
		} else if (str.length() == 1) {
			result = str + "@";
		} else {
			result = "@@";
		}

		System.out.println(result);

		scan.close();
	}
}
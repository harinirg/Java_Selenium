package com.handson7;

import java.util.*;

public class RemoveDuplicateCharacter {

	public static String removeDuplicates(String str) {

		boolean visited[] = new boolean[256];
		String result = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (!visited[ch]) {
				result = result + ch;
				visited[ch] = true;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String input = scan.nextLine();

		String output = removeDuplicates(input);

		System.out.println("Output: " + output);
	}
}

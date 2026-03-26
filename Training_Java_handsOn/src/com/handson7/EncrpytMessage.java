package com.handson7;

import java.util.Scanner;

public class EncrpytMessage {

	public static String encrypt(String msg) {

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < msg.length(); i++) {

			char ch = msg.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				char enc = (char) ((ch - 'A' + 3) % 26 + 'A');
				result.append(enc);
			} else if (ch >= 'a' && ch <= 'z') {
				char enc = (char) ((ch - 'a' + 3) % 26 + 'a');
				result.append(enc);
			} else if (ch >= '0' && ch <= '9') {
				result.append(ch);
			} else if (ch == ' ') {
				result.append('_');
			} else {
				result.append(ch);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter message: ");
		String input = scan.nextLine();

		String output = encrypt(input);

		System.out.println("Encrypted message: " + output);
	}
}

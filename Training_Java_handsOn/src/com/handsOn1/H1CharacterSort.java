/**
 * Numbers and alphabets have equivalent ASCII values.
 * Numbers (0 to 9) ASCII values range from 48 to 57.
 * Uppercase alphabets (A to Z) ASCII values range from 65 to 90.
 * Lowercase alphabets (a to z) ASCII values range from 97 to 122.
 *
 * This program reads characters from the user,
 * converts them into a character array,
 * sorts them using ASCII values,
 * and displays the sorted output.
 */
package com.handsOn1;
import java.util.*;
public class H1CharacterSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter characters:");
		String input = scan.nextLine();
		char[] arr = input.toCharArray();
		Arrays.sort(arr);
		System.out.println("Sorted Output:");
		for (char c : arr) {
			System.out.print(c + " ");
		}
		scan.close();

	}
}



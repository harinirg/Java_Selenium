/* 
 * Program to read integers until a negative number is entered.
 * Replace each number in the array as follows:
 * Replace with -2 if the number is divisible by 7 (black number)
 * Replace with -9 if the number is divisible by 8 (white number)
 * Replace with -6 if the number is divisible by both 7 and 8
 * Finally, print the modified array.
 */
package com.handsOn2;
import java.util.*;
public class H3ReplaceNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[100];
		int count = 0;
		System.out.println("Enter the number");
		while (true) {
			int n = scan.nextInt();
			if (n < 0)
				break;
			arr[count++] = n;
		}
		for (int i = 0; i < count; i++) {
			if (arr[i] % 7 == 0 && arr[i] % 8 == 0)
				arr[i] = -6;
			else if (arr[i] % 7 == 0)
				arr[i] = -2;
			else if (arr[i] % 8 == 0)
				arr[i] = -9;
		}
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}
	
}

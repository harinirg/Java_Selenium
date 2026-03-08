/**
 * This program reads twenty five numbers from the user
 * and stores them in an array.
 * It searches for a given number in the array and
 * displays the number of times it appears.
 */
package com.handsOn2;
import java.util.*;
public class M6SearchKeyWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of numbers:");
		int n=scan.nextInt();
		int[] arr = new int[n];
		int count = 0;
		System.out.println("Enter numbers:");
		for (int i = 0; i <n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("Enter number to search: ");
		int key = scan.nextInt();
		for (int i = 0; i <n; i++) {
			if (arr[i] == key) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Occurrences: " + count);
		} else {
			System.out.println("Number not found");
		}
		scan.close();
	}
}



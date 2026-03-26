/*
 * A program to find the missing number in a given integer array of 1 to 100.
 */
package com.handsOn2;
import java.util.*;
public class E8MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];
		int[] freq = new int[256];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			freq[arr[i]]++;
		}

		for (int i = 1; i <= n; i++) {
			if (freq[i] == 0) {
				System.out.println(i);
			}
		}
		scan.close();
	}

}

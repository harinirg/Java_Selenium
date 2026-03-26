/*
 *This program is to find the frequency of each element in the array.
 */
package com.handsOn2;
import java.util.*;
public class E4ArrayElementFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		int[] arr = new int[n];
		int[] freq = new int[256];

		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			freq[arr[i]]++;
		}
		for (int i = 0; i < 256; i++) {
			if (freq[i] > 0) {
				System.out.println("Element "+i + " " +"Frequency "+ freq[i]);
			}
		}
		scan.close();
	}
}


/*
 * Write a program to count a total number of duplicate and unique elements in the given array.
 */
package com.handsOn2;
import java.util.Scanner;

public class M3DuplicateUniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Scanner scan = new Scanner(System.in);

		        System.out.print("Enter array size: ");
		        int n = scan.nextInt();

		        int[] arr = new int[n];
		        int[] freq = new int[101];

		        System.out.println("Enter array elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = scan.nextInt();
		            freq[arr[i]]++;
		        }

		        int duplicateCount = 0;
		        int uniqueCount = 0;

		        for (int i = 0; i < freq.length; i++) {
		            if (freq[i] > 1) {
		                duplicateCount++;
		            } else if (freq[i] == 1) {
		                uniqueCount++;
		            }
		        }

		        System.out.println("No of duplicate element: " + duplicateCount);
		        System.out.println("No of unique elements: " + uniqueCount);
		        scan.close();
	}

}

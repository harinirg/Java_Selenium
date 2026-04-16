/*
 * A program to find the duplicate number on a given integer array.
 */
package com.handsOn2;
import java.util.*;
public class E6DuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		int freq[]=new int[256];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
			freq[arr[i]]++;
		}
		System.out.println("Duplicate elements:");
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1) {
				System.out.println(i);
			}
		}
		scan.close();
	}

}

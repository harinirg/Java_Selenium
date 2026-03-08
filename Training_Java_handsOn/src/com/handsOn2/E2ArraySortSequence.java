/*
 * This program to sort the elements of an array in sequence.
 */
package com.handsOn2;
import java.util.*;
public class E2ArraySortSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int org;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					org=arr[i];
					arr[i]=arr[j];
					arr[j]=org;

				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		scan.close();

	}

}

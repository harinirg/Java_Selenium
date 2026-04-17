/**
 * This program merges three arrays of different sizes
 * representing heights of Indian, NRI, and Foreign students.
 * The merged array is sorted in ascending order
 * and displayed as a single line.
 */
package com.handsOn2;
import java.util.*;
public class H4MergeHeight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number of Indian: ");
		int m=scan.nextInt();
		int x[]=new int[m];
		System.out.println("Enter the height:");
		for(int i=0;i<m;i++) {
			x[i]=scan.nextInt();
		}
		System.out.println("Enter the Number of NRI: ");
		int n=scan.nextInt();
		System.out.println("Enter the height:");
		int y[]=new int[n];
		for(int i=0;i<n;i++) {
			y[i]=scan.nextInt();
		}
		System.out.println("Enter the Number of Foreign student: ");
		int o=scan.nextInt();
		int z[]=new int[o];

		System.out.println("Enter the height:");

		for(int i=0;i<o;i++) {
			z[i]=scan.nextInt();
		}
		int arr[]=new int[m+n+o];
		int index=0;

		for(int i=0;i<m;i++) {
			arr[index++]=x[i];
		}
		for(int i=0;i<n;i++) {
			arr[index++]=y[i];
		}
		for(int i=0;i<o;i++) {
			arr[index++]=z[i];
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}

}

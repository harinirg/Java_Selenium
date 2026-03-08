/*
 *This program is to identify the greatest element in n-dimensional array A[].
 */
package com.handsOn2;
import java.util.*;
public class E5GreatestElementNdArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int n=scan.nextInt();
		System.out.println("Enter the columns:");
		int m=scan.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		int max=arr[0][0];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		System.out.println("Maximum element:"+max);
		scan.close();
	}

}

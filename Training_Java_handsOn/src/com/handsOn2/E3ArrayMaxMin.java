/*
 * This program is to find max or min value in an array.
 */
package com.handsOn2;
import java.util.Scanner;
public class E3ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Max value:"+max);
		System.out.println("Min value: "+min);
		scan.close();
		

	}

}

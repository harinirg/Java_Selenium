/**
 * This program checks whether chocolates owned by N friends
 * can be shared equally among all of them.
 *
 * If the total number of chocolates is divisible by N,
 * it prints "Yes", otherwise it prints "No".
 */
package com.handsOn2;
import java.util.*;
public class H1ChocolateSharing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of friends: ");
		int n=scan.nextInt();
		System.out.println("Enter the number of chocolates: ");
		int arr[]=new int[n];
		int total=0;
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
			total+=arr[i];
		}
		if(total%n==0) {
			System.out.println("Yes,can share equally");
		}
		else {
			System.out.println("No,can't share equally");
		}
		scan.close();
	}

}

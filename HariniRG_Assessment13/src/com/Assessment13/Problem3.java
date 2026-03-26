/*
 * This program is to find the perfectNumber
 */
package com.Assessment13;
import java.util.*;
public class Problem3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int num = scan.nextInt();
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum+= i;
			}
		}
		if (num == sum) {
			System.out.println("the given number is  perfect");
		} else {
			System.out.println("the given is not perfect");
		}

		scan.close();
	}
}




/**
 * This program checks whether a given number
 * is an Armstrong number.
 *
 * An Armstrong number is a three-digit number
 * whose sum of the cubes of its digits
 * is equal to the number itself.
 */
package com.handsOn1;
import java.util.*;
public class M9ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		int original = num;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;
		}
		if (sum == original) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
		scan.close();
	}
}

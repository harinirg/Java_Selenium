/**
 * This program determines whether a given number
 * is a factorial of any number.
 *
 * The input must be greater than zero; otherwise,
 * it displays "Invalid Input".
 *
 * If the number is not a perfect factorial,
 * it displays an appropriate message.
 */
package com.handsOn1;
import java.util.*;
public class H5FactorialCheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();
		if (num <= 0) {
			System.out.println("Invalid Input");
		} else {
			long temp = num;
			int i = 1;
			while (temp > 1) {
				i++;
				if (temp % i == 0) {
					temp = temp / i;
				} else {
					System.out.println("Sorry. The given number is not a perfect factorial");
					scan.close();
					return;
				}
			}
			System.out.println(i);
		}
		scan.close();
	}

}

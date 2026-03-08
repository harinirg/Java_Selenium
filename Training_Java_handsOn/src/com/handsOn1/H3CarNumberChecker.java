/**
 * Ana wants to choose a four-digit lucky car number.
 * Her lucky numbers are 3, 5, and 7.
 *
 * This program checks whether the sum of the digits
 * of the car number is divisible by 3, 5, or 7.
 *
 * If valid, it displays the car number;
 * otherwise, it displays that the number is not valid.
 */

package com.handsOn1;
import java.util.*;
public class H3CarNumberChecker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the car no: ");
		int carNo = scan.nextInt();
		if (carNo < 1000 || carNo > 9999) {
			System.out.println(carNo + " is not a valid car number");
		} else {
			int sum = 0;
			int temp = carNo;
			while (temp > 0) {
				sum = sum + (temp % 10);
				temp = temp / 10;
			}
			if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
				System.out.println("Lucky Number");
			} else {
				System.out.println("Sorry it’s not my lucky number");
			}
		}
		scan.close();
	}

}

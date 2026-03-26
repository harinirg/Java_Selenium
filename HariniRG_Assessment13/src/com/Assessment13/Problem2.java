/*
 * This is a program to generate PIN from getting 3 input from user
 * Below are the rules for generating the PIN -
 * The PIN should be made up of 4 digits
 * The unit (ones) position of the PIN should be the least of the units position of the three input numbers
 * The tens position of the PIN should be the least of the tens position of the three input numbers
 * The hundreds position of the PIN should be the least of the hundreds position of the three input numbers
 * The thousands position of the PIN should be the maximum of all the digits in the three input numbers
 */
package com.Assessment13;
import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		System.out.println("Input1=");
		int input1=scan.nextInt();
		System.out.println("Input2=");
		int input2=scan.nextInt();
		System.out.println("Input3=");
		int input3=scan.nextInt();
		int unit1=input1%10;
		int tens1=(input1/10)%10;
		int hundreds1=input1/100;
		int unit2=input2%10;
		int tens2=(input2/10)%10;
		int hundreds2=input2/100;
		int unit3=input3%10;
		int tens3=(input3/10)%10;
		int hundreds3=input3/100;
		int unit = Math.min(unit1, Math.min(unit2, unit3));
		int tens = Math.min(tens1, Math.min(tens2, tens3));
		int hundreds = Math.min(hundreds1, Math.min(hundreds2, hundreds3));
		int max = unit1;
		max = Math.max(max, tens1);
		max = Math.max(max, hundreds1);
		max = Math.max(max, unit2);
		max = Math.max(max, tens2);
		max = Math.max(max, hundreds2);
		max = Math.max(max, unit3);
		max = Math.max(max, tens3);
		max = Math.max(max, hundreds3);
		int pin = (max * 1000) + (hundreds * 100) + (tens * 10) + unit;
		System.out.println("PIN = " + pin);
		scan.close();

	}

}

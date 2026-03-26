/*
 * This is a program to print sum of digits of a given number.
 */
package com.handsOn1;
import java.util.*;
public class E9DigitSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=scan.nextInt();
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum: "+sum);
		scan.close();

	}
}

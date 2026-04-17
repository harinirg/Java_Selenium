/*
 * This program check whether the given number is 
 * divisor of 7 using simple if statement.
 */
package com.handsOn1;
import java.util.*;
public class E2DivisibleBySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=scan.nextInt();
		if(num%7==0) {
			System.out.println(num+" is a divisor of 7");
		}
		else {
			System.out.println(num+" is not a divisor of 7");
		}
		scan.close();

	}

}

/*
 * This program uses if statement to check 
 * whether the blood donor is eligible or not for donating blood. 
 * The rules laid down are as follows.
 * a.	Age should be above 18 yrs but less than 55 yrs.
 * b.	Weight should be more than 45kg.
 */
package com.handsOn1;
import java.util.*;
public class E7DonorEligibility {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=scan.nextInt();
		System.out.println("Enter the weight: ");
		int weight=scan.nextInt();
		if((age>18&&age<55)&&weight>45) {
			System.out.println("the blood done is eligible");
		}
		else {
			System.out.println("Not eligible");
		}
		scan.close();
	}

}

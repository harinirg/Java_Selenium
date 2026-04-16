/*
 * This  program reads an integer continuously and 
 * displays "Hello" as many times as the value of the integer. 
 * If the user enters a negative number,
 * the insertion of integers should end and the program should display 
 * the total number of the displayed "Hello".
 */
package com.handsOn1;
import java.util.*;
public class E6PrintStatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int total=0;
		while(true) {
			System.out.println("Enter number: ");
			int n=scan.nextInt();
			if(n<0) {
				break;
			}
			else {
				for(int i=0;i<n;i++) {
					System.out.println("Hello ");
					total++;
				}
			}


		}
		System.out.println("Total Hello: "+total);
		scan.close();

	}
}
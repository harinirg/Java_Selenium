/*
 * a program to add even and odd numbers from 1 to 10. 
 * Store and display their results in two separate arrays.
 */
package com.handsOn2;
//import java.util.*;
public class E1EvenOddSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evensum=0;
		int oddsum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				 evensum+=i;
			}
			else {
				oddsum+=i;
			}
		}
		int even[]=new int[] {evensum};
		int odd[]=new int[] {oddsum};
		/*even[0]=evensum;
		odd[0]=oddsum;*/
		System.out.println("Even sum"+even[0]);
		System.out.println("odd sum"+odd[0]);
	}

}

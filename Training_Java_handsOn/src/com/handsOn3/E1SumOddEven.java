/*
 * Program to calculate the sum of even numbers and odd numbers
 * from 1 to a given number using a function.
 */
package com.handsOn3;
import java.util.*;
public class E1SumOddEven {
	public static int[] calculateSum(int n ) {
		int even=0;
		int odd=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				even+=i;
			}
			else {
				odd+=i;
			}
		}
		return new int[] {even,odd};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int result[]=calculateSum(n);
		System.out.println("even sum: "+result[0]);
		System.out.println("odd sum: "+result[1]);
		scan.close();

	}

}

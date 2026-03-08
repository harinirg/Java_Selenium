/*
 * This program finds:
 * 1. Sum of odd numbers from lowerbound to upperbound
 * 2. Sum of even numbers from lowerbound to upperbound
 * 3. Absolute difference between the two sums
 */
package com.handsOn3;
import java.util.*;
public class M1OddEven {
	static int sumOdd(int lower, int upper) {
        int sum = 0;

        for (int i = lower; i <= upper; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
	static int sumEven(int lower, int upper) {
        int sum = 0;

        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Lowerbound: ");
		int lowerBound=scan.nextInt();
		System.out.println("Enter the Upperbound: ");
		int upperBound=scan.nextInt();
		int oddSum=sumOdd(lowerBound,upperBound);
		int evenSum=sumEven(lowerBound,upperBound);
		int diff=Math.abs(oddSum-evenSum);
		System.out.println("The sum of odd numbers:"+oddSum);
		System.out.println("The sum of even numbers: "+evenSum);
		System.out.println("The absolute difference between the two sums is:"+diff);
		scan.close();
	

	}

}

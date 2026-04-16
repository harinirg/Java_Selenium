/*
 * . The input stops when the teacher enters a negative number. The teacher wants to process the scores using a function based on certain conditions

•	Replace the score with 0 if it is even.
•	Replace the score with 1 if it is odd.
•	Replace the score with 2 if it is divisible by 8.
•	Replace the score with 3 if it ends with the digit 3.
•	Replace the score with 4 if it is divisible by 9.
•	If multiple rules apply to a number, the teacher wants to use the rule that replaces it with the highest number.
 */
package com.Assessment13;
import java.util.*;
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] original = new int[100];
		int[] processed = new int[100];
		int count = 0;

		System.out.println("Enter the scores (enter a negative number to stop input):");

		while (true) {
			int num = scan.nextInt();
			if (num < 0)
				break;

		}

	}
}



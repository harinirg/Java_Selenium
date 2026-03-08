/*
 * This program checks whether a person is eligible to vote.
 */
package com.handsOn3;
import java.util.*;
public class E4VotingEligible {
	public static boolean eligible(int age) {

		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		if(eligible(age))
		System.out.println("Eligible to vote");
		else
			System.out.println("Not eligible");
		scan.close();

	}

}

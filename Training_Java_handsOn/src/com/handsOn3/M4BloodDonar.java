/**
 * Program to check whether a blood donor is eligible to donate blood.
 * Eligibility conditions:
 * 1. Age should be above 18 years and not more than 55 years.
 * 2. Weight should be more than 45 kg.
 * The program uses a function to verify eligibility
 * and displays whether the donor is eligible or not.
 */
package com.handsOn3;
import java.util.*;
public class M4BloodDonar {
	    static boolean isEligible(int age, int weight) {
	        if (age > 18 && age <= 55 && weight > 45) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int age = scan.nextInt();
	        int weight = scan.nextInt();
	        if (isEligible(age, weight)) {
	            System.out.println("Eligible");
	        } else {
	            System.out.println("Not Eligible");
	        }
	}

}

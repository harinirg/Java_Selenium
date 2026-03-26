/**
 * Program to calculate the incremented salary of an employee based on
 * performance appraisal rating.
 * Rules:
 * - Rating between 1 and 4   → 10% increment
 * - Rating between 4.1 and 7 → 25% increment
 * - Rating between 7.1 and 10 → 30% increment
 * If salary is zero/negative or rating is outside 1 to 10,
 * the output will be "Invalid Input".
 * A separate function is used to calculate the incremented salary.
 */
package com.handsOn3;

import java.util.Scanner;

public class H1Salary {
	static double calculateIncrementedSalary(double salary, double rating) {

		if (salary <= 0 || rating < 1 || rating > 10) {
			return -1;
		}

		if (rating >= 1 && rating <= 4) {
			return salary + (salary * 0.10);
		} else if (rating > 4 && rating <= 7) {
			return salary + (salary * 0.25);
		} else {
			return salary + (salary * 0.30);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the salary: ");
		double salary = scan.nextDouble();

		System.out.print("Enter the appraisal rating: ");
		double rating = scan.nextDouble();

		double result = calculateIncrementedSalary(salary, rating);

		if (result == -1) {
			System.out.println("Invalid Input");
		} else {
			System.out.println(result);
		}
		scan.close();
	}
}


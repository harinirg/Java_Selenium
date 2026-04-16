/*
 * This program calculates the new salary after applying a hike percentage.
 * Formula:
 * New Salary = oldSalaryPerMonth + (oldSalaryPerMonth * hike / 100)
 */
package com.handsOn3;
import java.util.*;
public class E3SalaryHike {
	public static double newSalary(double oldSalary,double hike) {
		double newSalary=oldSalary+(oldSalary*hike/100);
		return newSalary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double oldSalary=scan.nextInt();
		double hike=scan.nextInt();
		System.out.println("New Salary is: "+newSalary(oldSalary,hike));
		scan.close();
	}

}

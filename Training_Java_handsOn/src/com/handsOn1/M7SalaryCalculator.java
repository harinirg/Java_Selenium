/**
 * This program calculates the gross salary of an employee
 * based on the basic salary using if-else-if statements.
 *
 * If basic salary ≤ 10000: HRA = 20% and DA = 80%.
 * If basic salary is between 10001 and 20000: HRA = 25% and DA = 90%.
 * If basic salary ≥ 20001: HRA = 30% and DA = 95%.
 *
 * Gross Salary = Basic Salary + HRA + DA.
 */
package com.handsOn1;
import java.util.*;
public class M7SalaryCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter Basic Salary:");
        double basic = scan.nextDouble();
        double hra, da, gross;
        if (basic <= 10000) {
            hra = basic * 0.20;
            da = basic * 0.80;
        } else if (basic <= 20000) {
            hra = basic * 0.25;
            da = basic * 0.90;
        } else {
            hra = basic * 0.30;
            da = basic * 0.95;
        }
        gross = basic + hra + da;
        System.out.println("Gross Salary:" + gross);
        scan.close();
    }
}

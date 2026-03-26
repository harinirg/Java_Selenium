/*
 * This program gets employee details, wages per day,
 * and number of days worked from the user.
 * It then calculates and displays the total salary.
 */
package com.handsOn1;
import java.util.*;
public class E1EmployeeDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the name :");
		String name=scan.next();
		scan.nextLine();
		System.out.println("Enter the wages: ");
		float wages=scan.nextFloat();
		System.out.println("Enter the days: ");
		int days= scan.nextInt();
		double salary=wages*days;
		System.out.println("Employee Details");
		System.out.println("Name of the employee: "+name);
		System.out.println("Enter the wages: "+wages);
		System.out.println("Enter the days: "+days);
		System.out.println("Salary: "+salary);
		scan.close();
		
	}
}


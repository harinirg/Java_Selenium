/*
 * The base class Employee contains common attributes such as
 * employee ID, employee name, and base salary. It also contains
 * a method calculateSalary() which can be overridden by child classes.
 *
 * Three types of employees are implemented:
 *
 * 1. PermanentEmployee
 *    - Receives base salary and bonus.
 *    - Final salary = baseSalary + bonus.
 *
 * 2. ContractEmployee
 *    - Salary is calculated after deducting tax and service charge.
 *    - Final salary = baseSalary - (baseSalary * taxRate) - serviceCharge.
 *
 * 3. Intern
 *    - Receives a fixed stipend.
 *    - Final salary = stipend.
 */
package com.handson5;
import java.util.*;
class Employee {
	String empId;
	String empName;
	double baseSalary;

	Employee(String empId, String empName, double baseSalary) {
		this.empId = empId;
		this.empName = empName;
		this.baseSalary = baseSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double calculateSalary() {
		return baseSalary;
	}

	public String toString() {
		return "Employee empId: " + empId + "\nEmployee empName: " + empName + "\nEmployee Final Salary: "
				+ calculateSalary() + "\n";
	}

}

class PermanentEmployee extends Employee {
	private double bonus;

	PermanentEmployee(String empId, String empName, double basesalary, double bonus) {
		super(empId, empName, basesalary);
		this.bonus = bonus;
	}

	public double calculateSalary() {
		return baseSalary + bonus;
	}
}

class ContractEmployee extends Employee {
	private double taxRate;
	private double serviceCharge;

	ContractEmployee(String empId, String empName, double baseSalary, double taxRate, double serviceCharge) {
		super(empId, empName, baseSalary);
		this.taxRate = taxRate;
		this.serviceCharge = serviceCharge;
	}

	public double calculateSalary() {
		return baseSalary - (baseSalary * taxRate) - serviceCharge;
	}

}

class Intern extends Employee {
	private double stipend;

	Intern(String empId, String empName, double stipend) {
		super(empId, empName, stipend);
		this.stipend = stipend;
	}

	public double calculateSalary() {
		return stipend;
	}

}

public class Employee_Payroll {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter the role of employee: ");
			System.out.println("1.Permanent Employee");
			System.out.println("2.Contract Employee");
			System.out.println("3.Intern employee");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			n=scan.nextInt();
			scan.nextLine();
			switch(n) {
			case 1: 
				System.out.print("Enter Employee ID: ");
				String pid = scan.nextLine();

				System.out.print("Enter Employee Name: ");
				String pname = scan.nextLine();

				System.out.print("Enter Base Salary: ");
				double pSalary = scan.nextDouble();

				System.out.print("Enter Bonus: ");
				double bonus = scan.nextDouble();

				Employee p = new PermanentEmployee(pid, pname, pSalary, bonus);
				System.out.println(p);
				break;
			case 2:
				System.out.print("Enter Employee ID: ");
				String cid = scan.nextLine();

				System.out.print("Enter Employee Name: ");
				String cname = scan.nextLine();

				System.out.print("Enter Base Salary: ");
				double cSalary = scan.nextDouble();

				System.out.print("Enter Tax Rate: ");
				double tax = scan.nextDouble();

				System.out.print("Enter Service Charge: ");
				double service = scan.nextDouble();

				Employee c = new ContractEmployee(cid, cname, cSalary, tax, service);
				System.out.println(c);
				break;
			case 3:
				System.out.print("Enter Employee ID: ");
				String iid = scan.nextLine();

				System.out.print("Enter Employee Name: ");
				String iname = scan.nextLine();

				System.out.print("Enter Stipend: ");
				double stipend = scan.nextDouble();

				Employee i = new Intern(iid, iname, stipend);
				System.out.println(i);
				break;
			case 4:
				System.out.println("Exiting program...");
				break;
			default:
				System.out.println("Invalid choice");
				break;
				
			}
		}while(n!=4);
		scan.close();
		
	}

}

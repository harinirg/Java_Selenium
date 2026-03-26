/*
 * This program illustrate the use of 'this' keyword for all cases
 */
package com.ClassesandObject;
class Employee {
	int empId;
	String empName;
	double empSalary;
	Employee(int empId,String empName,double empSalary){
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		System.out.println("Employee record created successfylly");
	}
	Employee(){
		this(101,"Default Employee",30000);
		System.out.println("Default constructor called-initialized with default data.\n");
	}
	void registerEmployee() {
		System.out.println("Registering Employee");
		this.displayDetails();
	}
	void displayDetails() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+empSalary);
	}
	void sendForProcessing() {
		HRDepartment hr=new HRDepartment();
		hr.processEmployee(this);
	}
	Employee updateSalary(double hikePercentage) {
		this.empSalary=empSalary+(empSalary*hikePercentage/100);
		return this;
	}
	Employee updateName(String newName) {
		this.empName=newName;
		return this;
	}
}
class HRDepartment{
	void processEmployee(Employee e) {
		System.out.println("HR Department Processing Employee...");
		System.out.println("Processed Employee:"+e.empName+"with salary"+e.empSalary+"/n");
	}
}
public class EmployeeThisKeywordDemo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.registerEmployee();
		emp.sendForProcessing();
		System.out.println("---Updating Employee Details---");
		emp.updateName("Subham").updateSalary(15.5).displayDetails();
		emp.sendForProcessing();
	}

}




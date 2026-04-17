package com.Procedure;
import java.util.Scanner;
public class EmployeeCRUDProceduresDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		EmployeeDAO dao=new EmployeeDAO();
		int choice;
		do {
			System.out.println("\nPlease choose an option from the menu");
			System.out.println("1.Insert a new employee");
			System.out.println("2.Display all employee");
			System.out.println("3.Update an employee's department");
			System.out.println("4.Delete an employee");
			System.out.println("5.Get employee details by ID");
			System.out.println("0.Exit");
			System.out.println("Enter the choice:");
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1:
					System.out.println("\n---Insert Employee---");
					System.out.println("Enter Employee ID:");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Employee Name");
					String name=sc.nextLine();
					
					System.out.println("Enter Employee Department:");
					String dept=sc.nextLine();
					dao.insertEmployee(new Employee(id,name,dept));
					break;
					case 2:
					System.out.println("\n---Employee List ---");
					dao.displayEmployees();
					break;
					case 3:
					System.out.println("\n---Update Employee Department ---");
					System.out.print("Enter Employee ID to update: ");
					id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter new Department: ");
					dept = sc.nextLine();
					dao.updateEmployee(id, dept);
					break;
					case 4:
						System.out.println("\n---Delete Employee ---");
						System.out.print("Enter Employee ID to delete: ");
						id = sc.nextInt();
						dao.deleteEmployee(id);
						break;
						case 5:
						System.out.println("\n---Get Employee By ID ---");
						System.out.print("Enter Employee ID: ");
						id = sc.nextInt();
						dao.getEmployeeById(id);
						break;
						case 0:
							System.out.println("\nExitingEmployee Management System. Goodbye!");
							break;
							default:
							System.out.println("\nInvalidchoice! Please enter a number between 0 and 5.");
							}
							} while (choice != 0);
							sc.close();
							}
							

	


}

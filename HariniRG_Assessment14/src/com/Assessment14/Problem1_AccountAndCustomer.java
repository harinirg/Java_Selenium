/*
 * Customer class represents a bank customer.
 * It stores customer details like id, name and gender.
 * It uses Menu based to select the Functionality like withDraw,Deposit,Check Balance.
 */
package com.Assessment14;
import java.util.*;
class Customer{
	private int id;
	private String name;
	private char gender;
	public Customer(int id,String name,char gender) {
		this.id=id;
		this.name=name;
		this.gender=gender;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public String toString() {
		return name+"("+id+")";
	}
}
class Account{
	private int id;
	private Customer customer;
	private double balance=0.0;
	public Account(int id,Customer customer,double balance) {
		this.id=id;
		this.customer=customer;
		this.balance=balance;
	}
	public Account(int id,Customer customer) {
		this.id=id;
		this.customer=customer;
	}
	public int getId() {
		return id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public String toString() {
		return customer.toString()+" balance=$"+balance;
	}
	public String getCustomerName() {
		return customer.getName();
	}
	public Account deposit(double amount) {
		balance+=amount;
		System.out.println("AMOUNT DEPOSITED SUCESSFULLY!!");
		return this;
	}
	public Account withdraw(double amount) {
		if(balance>=amount) {
		balance-=amount;
		}
		else {
			System.out.println("AMOUNT WITHDRAWN EXCEEDS THE CURRENT BALANCE!");
		}
		return this;
		
	}
	
}
public class Problem1_AccountAndCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ACCOUNT DETAILS");
	    System.out.print("ACCOUNT_ID ");
	    int acctId = scan.nextInt();
	    System.out.print("CUSTOMER_ID ");
        int cusId = scan.nextInt();
        scan.nextLine();
        System.out.print("CUSTOMER_NAME: ");
        String name = scan.nextLine();
        System.out.print("CUSTOMER_GENDER: ");
        char gender = scan.next().charAt(0);
        System.out.print("ACCOUNT_BALANCE: ");
        double balance=scan.nextDouble();
        Customer c = new Customer(cusId, name, gender);
        Account acc = new Account(acctId, c);
		int choice;
		do {
			System.out.println("PLEASE SELECT ONE OPTION FROM BELOW");
			System.out.println("1.WITHDRAW");
			System.out.println("2.DEPOSIT");
			System.out.println("3.CHECK BALANCE");
			System.out.println("4.Exit");
			choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.print("ENTER AMOUNT TO WITHDRAW: ");
                double w = scan.nextDouble();
                acc.withdraw(w);
                break;
			case 2:
				System.out.print("ENTER AMOUNT TO DEPOSIT: ");
                double d = scan.nextDouble();
                acc.deposit(d);
                break;
			case 3:
				System.out.println("CURRENT BALANCE: " + acc.getBalance());
                break;
			case 4:
				System.out.println("THANK YOU FOR BANKING WITH US!!");
                break;
		    default:
                 System.out.println("INVALID OPTION");
			}
			
			
		}while(choice!=4);
		scan.close();
		

	}

}

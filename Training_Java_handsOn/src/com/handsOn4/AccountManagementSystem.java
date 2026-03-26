/*
 *This is a program that a simplified banking system, aligning with real-world account management scenarios used in enterprise applications using Encapsulation.
 */
package com.handsOn4;
import java.util.*;
class Account{
	private String id;
	private String name;
	private int balance;
	Account(String id,String name){
		this.id=id;
		this.name=name;
		balance=0;	
	}
	Account (String id,String name,int balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int credit(int amount) {
		return balance+=amount;
	}
	public int debit(int amount) {
		if(balance>=amount){
			return balance-=amount;
		}
		else {
			System.out.println("Amount exceeded balance");
			return balance;
		}
	}
	public int transferTo(Account another,int amount) {
		if(balance>=amount) {
			balance-=amount;
			another.balance+=amount;
			return balance;
		}
		else {
			System.out.println("Amount exceeded balance");
			return balance;
		}
	}
	public String toString() {
		return "Id:"+id+"\nName:"+name+"\nBalance:"+balance;
	}
}

public class AccountManagementSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Account ac=new Account("23AID26","Harini");
		Account ac1=new Account("24AID26","Gowsi",20000);
		ac1.credit(1000);
		ac1.debit(500);
		ac1.transferTo(ac,5000);
		ac1.toString();
		System.out.println(ac1);
		System.out.println(ac);
	}

}

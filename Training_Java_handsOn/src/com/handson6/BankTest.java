package com.handson6;
import java.util.*;
class Customer {

    String name;
    int age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
    }
}
class Account {

    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
class RBI {

    Customer c;
    Account a;

    RBI(Customer c, Account a) {
        this.c = c;
        this.a = a;
    }

    public double getInterestRate() {
        return 4.0;
    }

    public double getWithdrawalLimit() {
        return 50000;
    }

    void display() {
        c.displayCustomer();
        a.displayAccount();
    }
}
class SBI extends RBI {

    SBI(Customer c, Account a) {
        super(c, a);
    }

    public double getInterestRate() {
        return 5.5;
    }
}
class ICICI extends RBI {

    ICICI(Customer c, Account a) {
        super(c, a);
    }

    public double getInterestRate() {
        return 6.0;
    }
}


public class BankTest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Name");
        String name=sc.nextLine();

        System.out.println("Enter Age");
        int age=sc.nextInt();

        System.out.println("Enter Account Number");
        int acc=sc.nextInt();

        System.out.println("Enter Balance");
        double bal=sc.nextDouble();

        Customer c=new Customer(name,age);
        Account a=new Account(acc,bal);

        RBI bank;

        System.out.println("1.SBI  2.ICICI");
        int choice=sc.nextInt();

        if(choice==1)
            bank=new SBI(c,a);
        else
            bank=new ICICI(c,a);

        bank.display();
        System.out.println("Interest Rate: "+bank.getInterestRate());
        System.out.println("Withdrawal Limit: "+bank.getWithdrawalLimit());    }
}

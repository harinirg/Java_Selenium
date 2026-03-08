/*
 *This program demonstrates different payment methods using an abstract class.
 *It supports Credit Card, UPI, and NetBanking payments with validation,
 *processing, and receipt generation.
 */
package com.handson5;
import java.util.*;
abstract class Payment {
	String transactionId;
	double amount;
	String customerName;
	String paymentStatus;

	Payment(String transactionId, double amount, String customerName) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.customerName = customerName;
		this.paymentStatus = "Pending";
	}

	abstract boolean validatePayment();

	abstract boolean processPayment();

	public void executeTransaction() {
		if (validatePayment()) {
			if (processPayment()) {
				setPaymentStatus("Success");
			} else {
				setPaymentStatus("Failed");
			}
		} else {
			setPaymentStatus("Validation Failed");
		}
		generateReceipt();
	}

	public void generateReceipt() {
		System.out.println("\n PAYMENT ");
		System.out.println("TransactionId: " + transactionId);
		System.out.println("CustomerName: " + customerName);
		System.out.println("Amount: " + amount);
		System.out.println("Status: " + paymentStatus);
	}

	public String getTransactionId() {
		return transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String status) {
		paymentStatus = status;
	}

}

class CreditCardPayment extends Payment {
	String cardNumber;
	String cvv;
	String expiryDate;

	CreditCardPayment(String transactionId, double amount, String customerName, String cardNumber, String cvv,
			String expiryDate) {
		super(transactionId, amount, customerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	boolean validatePayment() {
		if (cardNumber.length() == 16 && cvv.length() == 3 && expiryDate.length() == 5) {
			return true;
		}
		return false;
	}

	boolean processPayment() {
		System.out.println("Authorizing Credit card");
		System.out.println("Deducting amount from card");
		return true;
	}

}

class UPIPayment extends Payment {
	String upiId;
	String upiPin;

	public UPIPayment(String transactionId, double amount, String customerName, String upiId, String upiPin) {
		super(transactionId, amount, customerName);
		this.upiId = upiId;
		this.upiPin = upiPin;
	}

	boolean validatePayment() {
		if (upiId.contains("@") && upiId.length() >= 6 && upiId.length() <= 30 && upiPin.length() == 4) {
			return true;
		}
		return false;
	}
	boolean processPayment() {
		System.out.println("Sending UPI payment request");
		System.out.println("Transferring amount instantly");
		return true;
	}

}
class NetBankingPayment extends Payment{
	String bankName;
	String accountNumber;
	String ifscCode;
	public NetBankingPayment(String transactionId, double amount, String customerName,String bankName,String accountNumber,String ifscCode) {
		super(transactionId, amount, customerName);
		// TODO Auto-generated constructor stub
		this.bankName=bankName;
		this.accountNumber=accountNumber;
		this.ifscCode=ifscCode;
	}
	boolean validatePayment() {
		if(accountNumber.length()>=10&&ifscCode.length()==11) {
			return true;
		}
		return false;
	}
	boolean processPayment() {

        System.out.println("Authenticating with bank server");
        System.out.println("Processing fund transfer");

        return true;
    }
	
	
}

public class Digital_Online_Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\nSelect Payment Method");
			System.out.println("1. Credit Card Payment");
			System.out.println("2. UPI Payment");
			System.out.println("3. NetBanking Payment");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter Transaction ID: ");
				String tId = scan.nextLine();

				System.out.print("Enter Customer Name: ");
				String name = scan.nextLine();

				System.out.print("Enter Amount: ");
				double amount = scan.nextDouble();
				scan.nextLine();

				System.out.print("Enter Card Number: ");
				String card = scan.nextLine();

				System.out.print("Enter CVV: ");
				String cvv = scan.nextLine();

				System.out.print("Enter Expiry Date (MM/YY): ");
				String expiry = scan.nextLine();

				Payment p1 = new CreditCardPayment(tId, amount, name, card, cvv, expiry);
				p1.executeTransaction();
				break;

			case 2:
				System.out.print("Enter Transaction ID: ");
				String utId = scan.nextLine();

				System.out.print("Enter Customer Name: ");
				String uname = scan.nextLine();

				System.out.print("Enter Amount: ");
				double uamount = scan.nextDouble();
				scan.nextLine();

				System.out.print("Enter UPI ID: ");
				String upi = scan.nextLine();

				System.out.print("Enter UPI PIN: ");
				String pin = scan.nextLine();

				Payment p2 = new UPIPayment(utId, uamount, uname, upi, pin);
				p2.executeTransaction();
				break;

			case 3:
				System.out.print("Enter Transaction ID: ");
				String ntId = scan.nextLine();

				System.out.print("Enter Customer Name: ");
				String nname = scan.nextLine();

				System.out.print("Enter Amount: ");
				double namount = scan.nextDouble();
				scan.nextLine();

				System.out.print("Enter Bank Name: ");
				String bank = scan.nextLine();

				System.out.print("Enter Account Number: ");
				String acc = scan.nextLine();

				System.out.print("Enter IFSC Code: ");
				String ifsc = scan.nextLine();

				Payment p3 = new NetBankingPayment(ntId, namount, nname, bank, acc, ifsc);
				p3.executeTransaction();
				break;

			case 4:
				System.out.println("Exiting payment system...");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 4);

		scan.close();
	}
}

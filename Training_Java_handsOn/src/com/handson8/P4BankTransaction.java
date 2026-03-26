package com.handson8;

import java.util.Scanner;

class PayOutOfBoundsException extends Exception {
    PayOutOfBoundsException(String msg) {
        super(msg);
    }
}

class AccountManagement {

    int balance = 80000;

    void checkForDebit(int amount) throws PayOutOfBoundsException {

        if (amount > 30000) {
            throw new PayOutOfBoundsException("Transaction limit exceeded (Max 30000)");
        }

        if (amount > balance) {
            throw new PayOutOfBoundsException("Insufficient balance");
        }
    }

    void withdrawAmount(int amount) {
        balance = balance - amount;
        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }
}

public class P4BankTransaction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AccountManagement acc = new AccountManagement();

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        try {

            acc.checkForDebit(amount);
            acc.withdrawAmount(amount);

        } catch (PayOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

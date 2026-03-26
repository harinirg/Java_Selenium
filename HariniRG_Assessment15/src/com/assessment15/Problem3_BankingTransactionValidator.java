/*
 * This program validates a bank transaction using exceptions.
 * Displays appropriate error message with code.
 */
package com.assessment15;
import java.util.Scanner;

abstract class BankTransactionException extends Exception {
    private int code;

    public BankTransactionException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

class InsufficientFundsException extends BankTransactionException {
    public InsufficientFundsException(double shortfall) {
        super("InsufficientFundsException: Shortfall: " + shortfall, 1002);
    }
}

class InvalidAccountException extends BankTransactionException {
    public InvalidAccountException(String accountId) {
        super("InvalidAccountException: Account ID cannot be empty", 1001);
    }
}

class TransactionLimitException extends BankTransactionException {
    public TransactionLimitException(double limit) {
        super("TransactionLimitException: Limit: " + limit, 1003);
    }
}

class TransactionValidate {

    public static void validateTransaction(String accountId,
                                           double balance,
                                           double amount,
                                           double dailyLimit)
            throws InvalidAccountException,
                   InsufficientFundsException,
                   TransactionLimitException {

        if (accountId == null || accountId.isEmpty()) {
            throw new InvalidAccountException(accountId);
        }

        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }

        if (amount > dailyLimit) {
            throw new TransactionLimitException(dailyLimit);
        }

        System.out.println("Transaction successful!");
    }
}

public class Problem3_BankingTransactionValidator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {

            System.out.print("Account ID: ");
            String accountId = scan.nextLine();

            System.out.print("Balance: ");
            double balance = scan.nextDouble();

            System.out.print("Amount: ");
            double amount = scan.nextDouble();

            System.out.print("Daily Limit: ");
            double limit = scan.nextDouble();

            TransactionValidate.validateTransaction(accountId, balance, amount, limit);

        } 
        catch (InvalidAccountException e) {
            System.out.println(e.getMessage() + " [Code: " + e.getCode() + "]");
        } 
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage() + " [Code: " + e.getCode() + "] Validation complete");
        } 
        catch (TransactionLimitException e) {
            System.out.println(e.getMessage() + " [Code: " + e.getCode() + "] Validation complete");
        }


        scan.close();
    }
}
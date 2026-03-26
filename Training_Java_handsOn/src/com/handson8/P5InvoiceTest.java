package com.handson8;

import java.util.Scanner;
import java.util.InputMismatchException;

class Invoice {

    int partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    Invoice(int partNumber, String partDescription, int quantity, double pricePerItem) {

        if (partNumber <= 0) {
            System.out.println("Part number must be greater than 0");
            return;
        }

        if (partDescription == null || partDescription.isEmpty()) {
            System.out.println("Part description cannot be empty");
            return;
        }

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than 0");
            return;
        }

        if (pricePerItem <= 0) {
            System.out.println("Price must be greater than 0");
            return;
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    void display() {
        double total = quantity * pricePerItem;

        System.out.println("Part Number: " + partNumber);
        System.out.println("Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price Per Item: " + pricePerItem);
        System.out.println("Total Invoice Amount: " + total);
    }
}

public class P5InvoiceTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Part Number: ");
            int partNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Part Description: ");
            String desc = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter Price per Item: ");
            double price = sc.nextDouble();

            Invoice obj = new Invoice(partNumber, desc, quantity, price);
            obj.display();

        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input type entered.");
        }
    }
}
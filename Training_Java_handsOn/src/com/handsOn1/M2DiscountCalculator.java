/**
 * This program calculates the total expenses for Mark's purchases.
 * A discount of 15% is applied if the quantity purchased
 * is more than 500.
 */
package com.handsOn1;
import java.util.*;
public class M2DiscountCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter price:");
        double price = scan.nextDouble();
        System.out.println("Enter quantity:");
        int quantity = scan.nextInt();
        double totalAmount = price * quantity;
        double discount = 0;
        if (quantity > 500) {
            discount = totalAmount * 0.15;
        }
        double finalAmount = totalAmount - discount;
        System.out.println("Amount: " + finalAmount);

        scan.close();
    }
}

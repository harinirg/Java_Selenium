/**
 * This program calculates the purchase amount after discount
 * using if-else conditions.
 *
 * A 10% discount is applied for purchase amounts above 1000,
 * and a 5% discount is applied for amounts less than or equal to 1000.
 *
 * Purchase Amount = price × quantity
 * Paid Amount = Purchase Amount − Discount Amount
 */

package com.handsOn1;
import java.util.*;
public class M6PurchaseBill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter price:");
		double price = scan.nextDouble();
		System.out.println("Enter quantity:");
		int quantity = scan.nextInt();
		double purchaseAmount = price * quantity;
		double discount;
		if (purchaseAmount > 1000) {
			discount = purchaseAmount * 0.10;
		} else {
			discount = purchaseAmount * 0.05;
		}
		double paidAmount = purchaseAmount - discount;
		System.out.println("PaidAmount:" + paidAmount);
		scan.close();
	}
}

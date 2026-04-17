/*
 * A cloth showroom has announced the following festival discounts on the purchase of items based on the total cost of the items purchased:
 * Less than Rs. 2000	5%
 * Rs. 2000 to less than Rs. 5000	25%
 * Rs. 5000 to less than Rs. 10,000	35%
 * Rs. 10,000 and above	50%
 * Write a program to input the total cost and to compute and 
 * display the amount to be paid by the customer availing the discount.
 */
package com.handsOn1;
import java.util.*;
public class H4DiscountCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double totalCost = scan.nextDouble();
		double discountRate;
		if (totalCost < 2000) {
			discountRate = 0.05;
		} else if (totalCost < 5000) {
			discountRate = 0.25;
		} else if (totalCost < 10000) {
			discountRate = 0.35;
		} else {
			discountRate = 0.50;
		}
		double amountToPay = totalCost - (totalCost * discountRate);
		System.out.println(amountToPay);
		scan.close();
	}

}

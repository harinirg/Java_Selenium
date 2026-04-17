/*
 * This program illustrates that to sort the products based on the price, id, name and quantity.
 */
package com.assessment15;
import java.util.*;

class Products implements Comparable<Products> {

    int productId;
    String productName;
    String productCategory;
    double productPrice;
    double productDiscount;
    int productQuantity;

    public Products(int productId, String productName, String productCategory,
                   double productPrice, double productDiscount, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productDiscount = productDiscount;
        this.productQuantity = productQuantity;
    }

    public int compareTo(Products p) {
        return Integer.compare(this.productId, p.productId);
    }

    public void display() {
        System.out.println(productId + " | " + productName + " | " +
                productCategory + " | " + productPrice + " | " +
                productDiscount + " | " + productQuantity);
    }
}

public class Problem4_StoreandProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Products> list = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter product details:");

            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Discount: ");
            double discount = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            list.add(new Products(id, name, category, price, discount, quantity));
        }

        int choice;

        do {
            System.out.println("\n1. Sort by Id");
            System.out.println("2. List products with price more than 40000");
            System.out.println("3. Exit");
            System.out.print("Enter the option for sorting: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Collections.sort(list);
                    for (Products p : list) {
                        p.display();
                    }
                    break;

                case 2:
                    boolean found = false;

                    for (Products p : list) {
                        if (p.productPrice > 40000) {
                            p.display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No products found.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you!!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
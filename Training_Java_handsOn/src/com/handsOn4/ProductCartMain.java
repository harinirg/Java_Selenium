/*
 *This program manages products in a shopping cart.
 *It allows adding, removing products and calculating the total cart value.
 */
package com.handsOn4;
import java.util.*;
class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void setQuantity(int newQty) {
        if (newQty > 0) {
            quantity = newQty;
        }
    }

    public double calculateTotal() {
        return price * quantity;
    }

    public String getProductDetails() {
        return "ID: " + productId +
               ", Name: " + productName +
               ", Price: " + price +
               ", Quantity: " + quantity +
               ", Total: " + calculateTotal();
    }

    public int getProductId() {
        return productId;
    }
}
class Cart {

    private Product[] products;
    private int count;

    public Cart(int size) {
        products = new Product[size];
        count = 0;
    }

    public void addProduct(Product p) {
        if (count < products.length) {
            products[count] = p;
            count++;
        }
    }

    public void removeProduct(int productId) {
        for (int i = 0; i < count; i++) {
            if (products[i].getProductId() == productId) {
                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[count - 1] = null;
                count--;
                return;
            }
        }
    }

    public double calculateCartTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].calculateTotal();
        }
        return total;
    }

    public void displayCartItems() {
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].getProductDetails());
        }
        System.out.println("Total Cart Value: " + calculateCartTotal());
    }
}

public class ProductCartMain {
	public static void main(String[] args) {

        Cart cart = new Cart(5);

        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Mouse", 500, 2);

        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.displayCartItems();

        p2.setQuantity(3);
        cart.removeProduct(101);

        cart.displayCartItems();
    }
}

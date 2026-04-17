package com.Assessment14;

import java.util.*;

abstract class Product {
	int productId;
	String productName;
	double price;

	Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	int getProductId() {
		return productId;
	}

	String getProductName() {
		return productName;
	}

	double getPrice() {
		return price;
	}

	abstract void displayInfo();

}

class ElectronicProduct extends Product {

	int warrantyPeriod;

	ElectronicProduct(int productId, String productName, double price, int warrantyPeriod) {
		super(productId, productName, price);
		this.warrantyPeriod = warrantyPeriod;
	}

	int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	void displayInfo() {
		System.out.println("ELECTRONIC PRODUCT INFORMATION:");
		System.out.println("ProductId : " + productId);
		System.out.println("ProductName : " + productName);
		System.out.println("Price :$" + price);
		System.out.println("Warranty Period : " + warrantyPeriod + " Months");
		System.out.println();
	}

}

class ClothingProduct extends Product {

	String size;
	String material;

	ClothingProduct(int productId, String productName, double price, String size, String material) {
		super(productId, productName, price);
		this.size = size;
		this.material = material;
	}

	String getSize() {
		return size;
	}

	String getMaterial() {
		return material;
	}

	void displayInfo() {
		System.out.println("CLOTHING PRODUCT INFORMATION:");
		System.out.println("Productid : " + productId);
		System.out.println("ProductName : " + productName);
		System.out.println("Price :$" + price);
		System.out.println("Size : " + size);
		System.out.println("Material : " + material);
		System.out.println();
	}
}
public class Problem2_ProductAndItsType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Select Product Type");
		System.out.println("1. Electronic Product");
		System.out.println("2. Clothing Product");

		System.out.print("Enter your choice: ");
		int choice = scan.nextInt();

		if (choice == 1) {
			System.out.print("Enter Product ID: ");
			int id = scan.nextInt();
			scan.nextLine();

			System.out.print("Enter Product Name: ");
			String name = scan.nextLine();

			System.out.print("Enter Price: ");
			double price = scan.nextDouble();
			System.out.print("Enter Warranty Period: ");
			int warranty = scan.nextInt();

			ElectronicProduct ep = new ElectronicProduct(id, name, price, warranty);
			ep.displayInfo();

		}

		else if (choice == 2) {

			System.out.print("Enter Product ID: ");
			int id = scan.nextInt();
			scan.nextLine();

			System.out.print("Enter Product Name: ");
			String name = scan.nextLine();

			System.out.print("Enter Price: ");
			double price = scan.nextDouble();
			scan.nextLine();

			System.out.print("Enter Size: ");
			String size = scan.nextLine();

			System.out.print("Enter Material: ");
			String material = scan.nextLine();

			ClothingProduct cp = new ClothingProduct(id, name, price, size, material);
			cp.displayInfo();
		}

	}

}


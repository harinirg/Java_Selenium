package com.handsOn2;
import java.util.*;
public class M1SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scan = new Scanner(System.in);

		        System.out.print("Enter number of elements: ");
		        int n = scan.nextInt();

		        int[] arr = new int[n];

		        System.out.println("Enter array elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = scan.nextInt();
		        }

		        System.out.print("Enter key to search: ");
		        int key = scan.nextInt();

		        boolean found = false;

		        for (int i = 0; i < n; i++) {
		            if (arr[i] == key) {
		                found = true;
		                break;
		            }
		        }

		        System.out.println(found);
		        scan.close();

	}

}

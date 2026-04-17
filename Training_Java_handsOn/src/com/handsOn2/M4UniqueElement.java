package com.handsOn2;
import java.util.*;
public class M4UniqueElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		int unique[] = new int[n];
		int count = 0;
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < count; j++) {
				if (arr[i] == unique[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				unique[count] = arr[i];
				count++;
			}
		}
		System.out.println("Unique elements are:");
		for (int i = 0; i < count; i++) {
			System.out.print(unique[i] + " ");
		}
		scan.close();
	}

}

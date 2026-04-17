package com.handsOn2;
import java.util.*;
public class E7MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int[] A = new int[n1];
		for (int i = 0; i < n1; i++) {
			A[i] = scan.nextInt();
		}
		int n2 = scan.nextInt();
		int[] B = new int[n2];
		for (int i = 0; i < n2; i++) {
			B[i] = scan.nextInt();
		}
		int[] C = new int[n1 + n2];
		for (int i = 0; i < n1; i++) {
			C[i] = A[i];
		}
		for (int i = 0; i < n2; i++) {
			C[n1 + i] = B[i];
		}
		for (int i = 0; i < n1; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < n2; i++) {
			System.out.print(B[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		}
		scan.close();
	}
}




/*
 * This Illustrate the Jagged Array
 */
package com.Array;
import java.util.*;

public class JaggedArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Rows");
		int a=scanner.nextInt();
		int bookNo[][]=new int[a][];
		for(int i=0;i<a;i++) {
			System.out.println("Enter the Columns");
			int col=scanner.nextInt();
			bookNo[i]=new int[col];
			System.out.println("Enter the element");
			for(int j=0;j<col;j++) {
				bookNo[i][j]=scanner.nextInt();
			}
		}
		System.out.println("2 Dimensional Jagged Array");
		for(int i=0;i<a;i++) {
			for(int j=0;j<bookNo[i].length;j++) {
				System.out.print(bookNo[i][j]+" ");
			}
			System.out.println();	
		}
		scanner.close();
	}
}


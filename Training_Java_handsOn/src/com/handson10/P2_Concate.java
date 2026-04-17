/*
 * This program stores a set of strings and uses an Iterator
 * to display each element. It also concatenates all strings into a single result.
 */
package com.handson10;

import java.util.*;

public class P2_Concate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements? ");
		int n = sc.nextInt();
		sc.nextLine();
		Set<String> s = new LinkedHashSet<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter element: ");
			String value = sc.nextLine();
			s.add(value);
		}
		Iterator<String> it = s.iterator();
		String result = "";
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("Elements in the Set : " + value);
			result = result + value + " ";
		}

		System.out.println("Concatenated result: " + result.trim());

		sc.close();
	}
}

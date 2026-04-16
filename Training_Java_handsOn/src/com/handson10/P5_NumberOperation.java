/**
 * Reads numbers from user, removes duplicates, sorts them,
 * finds average, highest, lowest, and prints odd numbers.
 */

package com.handson10;

import java.util.*;

public class P5_NumberOperation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> set = new TreeSet<>();

		while (true) {
			String input = sc.next();
			if (input.equalsIgnoreCase("done"))
				break;
			set.add(Integer.parseInt(input));
		}

		System.out.println("Sorted unique numbers: " + set);

		double sum = 0;
		for (int num : set) {
			sum += num;
		}

		double avg = sum / set.size();
		System.out.println("Average: " + avg);

		System.out.println("Lowest: " + set.first());
		System.out.println("Highest: " + set.last());

		ArrayList<Integer> oddList = new ArrayList<>();
		for (int num : set) {
			if (num % 2 != 0) {
				oddList.add(num);
			}
		}

		System.out.println("Odd numbers: " + oddList);
	}
} 
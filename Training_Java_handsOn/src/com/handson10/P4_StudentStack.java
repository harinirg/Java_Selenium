/*
 * Reads student names and marks, stores in HashMap.
 * Pushes names with marks > 75 into a stack.
 * Pops and displays stack content.
 */
package com.handson10;
import java.util.*;
public class P4_StudentStack {

	public static void pushToStack(HashMap<String, Integer> map, Stack<String> stack) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 75) {
				stack.push(entry.getKey());
			}
		}
	}

	public static void popAndDisplay(Stack<String> stack) {
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();

		int n = 6;
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int marks = sc.nextInt();
			map.put(name, marks);
		}

		System.out.println("Student Marks in the HashMap: " + map);

		Stack<String> stack = new Stack<>();

		pushToStack(map, stack);

		System.out.println("Student Marks above 75 in the stack:");
		popAndDisplay(stack);
	}
}
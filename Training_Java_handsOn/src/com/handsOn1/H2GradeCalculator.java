/**
 * This program calculates the final grade of students.
 * The final grade is 30% of exercises and 70% of exam
 * if both grades are ≥ 5; otherwise, the minimum is taken.
 *
 * It reads grade pairs continuously until -1 is entered,
 * displays each final grade, and prints the average grade.
 * All grades must be in the range [0, 10].
 */

package com.handsOn1;
import java.util.*;
public class H2GradeCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double exercise, exam, finalGrade;
		double total = 0;
		int count = 0;
		while (true) {
			System.out.print("Enter exercise grade: ");
			exercise = scan.nextDouble();
			System.out.print("Enter exam grade: ");
			exam = scan.nextDouble();
			if (exercise == -1 || exam == -1) {
				break;
			}
			if (exercise < 0 || exercise > 10 || exam < 0 || exam > 10) {
				System.out.println("Invalid grades");
				continue;
			}
			if (exercise >= 5 && exam >= 5) {
				finalGrade = (0.3 * exercise) + (0.7 * exam);
			} else {
				finalGrade = exercise < exam ? exercise : exam;
			}
			System.out.println("Final Grade: " + finalGrade);
			total += finalGrade;
			count++;
		}
		if (count > 0) {
			System.out.println("Average grade of all students: " + (total / count));
		} else {
			System.out.println("No student data entered");
		}
		scan.close();
	}

}

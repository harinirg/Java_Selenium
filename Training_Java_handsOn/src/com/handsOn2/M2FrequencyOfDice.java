/*
 * Roll the dice 100 times and display the frequency of each number rolled using arrays.
 */
package com.handsOn2;
import java.util.*;
public class M2FrequencyOfDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] freq = new int[7];
		System.out.print("Enter number of dice rolls: ");
		int rolls = scan.nextInt();
		System.out.println("Enter dice values (1 to 6):");
		for (int i = 0; i < rolls; i++) {
			int dice = scan.nextInt();
			freq[dice]++;
		}
		for (int i = 1; i <= 6; i++) {
			System.out.println(i + " : " + freq[i]);
		}
		scan.close();
	}

}

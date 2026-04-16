package com.handsOn2;

public class M5RecordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int my_record[] = {10,10,10,10,20,20,20,20,40,40,50,50,30};
		int n = my_record.length;
		int freq[] = new int[n];

		for (int i = 0; i < n; i++) {
			if (freq[i] == -1)
				continue;

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (my_record[i] == my_record[j]) {
					count++;
					freq[j] = -1;
				}
			}
			freq[i] = count;
		}

		System.out.println("Element  Frequency");
		for (int i = 0; i < n; i++) {
			if (freq[i] != -1) {
				System.out.println(my_record[i] + "        " + freq[i]);
			}
		}
	}
}
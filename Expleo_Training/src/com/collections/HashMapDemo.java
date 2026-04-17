/*This example demonstrates the HashMap Class*/
package com.collections;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Double> tm = new HashMap<String, Double>();
		System.out.println("Size of the HasMap is " + tm.size());
		tm.put("John Doe", 4343.43);
		tm.put("Tom Smith", 145.23);
		tm.put("Jane Baker", 1450.78);
		tm.put("Ralph Smith", -18.76);
		System.out.println("Elements in the HashMap " + tm);
		System.out.println("Size of the Hashmap is " + tm.size());
		Set<Map.Entry<String, Double>> set = tm.entrySet();
		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
	}
}

package com.collections;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();
		System.out.println("Size of the vector is"+v.size());
		System.out.println("Initial Capacity: " + v.capacity());
	    v.ensureCapacity(20);
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		System.out.println("Elements in the vector "+v);
		System.out.println("Size of the vector is "+v.size());
		System.out.println("Capacity of the vector: " + v.capacity());
	

	}

}

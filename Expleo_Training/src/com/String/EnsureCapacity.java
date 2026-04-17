package com.String;

public class EnsureCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer(); 
		System.out.println("Initial capacity: "+s1.capacity());
		s1.append("typing 16 letter");
		System.out.println("capacity after typing 16 letter");
		System.out.println("capacity: "+s1.capacity());
		System.out.println("Ensuring capacity to 16");
		s1.ensureCapacity(16); 
		System.out.println("capacity: "+s1.capacity());
		System.out.println("Ensuring capacity to 17");
		s1.ensureCapacity(17);
		System.out.println("capacity: "+s1.capacity());
		System.out.println("Ensuring capacity to 60");
		s1.ensureCapacity(60);
		System.out.println("capacity: "+s1.capacity());

	}

}

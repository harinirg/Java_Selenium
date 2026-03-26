package com.String;

public class StringCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1=new StringBuilder(); 
		System.out.println("s1: "+s1+"  &capacity: "+s1.capacity());
		s1.append("Java");  
		System.out.println("s1: "+s1+"  & capacity: "+s1.capacity());
		s1.append(" is my favouritelanguage");  
		System.out.println("s1: "+s1+"  capacity: "+s1.capacity());

	}

}

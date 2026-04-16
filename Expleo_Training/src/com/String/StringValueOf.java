package com.String;

public class StringValueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray= {'J', 'a', 'v', 'a'};        
		Object obj = new Integer(456);                 
		System.out.println("Boolean string: " + String.valueOf(true));   
		System.out.println("Character string: " + String.valueOf('A'));        
		System.out.println("Integer string: " + String.valueOf(123));        
		System.out.println("Double string: " + String.valueOf(3.14));           
		System.out.println("Character array string: " +String.valueOf(charArray));        
		System.out.println("Object string: " + String.valueOf(obj).toString());   

	}

}

package com.polymorphism;
class Adder {
static int add(int a, int b) { 
return a + b; 
}
static double add(double a, double b) { 
return a + b;   
}   
}


public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Output of Method Add(int,int) -"+Adder.add(5, 6)); 
		System.out.println("Output of Method Add(double,double) -"+Adder.add(12.8, 9.2));

	}

}

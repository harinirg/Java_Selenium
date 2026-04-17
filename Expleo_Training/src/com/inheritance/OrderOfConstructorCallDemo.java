package com.inheritance;
class Base {
Base( ){
System.out.println("Inside Base’s Constructor");
} 
} 
class Derived1 extends Base {
Derived1( ){
System.out.println("Inside Derived1’s Constructor"); 
} 
}
class Derived2 extends Derived1 {
Derived2(){
System.out.println("Inside Derived2’s Constructor"); 
} 
}
public class OrderOfConstructorCallDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived2 obj = new Derived2();

	}

}

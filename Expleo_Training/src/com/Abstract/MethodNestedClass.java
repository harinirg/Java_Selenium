package com.Abstract;
class Outer1{
	int value=56;
	public void outerClassMethod() {
		System.out.println("Inside the Method of Outer class");
		class Inner1{
			public void innerClassMethod() {
				System.out.println("Inside the Method of Inner class");
				System.out.println("Value:"+value);
			}
		}
		Inner1 inner=new Inner1();
		inner.innerClassMethod();
	}
}
public class MethodNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 outer=new Outer1();
		outer.outerClassMethod();

	}

}

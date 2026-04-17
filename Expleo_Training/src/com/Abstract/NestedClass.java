package com.Abstract;

//import com.Abstract.OuterClass.InnerClass;

class OuterClass{
	int age=18;
	public void checkAge() {
		System.out.println("In CheckAge() Method call");	
		}
	class InnerClass{
		public void show() {
			System.out.println("In show() Method call");
		}
	}

}
public class NestedClass{
	public static void main(String args[]) {
		OuterClass out=new OuterClass();

		System.out.println("Outer class Method call:");
		out.checkAge();
		OuterClass.InnerClass in=out.new InnerClass();
		System.out.println("Inner class Method call:");
		in.show();
		
	}
}

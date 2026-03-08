package com.Abstract;
class Person{
	int age=21;
	static int weight=45;
	static class Gender{
		void nonStaticDisplay() {
			System.out.println("In NonStatic Display Method");
			System.out.println("Weight Value:"+weight);
		}
		static void staticDisplay() {
			System.out.println("In static Display Method");
			System.out.println("Weight value:"+weight);
		}
	}
	Gender gen=new Gender();
	
}
public class StaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.gen.nonStaticDisplay();
		Person.Gender.staticDisplay();
		

	}

}

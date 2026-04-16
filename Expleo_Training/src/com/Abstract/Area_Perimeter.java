package com.Abstract;

abstract class Shape{
	void draw() {
		System.out.println("drawing...");
	}
	abstract void area();
	abstract void perimeter();
}
class Rectangle extends Shape{
	private int length,breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void area() {
		System.out.println("The area of rectangle: "+length*breadth);
	}
	void perimeter() {
		System.out.println("The perimeter of rectangle: "+(2*(length+breadth)));
	}
}
class Square extends Shape{
	private int side;
	Square(int side){
		this.side=side;
	}
	void area() {
		System.out.println("The area of sqaure: "+side*side);
	}
	void perimeter() {
		System.out.println("The Perimeter of Square: "+4*side);
	}
	
}
class Circle extends Shape{
	final double Pi=3.14;
	private int radius;
	Circle(int radius){
		this.radius=radius;
	}
	void area() {
		System.out.println("The area of Circle: "+Pi*radius*radius);
	}
	void perimeter() {
		System.out.println("The perimeter of Circle: "+2*Pi*radius);
	}
}
public class Area_Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s=new Rectangle(3,6);
		s.area();
		s.perimeter();
		s=new Square(6);
		s.area();
		s.perimeter();
		s=new Circle(3);
		s.area();
		s.perimeter();
	}

}

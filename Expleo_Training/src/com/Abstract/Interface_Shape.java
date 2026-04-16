package com.Abstract;

interface Shape1{
	double DEFAULT_VALUE=1.0;
	double calculateArea();
	double calculatePerimeter();
	default String getDescription() {
		return "A shape with unspecified dimensions";
	}
}
abstract class Circle1 implements Shape1{
	private double radius;
	public Circle1(double radius) {
		this.radius=radius;
	}
	public Circle1() {
		radius=DEFAULT_VALUE;
	}
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
	public String getDescription() {
		return "A circle with radius"+radius;
	}
}
class Rectangle1 implements Shape1{
	private double length;
	private double width;
	public Rectangle1(double length,double width) {
		this.length=length;
		this.width=width;
	}
	public Rectangle1() {
		this.length=DEFAULT_VALUE;
		this.width=DEFAULT_VALUE;
	}
	public double calculateArea() {
		return length*width;
	}
	public double calculatePerimeter() {
		return 2*(length+width);
	}
	public String getDescription() {
		return "A rectangle with length "+length+" and width "+width;
	}
}

public class Interface_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 r=new Rectangle1(3,4);
		System.out.println(r.getDescription());
		System.out.println("Area: " + r.calculateArea());
		System.out.println("Perimeter: " + r.calculatePerimeter());



	}

}

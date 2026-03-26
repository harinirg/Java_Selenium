package com.handson6;

import java.util.*;

interface Movable {
	void moveUp();

	void moveDown();

	void moveLeft();

	void moveRight();
}

class MovablePoint implements Movable {
	int x;
	int y;
	int xSpeed;
	int ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public void moveUp() {
		y += ySpeed;
	}

	public void moveDown() {
		y -= ySpeed;
	}

	public void moveLeft() {
		x -= xSpeed;
	}

	public void moveRight() {
		x += xSpeed;
	}

	public String toString() {
		return "(" + x + "," + y + ") speed=(" + xSpeed + "," + ySpeed + ")";
	}
}

class MovableCircle implements Movable {

	int radius;
	MovablePoint center;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	public void moveUp() {
		center.moveUp();
	}

	public void moveDown() {
		center.moveDown();
	}

	public void moveLeft() {
		center.moveLeft();
	}

	public void moveRight() {
		center.moveRight();
	}

	public String toString() {
		return center.toString() + " radius=" + radius;
	}
}

public class MovableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x coordinate:");
		int x = sc.nextInt();

		System.out.println("Enter y coordinate:");
		int y = sc.nextInt();

		System.out.println("Enter x speed:");
		int xs = sc.nextInt();

		System.out.println("Enter y speed:");
		int ys = sc.nextInt();

		System.out.println("Enter radius:");
		int r = sc.nextInt();

		MovableCircle c = new MovableCircle(x, y, xs, ys, r);

		System.out.println("\nOriginal Circle:");
		System.out.println(c);

		c.moveUp();
		c.moveRight();
		System.out.println("\nAfter Moving:");
		System.out.println(c);

		sc.close();

	}

}

package com.org.tav.day1;

import java.util.Scanner;

class Rectangle{
	private float length;
	private float width;
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	
}

class Circle{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double d) {
		this.radius = d;
	}
}

public class Mensuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		double ra = sc.nextInt();
		Circle c=new Circle();
		c.setRadius(Math.PI*ra*ra);
		System.out.println("Area of Circle " + c.getRadius());
		c.setRadius(2*Math.PI*ra);
		System.out.println("Circumference of Circle " + c.getRadius());
		
		Scanner rc = new Scanner(System.in);
		System.out.println("Enter length: ");
		float len = rc.nextInt();
		float wid=sc.nextInt();
		Rectangle r=new Rectangle();
		r.setLength(len*wid);
		System.out.println("Area of Rectangle " + r.getLength());
		r.setWidth(2*(len+wid));
		System.out.println("Perimeter of Rectangle " + r.getWidth());
		

	}

}

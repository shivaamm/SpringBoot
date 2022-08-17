package com.org.tav.day1;
 
public class StaticTest {
	

	static int x=45;
	int y=32;
	
	static {
		System.out.println("Loding before loading main method");
	}
	
	void display() {
		System.out.println("Display of Static");
		System.out.println(x);
		System.out.println(y);
	}
	
	static void show() {
		System.out.println("Display of Non-Static");
		System.out.println(x);
		//System.out.println(y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest ob=new StaticTest();
		ob.display();
		show();
	}

}

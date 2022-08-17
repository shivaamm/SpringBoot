package com.org.tav.day2;

public class Developed {
	
	public Developed() {
		super();
		System.out.println("Const Chaining");
	}
	
	public Developed(int num) {
		this("Java",2022);
	}

	Developed(String str, int num){
		this();
		System.out.println("Year print");
	}
	
	void disp() {
		System.out.println("oops");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developed c=new Developed();
		c.disp();
	}

}

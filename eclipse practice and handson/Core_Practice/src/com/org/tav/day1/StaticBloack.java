package com.org.tav.day1;

public class StaticBloack {
	//instance block
	{
		System.out.println("Instance Block 1");
	}
	{
		System.out.println("Instance Block 2");
	}
	
	//static block
	static{
		System.out.println("Static Block 1");
	}
	static{
		System.out.println("Static Block 2");
	}
	StaticBloack(){
		System.out.println("0 arg const");
	}
	StaticBloack(int a){
		System.out.println("1 arg const");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StaticBloack();
		new StaticBloack(20);

	}

}

/*

Q. Class name - Sqaure and cube
2 - static variable 
define sqaure and cube and result the square root and cube root (separate two functions with variable statics)

*/


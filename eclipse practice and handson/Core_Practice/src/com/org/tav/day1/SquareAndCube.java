package com.org.tav.day1;

import java.util.Scanner;

public class SquareAndCube {
	
	static double square;
	static double cube;
	
	static void sq(double a){
		System.out.println(Math.sqrt(a));
	}
	static void cu(double b){
		System.out.println(Math.cbrt(b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		double num=sc.nextInt();
		SquareAndCube ob=new SquareAndCube();
		sq(num);
		cu(num);
	}

}

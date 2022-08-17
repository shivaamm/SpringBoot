package com.org.tav.day1;

class Student1{
	static String name(String n)
	{
		return n;
	}
	static int rollno(int r) {
		return r;
	}
	static int std(int s)
	{
		return s;
	}
}

public class StudentTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=Student1.name("Shivam");
		int rollno=Student1.rollno(100);
		int std=Student1.std(7);
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(std);
	}

}

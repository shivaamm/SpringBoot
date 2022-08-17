package com.org.tav.day1;

public class Student {
	
	//instance variable
	String StuName; String Stn; int Marks;
	static String SchoolName="DIS";
	static String Section="RED";
	
	//one way to create a para const
	public Student (String StuName, String Stn, int Marks) {
		System.out.println("First way to create const");
		this.StuName = StuName;
		this.Stn = Stn;
		this.Marks = Marks;
	}
	
	//second way
//	public Student(String n, String add, int a) {
//		StuName =n;
//		Marks=a;
//		Stn=add;
//	}
	
	//static method
	static void change()
	{
		Section = "Brown";
	}
	
	void display() {
		System.out.println("Name: " + StuName +" Age: "+Marks + " Address: "+ Stn + " Section " + Section + " " + SchoolName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("Shivam", "Btech", 21);
		Student.change();
		s1.display();
		Student s2=new Student("asdv","afva",32);
		Student s3=new Student("abcfjav","afvsavfa",31);
		Student s4=new Student("gbgf","svv",42);
		Student s5=new Student("svgb","ksmk",13);
		
		s2.display();
		s3.display();
		s4.display();
		s5.display();
	}

}

package com.org.tav.day2;

class School{
	String name;int roll;int id;

	School(String schoolname){
		this(2);
		System.out.println("Stu Data");
	}
	
	School(int s){
		System.out.println("DPS");
	}
	
	School(String name, int roll, int id){
		this("DPS");
		this.name=name;
		this.roll=roll;
		this.id=id;
	}
	void disp() {
		System.out.println(name + " " + roll + " " + id);
	}
}

public class Student extends School {
	
	public Student(){
		super("ABC",2,2002);
	}
	Student(String schoolname){
		this();
	}
	void show() {
		System.out.println("OOps");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("DIS");
		s.disp();
	}
	
}



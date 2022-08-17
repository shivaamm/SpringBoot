package com.org.tav.day1;

import java.util.Scanner;

public class StudentClass {
	
	String name;
	
	public StudentClass() {
		name = "unknown";
	}
//	public StudentClass(String str) {
//		name = str;
//	}
	void display() {
		System.out.println(name);
	}
	 void display(String str) {
		 name = str;
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String ss=sc.next();
		StudentClass ob=new StudentClass();
		ob.display();
		ob.display(ss);

	}

}





//public class Student {
//    private String name;
//
//    public Student() {
//        name = "Unknown";
//    }
//
//    public Student(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        Student[] students = {new Student(), new Student("Tom"), new Student("Sam"), new Student()};
//        for (Student student : students) {
//            System.out.println(student.getName());
//        }
//    }
//}
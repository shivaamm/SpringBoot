package com.org.tav.day1;

public class Person {
	
	String name; int age; String address;
	
	Person(){
		name = "Shivam";
		age = 21;
		address = "Delhi";
	}
	
	void show() {
		System.out.println("Name: " + name +" Age: "+age + " Address: "+ address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person obj = new Person(); // default constructor
		
		obj.show();
 
	}

}

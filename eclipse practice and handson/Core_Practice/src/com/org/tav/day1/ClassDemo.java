package com.org.tav.day1;

public class ClassDemo {
	
	//instance variable
	public int year_of_joining;
	
	public String empName;
	
	
	//method
	public void display() {
		String policy="Company Policies";
		System.out.println("Employee Name: "+empName + " He joined the org in: "+ year_of_joining + " He must follow the" + policy);
	}

	//constructor
	public ClassDemo(int year_of_joining, String empName) {
		super();
		this.year_of_joining = year_of_joining;
		this.empName = empName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassDemo emp1 = new ClassDemo(2022, "Shivam Singhal");
		ClassDemo emp2 = new ClassDemo(2022, "Reethik Prasad");
				
		System.out.println(" Hello Everyone!!!");
		emp1.display();
		emp2.display();
	}

}

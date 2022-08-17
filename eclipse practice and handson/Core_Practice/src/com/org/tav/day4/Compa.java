package com.org.tav.day4;
import java.util.Arrays;

 class Employee implements Comparable<Employee> {
	
	  private String name;
	  private double salary;
	 
	public Employee(String name, double salary){
	  this.name = name;
	  this.salary = salary;
	  }
	public String getName() {
	   return name;
	 }
	public double getSalary() {
	   return salary;
	 }
	public void hikeSalary(double byPercent){
	  double hike = salary * byPercent / 100;
	   salary += hike;
	 }
	@Override
	public int compareTo(Employee emp)
	{
	 if (salary < emp.salary) return -1;
	 if (salary > emp.salary) return 1;
	   return 0;
	  }
	}

	public class Compa {
	public static void main(String[] args) 
	{
	// Create an array. 
	Employee[] staff = new Employee[3];
		staff[0] = new Employee("Harry", 30000);
		staff[1] = new Employee("Carl", 70000);
		staff[2] = new Employee("Tony", 39000);
		
	  Arrays.sort(staff); 
	
	  for (Employee e : staff)
	     System.out.println("name: " + e.getName() +", "+"salary = " + e.getSalary());
	    }
	}
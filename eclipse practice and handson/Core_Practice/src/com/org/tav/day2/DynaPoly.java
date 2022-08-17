package com.org.tav.day2;

 class Base 
{ 
  void m1() 
  { 
    System.out.println("m1-Base"); 
  } 
} 
 class Derived extends Base 
{ 
  void m1() 
  { 
    System.out.println("m1-Derived"); 
  } 
} 
public class DynaPoly 
{ 
  public static void main(String [] args) 
  { 
     Derived d = new Derived(); 
      d.m1(); // Calling m1() method of class Derived. 
    
    Base b = new Base(); 
       b.m1(); // Calling m1() method of class Base. 
   } 
 }
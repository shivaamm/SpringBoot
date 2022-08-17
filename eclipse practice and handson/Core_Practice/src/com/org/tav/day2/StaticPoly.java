package com.org.tav.day2;

public class StaticPoly 
{ 
  void sum(int x, int y) 
  { 
    int s = x + y; 
    System.out.println("Sum of two numbers: " +s); 
  } 
void sum(int x, int y, int z) 
{ 
   int s = x + y + z; 
   System.out.println("Sum of three numbers: " +s); 
  } 
public static void main(String[] args) 
{ 
  StaticPoly obj = new StaticPoly(); 
   obj.sum(20, 10); 
   obj.sum(10, 20, 30); 
  } 
}

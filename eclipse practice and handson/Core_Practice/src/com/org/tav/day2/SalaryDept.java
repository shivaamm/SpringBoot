package com.org.tav.day2;

class salary extends Thread{
    String dep;
    int hra;
    int basic;
    public salary(String dep,int hra,int basic)
    {
        this.dep=dep;
        this.hra=hra;
        this.basic=basic;
    }
      synchronized public void run()
      {
          System.out.println("Calculating the salary for "+dep);
          System.out.println(hra*2+basic);
      }
}
public class SalaryDept {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        salary s1=new salary("HR",25000,30000);
        salary s2=new salary("Services",35000,20000);
        salary s3=new salary("Testing",35000,15000);
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s2);
        Thread t3=new Thread(s3);
        t1.start();
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(1000);
        t3.start();

    }

}

//import java.util.*;
//
//class SalaryDept{
//
//	static int computeSalary(int basic, String cat)
//	{
//	    double allowance;
//	    double hra, da, pf;
//	
//	    hra = 0.2 * basic;
//	    da = 0.5 * basic;
//	    pf = 0.11 * basic;
//	
//	    if (cat == "A")
//	    {
//	        allowance = 35000.0;
//	    }
//	    else if (cat == "B")
//	    {
//	        allowance = 25000.0;
//	    }
//	    else
//	    {
//	        allowance = 15000.0;
//	    }
//	    double gross;
//	
//	    gross = Math.round(basic + hra + da + allowance - pf);
//	
//	    return (int)gross;
//	}
//
//
//public static void main (String[] args)
//	{
////	    String hr,service,testing;
//	    String user;
//	    Scanner sc= new Scanner(System.in);
//	    System.out.println("Emp Dept: ");
//	    user=sc.next();
//	
//	    if(user.equals("hr"))
//	    {
//	        System.out.println(computeSalary(1000, "A"));
//	        System.out.println("Find your salary");
//	    }
//	    else if (user.equals("services"))
//	    {
//	        System.out.println(computeSalary(2000, "B"));
//	        System.out.println("Find your salary");
//
//	    }else if(user.equals("testing"))
//	    {
//	        System.out.println(computeSalary(1500, "C"));
//	        System.out.println("Find your salary");
//
//	    }
//	    else {
//	        System.out.println("Incorrect dept");
//        	System.out.println("No dept No salary");
//	    }
//	
//	}
//}
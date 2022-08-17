package com.org.tav.day2;

import java.util.Scanner;

public class Employee {

        int id;
        String name;
        int salary;
        String dept;

        public Employee(int id,String name,int salary,String dept) {
            this.id=id;
            this.name=name;
            this.salary=salary;
            this.dept=dept;
            // TODO Auto-generated constructor stub
        }
        public void display() {
            System.out.println("Employee id: "+id+" Name: "+name+" Salary: "+salary+" Department "+dept);
        }

    public static void main(String[] args) {
        Employee[] obj = new Employee[6];

        Scanner sc = new Scanner(System.in);
        obj[0]= new Employee(1,"Shivam",500000,"sdlvslsdv");
        obj[1]= new Employee(2,"sdfbfga",80000,"afghje");
        obj[2]= new Employee(3,"segj",20000,"jhgfds");
        obj[3]= new Employee(4,"uyjthfrse",600000,"werty");
        obj[4]= new Employee(5,"kjhgfd",89000,"wertyu");
        obj[5]= new Employee(6,"sdfgh",700000,"weryu");

        for(int i=0;i<6;i++) {
            obj[i].display();
        }

        int att=0;
        int mid=0;
        int def =0;
        for(int i=0;i<6;i++) {
            if(obj[i].dept=="Attack") {
                att+=1;
            }
            if(obj[i].dept=="Midfield") {
                mid+=1;
            }
            if(obj[i].dept=="Defence") {
                def+=1;
            }
        }

        if(att>def && att>mid) {
            System.out.println("The dept with max Emps is Attack");
        }
        else if(mid>att && mid<def) {
            System.out.println("The dept with max Emps is Midfield");
        }
        else if(def>att && def>mid) {
            System.out.println("The dept with max Emps is Defence");
        }

        int search;
        System.out.println("Enter the id to search ");
        search =sc.nextInt();

        for(int i=0;i<6;i++) {
            if(obj[i].id==search) {
                obj[i].display();
            }
            }

        }

    }
package com.org.tav.day2;

import java.util.Scanner;

public class EmpIncrement {
        int  id;
        String name;
        String skill;
        int exp;

        public EmpIncrement(int id,String name,String skill,int exp) {
            this.id=id;
            this.name=name;
            this.skill=skill;
            this.exp=exp;

        }

        public void display() {
            System.out.println("emp id: "+id+" Name: "+name+" Skill: "+skill+" Years of exp: "+exp);
        }

    public static void main(String[] args) {

        EmpIncrement[] ep = new EmpIncrement[6];
        ep[0]= new EmpIncrement(1,"Shivam","Java",7);
        ep[1]= new EmpIncrement(2,"Reethik","C",11);
        ep[2]= new EmpIncrement(3,"Harsh","CPP",9);
        ep[3]= new EmpIncrement(4,"Arsh","Java",10);
        ep[4]= new EmpIncrement(5,"Kapil","Java",8);
        

        for(int i=0;i<5;i++) {
            ep[i].display();
        }
        System.out.println("Emps with increment");
        int java = 0;        
        for(int i=0;i<5;i++) {    
            if(ep[i].skill=="Java") {
                java+=1;
                ep[i].display();
            }
        }
       
        System.out.println("The totlal no of employees recieving a Raise is :"+ java);

    }

}
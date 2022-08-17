package com.org.tav.day2;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double[] arr = new double[5];

        Scanner sc = new Scanner (System.in);

        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<5;i++)
        {
            if(arr[i]>=50000.0 && arr[i]<=100000.0) {
                arr[i]=arr[i]+(arr[i]*0.20);
            }
            else if(arr[i]>=100001.0 && arr[i]<=500000.0) {
                arr[i]=arr[i]+(arr[i]*0.25);
            }
            else if(arr[i]>=500001.0 && arr[i]<=1000000.0) {
                arr[i]=arr[i]+(arr[i]*0.30);
            }

    }
        double temp = 0;
        for(int i=0; i < 5; i++){  
            for(int j=1; j < (5-i); j++){  
                     if(arr[j-1] > arr[j]){    
                            temp = arr[j-1];  
                            arr[j-1] = arr[j];  
                            arr[j] = temp;  
                    }  

            }  
    }
        System.out.println("Max Salary is: "+arr[4]);
        System.out.println("Min Salary is: "+arr[0]);
        System.out.println("Sorted Salary after hike:");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }

    }

}
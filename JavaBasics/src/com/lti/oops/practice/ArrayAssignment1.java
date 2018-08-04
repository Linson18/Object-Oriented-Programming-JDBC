package com.lti.oops.practice;

import java.util.Scanner;

public class ArrayAssignment1 {
 
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of students ");
     int n = sc.nextInt();
     System.out.println("No. of students :" + n);  
     int total_marks[] = new int[n];
     int sub1[] = new int[n];
     int sub2[] = new int[n];
     int fees[] = new int[n];
     String name [] = new String[n];  
     for(int i = 0; i < n; i++)
		{    	
    	 System.out.println("Enter name : ");
    	 name[i] = sc.next();
         System.out.println("enter marks for  subject 1:  ");        
         
         sub1[i] = sc.nextInt();
         
         System.out.println("enter marks for  subject 2:  ");  
         sub2[i] = sc.nextInt();
         System.out.println("enter student fees:  ");
         
    	 fees[i] = sc.nextInt();
    	 
    	 
		}
     
     System.out.println("Details :");
     
		for(int j = 0; j < n; j++)
		{
			total_marks [j] = sub1[j] + sub2[j];
			System.out.println("Name: " + name[j] + " Total Marks i.e. sub 1 and sub 2: "  + total_marks[j] +  " Fees:" + fees[j] );
		}
	}

}

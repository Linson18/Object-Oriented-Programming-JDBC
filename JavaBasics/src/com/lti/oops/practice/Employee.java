package com.lti.oops.practice;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter user designation");
		String designation = sc.next();
		String d1 = designation.toLowerCase();
		
		int basicSal=0;
		float travelAllow = 0.00f;
		float hrAllow=0.0f;
		float taxDeduct=0.1f;
		float salary=0.00f;
		
		if(d1.equals("manager"))
		{
			basicSal=20000;
			travelAllow=0.05f;
			hrAllow=0.1f;	
			salary=basicSal+basicSal*travelAllow+hrAllow*basicSal;
			System.out.println("Total salary is "+salary);
		
		}
		
		else if(d1.equals("analyst"))
		{
			basicSal=15000;
			travelAllow=0.05f;
			hrAllow=0.2f;	
			salary=basicSal+basicSal*travelAllow+hrAllow*basicSal;
			System.out.println("Total salary is "+salary);
		}
		
		else
		{
			System.out.println("Enter correct designation");
		}	
		
	}

}

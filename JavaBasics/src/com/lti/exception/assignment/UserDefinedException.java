package com.lti.exception.assignment;

import java.util.Scanner;

class OwnException extends Exception{
	public OwnException(float salary) {
		System.out.println("You have entered an incorrect value: "+ salary);
	}

}
public class UserDefinedException{
	public static void main(String[] args) throws OwnException {
		Scanner sc=new Scanner(System.in);
		float salary;
		System.out.println("Please enter trainee salary");
		salary=sc.nextFloat();
		if(salary>=20000 && salary<=50000 )
		{
			System.out.println("You have entered salary as: "+ salary);
		}
		else
		{
			throw new OwnException(salary);
		}
		
	}
}
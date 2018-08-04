package com.lti.training.basics;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.println("Add two nos");

		System.out.println("Enter name");
		String name = obj.next();
		int x, y, res;

		x = obj.nextInt();
		y = obj.nextInt();

		res = x + y;
		System.out.println(" name:" + name);

		System.out.println("enter 2 numbers ");
		

		System.out.println("Addition of " + x + " and " + y + " is " + res);
	}
}

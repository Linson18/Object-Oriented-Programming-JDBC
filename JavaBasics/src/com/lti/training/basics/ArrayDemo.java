package com.lti.training.basics;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		//int sum = 0;
		int arr[] = new int[5];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		for(int i = 0; i < 5; i++)
		{
		
		arr[i] = sc.nextInt();
		}
		System.out.println("The entered values are :");
		for(int i = 0; i < 5; i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}

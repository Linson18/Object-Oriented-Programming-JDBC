package com.lti.exceptiondemo;

public class ExceptionHandling {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		int arr[] =new int [3];
		try {j = 500/i;
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		
		 
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			
		
			System.out.println("j " + j);
			
		}
	
	}

}

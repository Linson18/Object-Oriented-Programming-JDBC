package com.lti.training.basics;

import java.util.Scanner;

public class TestMaths {

	public static void main(String[] args) {
		System.out.println("Add two nos");
		int x, y, res=0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();

		Maths m = new Maths();
        res = m.doSum(x, y);
		System.out.println(res);
		
		
		System.out.println("Closing Scanner...");
	      sc.close();
	      System.out.println("Scanner Closed.");
	}

}

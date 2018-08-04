package com.lti.oops.basics;

public class TestProduct {

	public static void main(String[] args) {

		ProductDemo p1=new ProductDemo();
		p1.setId(111);
		p1.setName("pen");
		p1.setCost(100.00f);
		System.out.println("bill for product 1");
		p1.CalcBill(5);
		
		System.out.println(p1);
		
		ProductDemo p2= new ProductDemo(102, "pencil", 10);
		p2.CalcBill(10);
		System.out.println(p2);
	
		ProductDemo p3= new ProductDemo();
		System.out.println(p3);
		
		
	}

}

package com.lti.oopsdemo.entity;

public class TestInheritence {

	public static void main(String[] args) {
       Person p1=new Person(101,"Jay");
       p1.calc();
       PermanentEmployee p=new PermanentEmployee(102,"Vijay",30000);
       p.calc();
       System.out.println(p1);
       System.out.println(p);
	}

}

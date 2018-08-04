package com.lti.oops.basics;

public class TestStudent {

	public static void main(String[] args) {
 
		/*Student s1  = new Student();
		s1.setStuId(101);
		s1.setStuname("dikshita");
		s1.setFees(13500.55f);
		
		System.out.println(s1);*/
		
		
		/*
		System.out.println("Details: ");
		System.out.println(s1.getStuId());
		System.out.println(s1.getStuname());
		System.out.println(s1.getFees());*/
		
		
		/*Student s2  = new Student();
		s2.setStuId(102);
		s2.setStuname("purvi");
		s2.setFees(354545.5454f);
		System.out.println(s2);*/
		
		
		
		/*
		System.out.println("Details: ");
		System.out.println(s2.getStuId());
		System.out.println(s2.getStuname());
		System.out.println(s2.getFees());*/
		
		Student s3  = new Student(103, "Linson Miranda", 52656.545f);
		System.out.println(s3);
		
		Student s4  = new Student(103, "Linson Miranda");
		System.out.println(s4);
		
		Student s5  = new Student();
		System.out.println(s5);
		
		Student s6  = new Student(103, 898945.565f);
		System.out.println(s6);
		
	}

}

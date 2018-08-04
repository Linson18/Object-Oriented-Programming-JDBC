package com.lti.oops.basics;

public class TestEmployee {

	public static void main(String[] args) {

		Employee obj=new Employee();
		obj.setId(100);
		obj.setFirst_name("Purvi");
		obj.setLast_name("Shah");
	    obj.setSalary(4500.22f);
	   
	    
	    System.out.println(obj.toString());
	    obj.toString();
	    
	}

}

package com.lti.shopping.client;

//import java.util.List.*;

import com.lti.shopping.entity.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Employee> myList = new ArrayList<Employee>();

		Employee emp_Peter = new Employee(101, "Peter", 20, 2000000);
		myList.add(emp_Peter);

		Employee emp_Tony = new Employee(1796, "Tony", 50, 300000);
		myList.add(emp_Tony);

		Employee emp_Bruce = new Employee(482, "Bruce", 46, 10000);
		myList.add(emp_Bruce);

		Employee emp_Richards = new Employee(293, "Richards", 35, 62812);
		myList.add(emp_Richards);

		Employee emp_Eddie = new Employee(943, "Eddie", 28, 450000);
		myList.add(emp_Eddie);

		System.out.println("***Before Sorting*****");
		for(Employee e: myList)
		{
			System.out.println(e.toString());
		}
		
		Employee temp = new Employee();
		
		Collections.sort(myList);
		
		System.out.println("***After Sorting*****");//used for natural sort
		for(Employee e: myList)
		{
			System.out.println(e.toString());
		}
		
		Collections.sort(myList,temp);
		
		System.out.println("***After Sorting by salary*****");
		for(Employee e: myList)
		{
			System.out.println(e.toString());
		}

	}

}

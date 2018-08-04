package com.lti.shopping.entity;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {

	private int id;
	private String name;
	private int age, sal;

	public Employee(int id, String name, int age, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}

	public Employee() {
		super();
		this.id = 0;
		this.name = "XXXX";
		this.age = 0;
		this.sal = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public int compareTo(Employee o) {// method used for object sorting
		if (o.getId() == this.id) {
			return 0;
		} else if (o.getId() > this.id) {//for ascending. for descending: else if (o.getId() < this.id)
			return -1;
		} else {
			return 1;

		}

	}

	

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getSal() > o2.getSal()) {
			return 1;
		}
		if (o1.getSal() < o2.getSal()) {
			return -1;
		}

		return 0;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
}

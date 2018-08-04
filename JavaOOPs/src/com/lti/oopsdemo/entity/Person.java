package com.lti.oopsdemo.entity;

public class Person {
	int personId;
	String personName;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	public Person() {
		super();
	}
	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}
	
	public void calc() {
		
	    System.out.println("in parent class" );	
	}

}

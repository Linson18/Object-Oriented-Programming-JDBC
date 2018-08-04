package com.lti.oopsdemo.entity;

public class PermanentEmployee extends Person{
	int sal;

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	

	public PermanentEmployee(int personId, String personName, int sal) {
		super(personId, personName);
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [sal=" + sal + ", getPersonId()=" + getPersonId() + ", getPersonName()="
				+ getPersonName() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
 public void calc() {
	sal = 1000;
    System.out.println("Permananet employee sal is " + sal);	
}

}

package com.lti.oops.basics;

public class Student {

	public Student(int stuId, String stuname, float fees) {
		super();
		this.stuId = stuId;
		this.stuname = stuname;
		this.fees = fees;
	}
	
	public Student(int stuId, String stuname) {
		super();
		this.stuId = stuId;
		this.stuname = stuname;
	}

	public Student(int stuId, float fees) {
		super();
		this.stuId = stuId;
		this.fees = fees;
	}

	public Student() {
		super();
		this.stuId = 0000;
		this.stuname = "XXXX";
		this.fees = 00000.00f;
	}

	int stuId;
	String stuname;
	float fees;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuname=" + stuname + ", fees=" + fees + "]";
	}
	

}

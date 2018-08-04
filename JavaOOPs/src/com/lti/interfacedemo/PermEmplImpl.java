package com.lti.interfacedemo;

public class PermEmplImpl implements IPerson {
	int empId;
	double BasicSal;
	
	@Override
	public void calc() {

		double Tsal = BasicSal + 10000;
		System.out.println("Total Salary " + Tsal);
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getBasicSal() {
		return BasicSal;
	}
	public void setBasicSal(double basicSal) {
		BasicSal = basicSal;
	}
	@Override
	public String toString() {
		return "PermEmplImpl [empId=" + empId + ", BasicSal=" + BasicSal + "]";
	}
	

}

package com.lti.interfacedemo;

public class TempEmplImpl implements IPerson {
	int tempId;
	double salPerDay;
	int noDays;
	
	
	public int getTempId() {
		return tempId;
	}


	public void setTempId(int tempId) {
		this.tempId = tempId;
	}


	public double getSalPerDay() {
		return salPerDay;
	}


	public void setSalPerDay(double salPerDay) {
		this.salPerDay = salPerDay;
	}


	public int getNoDays() {
		return noDays;
	}


	public void setNoDays(int noDays) {
		this.noDays = noDays;
	}


	@Override
	public void calc() {
		double Tsal = salPerDay * noDays;
		System.out.println("Total Salary " + Tsal);
	}


	@Override
	public String toString() {
		return "TempEmplImpl [tempId=" + tempId + ", salPerDay=" + salPerDay + ", noDays=" + noDays + "]";
	}

}

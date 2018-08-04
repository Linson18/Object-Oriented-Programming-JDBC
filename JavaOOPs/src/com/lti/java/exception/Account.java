package com.lti.java.exception;

public class Account {
	
	double bankAcNo;
	String custName,bankName,panNo;
	float balance;
	
	public Account(double bankAcNo, String custName, float balance,String panNo) {
		this.bankName = "Standard Chartered Bank";
		this.bankAcNo = bankAcNo;
		this.custName = custName;
		this.balance = balance;
		this.panNo = panNo;
	}

	public Account() {
		super();
		this.bankName = "Standard Chartered Bank";
		this.bankAcNo = 000000000;
		this.custName = "********";
		this.balance = 0;
		this.panNo = "AAAAA23467";
	}

	@Override
	public String toString() {
		return "Account [bankAcNo=" + bankAcNo + ", custName=" + custName + ", bankName=" + bankName + ", balance="
				+ balance + "]";
	}
	
}

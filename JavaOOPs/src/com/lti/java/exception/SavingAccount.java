package com.lti.java.exception;

import java.util.Scanner;

public class SavingAccount extends Account {
	
	public SavingAccount(double bankAcNo, String custName, float balance, String panNo) {
		super(bankAcNo, custName, balance, panNo);
	}
	
	
	public void withdraw(int amt) throws CustomExp {
		if (balance > amt) {
			balance= balance - amt;
			System.out.println("Your balance is :" + balance);
		} else {
			throw new CustomExp("You have insufficient funds!!!Your balance is :" + balance);
		}
	}

	public void checkBalance() {
		System.out.println("Your new balance is: " + balance);
	}

	public void deposit(int amt) {
		balance = balance + amt;
		checkBalance();
	}


}

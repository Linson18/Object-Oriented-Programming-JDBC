package com.lti.java.exception;

import java.util.Random;
import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) throws CustomExp {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		SavingAccount user1 = null;
		int choice = 5;
		System.out.println("*****Standard Chartered Bank******");
		System.out.println("Hello User. What do you want to do today?");
		do {

			System.out.print("\n1.Add Account\n2.Withdraw\n3.Deposit\n4.Check Balance\n5.Exit\nEnter your choice....");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				double bankAcNo = rand.nextInt(214762347);
				String custName, panNo;
				int withdrawAmt, depositAmt;
				float balance;

				System.out.println("Enter your name");
				custName = sc.next().toLowerCase();
				System.out.println("Enter your Pan no");
				panNo = sc.next();
				System.out.println("Enter amount to deposit(min 1000)");
				balance = sc.nextFloat();
				
				user1 = new SavingAccount(bankAcNo, custName, balance, panNo);
				
				if (balance > 1000 && !custName.isEmpty() && panNo != null) 
				{
					System.out.println("Account created successfully");
					System.out.println("Your details are:");
					System.out.println(user1.toString());
					break;
				} else {
					System.out.println("Incorrect details entered. Account creation unsuccessful");
					break;
				}

			case 2:
				try {
					System.out.println("Enter amount you wish to withdraw:");
					withdrawAmt = sc.nextInt();
					user1.withdraw(withdrawAmt);
				} catch (CustomExp e) {
					// e.printStackTrace();
					System.out.println(e.toString());
				}
				break;

			case 3:
				System.out.println("Enter amount you wish to deposit:");
				depositAmt = sc.nextInt();
				user1.deposit(depositAmt);
				break;

			case 4:
				user1.checkBalance();
				break;

			case 5:

				break;
			default:
				System.out.println("Enter a valid number!!!");
			}
		} while (choice != 5);

	}

}

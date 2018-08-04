package com.lti.oops.practice;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) throws Exception{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please enter number of  coins");
		int coins = sc.nextInt();
		for(int i=coins;i>=0;i--)
		{
			if(i==0)
			{
				System.out.println("Game Over.Better luck next time:(");
				break;
			}
			System.out.println("Please enter a 3-digit number(000 to 999)");
			String keypadInput = sc.next();
			int number = Integer.parseInt(keypadInput);
			if(number>=0 && number <1000) 
				{
					int luckyNumber = rand.nextInt(1000);
					if(luckyNumber<100)
					{
						luckyNumber = rand.nextInt(1000);
					}
					System.out.println(luckyNumber);
					if(number==luckyNumber) 
					{
						System.out.println("Youre a Winner!!!");
						System.out.println("Do yo u wish to continue?[y/n]");
						String choice = sc.next();
						if(choice.equals("y"))
							continue;
						else
							break;
					}
					else
					{
						System.out.println("you have "+ (i-1) + " coins left");
					}
				}
				else
				{
				System.out.println("please enter correct number in range of 000-999");
				i++;
				}
				
	}
		
	}
}

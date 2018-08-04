package com.lti.shopping.client;

import java.util.ArrayList;
import java.util.Scanner;

import com.lti.shopping.entity.Product;
import com.lti.shopping.services.IProduct;
import com.lti.shopping.services.ImplProduct;

public class UserApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Product> list = new ArrayList(); // global list variable intialized @ class level so that it can be accessed by all methods
		IProduct service = new ImplProduct();// global service variable intialized @ class level so that it can be accessed by all methods
		//service is equivalent to waiter
		String ans;
		int no;

		do {
			System.out.println("Dmart services");
			System.out.println("1.Add product");
			System.out.println("2.Display all products");
			System.out.println("3.Search for a product");
			System.out.println("4.Delete a product");
			System.out.println("5.Exit");
			System.out.println("Please enter your choice: ");
			no = sc.nextInt();
			switch (no) {
			case 1:
				System.out.println("Enter product id");
				int UIproductId = sc.nextInt();
				System.out.println("Enter product name");
				String UIproductName=sc.next();
				System.out.println("Enter product cost");
				float UIproductCost=sc.nextFloat();
				
				Product p1 = new Product(UIproductId,UIproductName,UIproductCost);//Product object created
				
				list=service.addProducts(p1);//create variable of type arrayList<Product>
				System.out.println(list);
				break;
				
			case 2:
				list = service.showAllProducts();
				System.out.println(list);
				break;
			case 3:
				System.out.println("case 3");
				break;
			case 4:
				System.out.println("case 4");
				break;
			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("enter proper choice");
				break;
			}
			
			System.out.println("Do you want to continue?[yes/no]");
			ans = sc.next();
			
		} while (ans.equals("yes")||ans.equals("y")||ans.equals("Yes"));
	}

}

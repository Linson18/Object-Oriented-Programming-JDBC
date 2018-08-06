//user menu to the hotel

package com.lti.Shopping.user;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.lti.Shopping.dao.IProductDao;
import com.lti.Shopping.dao.ProductDaoImpl;
import com.lti.Shopping.entity.Product;
import com.lti.Shopping.service.ImplProductService;
import com.lti.Shopping.service.ProductService;

public class TestProduct {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> myList,searchList;
		String ans;
		int no;
		int id;
		String name;
		double cost;
		ProductService service = new ImplProductService();// creating waiter object

		do {
			System.out.println("***** PDL Services****");
			System.out.println("1.Display all products");
			System.out.println("2. Add a new product");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("5.Search");
			System.out.println("6.Exit");
			System.out.println("Please enter your choice: ");
			no = sc.nextInt();
			switch (no) {
			case 1:
				// IProductDao DaoService = new ProductDaoImpl();// create an superclass
				// reference object of the
				// DaoService.getProductDetails();

				myList = service.getProductDetails();// seeing menu and placing order
				System.out.println(myList);
				break;

			case 2:
				// take input using scanner
				// create product p1 object and call addProduct method
				System.out.println("Enter product id");
				 id = sc.nextInt();
				System.out.println("Enter product name");
				 name = sc.next();
				System.out.println("Enter product cost");
				 cost = sc.nextFloat();

				Product newproduct = new Product(id, name, cost);
				service.addProduct(newproduct);
				break;

			case 3:
				System.out.println("Enter product id to be updated");
				id = sc.nextInt();
				System.out.println("Enter updated product cost ");
				 cost = sc.nextDouble();
				
				Product p1 = new Product(id, cost);
				service.updateProduct(p1);

				break;
			case 4:
				System.out.println("Enter product id to be deleted");
				id=sc.nextInt();
				Product p2= new Product(id);
				service.deleteProduct(p2);
				

				break;
			case 5:
				System.out.println("Enter product id you want to search");
				id=sc.nextInt();
				Product p3= new Product(id);
				searchList=service.searchProduct(p3);
				System.out.println(searchList);
				break;
			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("enter proper choice");
				break;
			}

			System.out.println("Do you want to continue?[yes/no]");
			ans = sc.next();

		} while (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y"));

	}

}

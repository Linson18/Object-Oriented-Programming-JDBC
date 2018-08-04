package com.lti.shopping.services;

import java.util.ArrayList;

import com.lti.shopping.entity.Product;

public class ImplProduct implements IProduct {// the actual preparation of the dish

	ArrayList<Product> myList= new ArrayList();// global myList variable intialized so that it can be accessed by all methods
	
	@Override
	public ArrayList<Product> addProducts(Product p) {//define a ArrayList<Product> method 
		myList.add(p);
		//System.out.println(myList);
		return myList;
	}

	@Override
	public ArrayList<Product> showAllProducts() {
		
		return myList;
	}

}

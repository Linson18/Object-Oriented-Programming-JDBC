package com.lti.shopping.services;

import java.util.ArrayList;

import com.lti.shopping.entity.Product;

public interface IProduct {//menu card
	
	public  ArrayList<Product> addProducts(Product p);
	public  ArrayList<Product> showAllProducts();
	
}

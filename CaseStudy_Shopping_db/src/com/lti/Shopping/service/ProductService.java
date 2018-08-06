package com.lti.Shopping.service;

import java.util.ArrayList;

import com.lti.Shopping.entity.Product;

public interface ProductService {
	
	public ArrayList<Product> getProductDetails();
	public void addProduct(Product p);
	public void updateProduct(Product p);
	public void deleteProduct(Product p);
	public ArrayList<Product> searchProduct(Product p);
	
}

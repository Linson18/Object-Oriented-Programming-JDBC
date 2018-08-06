package com.lti.Shopping.dao;

import java.util.ArrayList;

import com.lti.Shopping.entity.Product;

public interface IProductDao {
	
	abstract ArrayList<Product> getProductDetails();
	abstract void addProduct(Product p);
	void updateProduct(Product p);
	void deleteProduct(Product p);
	abstract ArrayList<Product> searchProduct(Product p);
	
	//abstract  getProductDetails();

}

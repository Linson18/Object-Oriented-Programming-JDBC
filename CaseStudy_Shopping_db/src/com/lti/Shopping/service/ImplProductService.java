package com.lti.Shopping.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.lti.Shopping.dao.IProductDao;
import com.lti.Shopping.dao.ProductDaoImpl;
import com.lti.Shopping.entity.Product;

public class ImplProductService implements ProductService {

	private IProductDao DaoService;// object of daointerface created- chef

	public ImplProductService() throws SQLException {
		DaoService = new ProductDaoImpl();//calling chef
	}

	@Override
	public ArrayList<Product> getProductDetails() {
		return DaoService.getProductDetails();//daoService is the chef
	}

	@Override
	public void addProduct(Product p) {
		DaoService.addProduct(p);
	}

	@Override
	public void updateProduct(Product p) {
		DaoService.updateProduct(p);
		
	}

	@Override
	public void deleteProduct(Product p) {
		DaoService.deleteProduct(p);
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Product> searchProduct(Product p) {
		return DaoService.searchProduct(p);
		// TODO Auto-generated method stub
		
	}

}

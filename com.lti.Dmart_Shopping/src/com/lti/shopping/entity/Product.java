package com.lti.shopping.entity;

public class Product {
	int productId;
	String productName;
	float productCost;

//	public int getProductId() {
//		return productId;
//	}
//
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}
//
//	public String getProductName() {
//		return productName;
//	}
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//	public float getProductCost() {
//		return productCost;
//	}
//
//	public void setProductCost(float productCost) {
//		this.productCost = productCost;
//	}

	public Product(int productId, String productName, float productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ "]";
	}

}

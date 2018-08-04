package com.lti.oops.basics;

public class ProductDemo {

 int id;
 String name;
 float cost,bill=0;
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}


public float CalcBill(int quantity) {
	 bill = cost * quantity;
	 return bill ;
}

public ProductDemo() {
	super();
	this.id = 000;
	this.name = "xxx";
	this.cost = 00.00f;

	
}
public ProductDemo(int id, String name, float cost) {
	super();
	this.id = id;
	this.name = name;
	this.cost = cost;
}
@Override
public String toString() {
	return "ProductDemo [id=" + id + ", name=" + name + ", cost=" + cost +  ", bill=" + bill + "]";
}
 
	
	
}

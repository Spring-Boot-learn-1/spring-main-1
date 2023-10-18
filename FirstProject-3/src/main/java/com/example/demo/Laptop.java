package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
private int productid;
private String company;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public void compile() {
	System.out.println("inside laptop");
}
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alien {
private int aid;
private String aname;
private int temp;
@Autowired
private Laptop lap1;
Alien(int num){
	this.temp=num;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public Laptop getLap1() {
	return lap1;
}
public void setLap1(Laptop lap1) {
	this.lap1 = lap1;
}
public void getlap(){
	this.lap1.compile();
	System.out.print("value is "+this.temp+"\n");
}
}

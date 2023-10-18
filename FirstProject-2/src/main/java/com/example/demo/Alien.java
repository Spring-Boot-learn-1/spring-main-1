package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alien {
private int aid;
private String aname;
private int rnum;
Alien(int temp){
	this.rnum=temp;
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
public void inshow() {
	System.out.println("in different show "+this.rnum);
}
}

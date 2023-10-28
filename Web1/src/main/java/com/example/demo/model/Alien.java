package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Alien {
@Id
private int aid;
private String aname;
private String alaptop;
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
public String getAlaptop() {
	return alaptop;
}
public void setAlaptop(String alaptop) {
	this.alaptop = alaptop;
}
@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + ", alaptop=" + alaptop + "]";
}

}

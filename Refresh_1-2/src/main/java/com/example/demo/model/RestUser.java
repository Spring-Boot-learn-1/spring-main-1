package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class RestUser {
@Id
private int id;
private String name;
private String password;
private String histexteditor;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getHistexteditor() {
	return histexteditor;
}
public void setHistexteditor(String histexteditor) {
	this.histexteditor = histexteditor;
}
@Override
public String toString() {
	return "RestUser [id=" + id + ", name=" + name + ", password=" + password + ", histexteditor=" + histexteditor
			+ "]";
}

}

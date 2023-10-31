package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class JavaUser {
	@Id
private int id;
private String name;
private String laptop;
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
public String getLaptop() {
	return laptop;
}
public void setLaptop(String laptop) {
	this.laptop = laptop;
}
@Override
public String toString() {
	return "JavaUser [id=" + id + ", name=" + name + ", laptop=" + laptop + "]\n";
}

}

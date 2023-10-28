package com.example.demo;

public class Alien {
private String name;
private int id;
private String laptop;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLaptop() {
	return laptop;
}
public void setLaptop(String laptop) {
	this.laptop = laptop;
}
@Override
public String toString() {
	return "Alien [name=" + name + ", id=" + id + ", laptop=" + laptop + "]\n";
}

}

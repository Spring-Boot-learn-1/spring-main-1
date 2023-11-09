package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class SimpleUser {
@Id
private int id;
private String name;
private String mail_id;
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
public String getMail_id() {
	return mail_id;
}
public void setMail_id(String mail_id) {
	this.mail_id = mail_id;
}
@Override
public String toString() {
	return "SimpleUser [id=" + id + ", name=" + name + ", mail_id=" + mail_id + "]";
}

}

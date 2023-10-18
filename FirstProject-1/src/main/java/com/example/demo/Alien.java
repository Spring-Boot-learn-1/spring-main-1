package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int aid;
	private String aname;
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
	public void show() {
		System.out.println("in show of alien\n");
	}
}

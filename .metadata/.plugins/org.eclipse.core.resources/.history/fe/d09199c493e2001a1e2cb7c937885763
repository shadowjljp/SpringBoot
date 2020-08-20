package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component   //make this spring bean
//@Scope(value="prototype")  //Not singleton anymore
public class Alien {
	private int aid;
	private String aname;
	private String tech;
	@Autowired   //searches by type
	@Qualifier("lap1")  //search by name
	private Labtop labtop;
	
	
	public Labtop getLabtop() {
		return labtop;
	}
	public void setLabtop(Labtop labtop) {
		this.labtop = labtop;
	}
	public Alien() {
		super();
		System.out.println("Alen object only");
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
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public void show() {
		System.out.println("in alien class");
		
		labtop.compile();
	}
}

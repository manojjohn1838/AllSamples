package com.chainsys.model;

public class User {

	private String name;
	private long mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, long mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", mobile=" + mobile + "]";
	}
	
	
}

package com.nagarro.userlistRest.models;

public class User {

	private String name;
	private Integer age;
	private String address;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, Integer age, String address) {
		
		this.name = name;
		this.age = age;
		this.address = address;
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}

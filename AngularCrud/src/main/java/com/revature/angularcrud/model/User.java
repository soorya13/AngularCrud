package com.revature.angularcrud.model;

public class User {
	private long id;
	private String username;
	private String address;
	private String email;
	
	public User(long id, String username, String address, String email) {
		
		this.id = id;
		this.username = username;
		this.address = address;
		this.email = email;
	}
	public User() {
	
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}

package com.programming.techie.OnlineLibrary.dto;

public class RegisterRequest {
	private String userName;
	private String password; 
	private String email;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUser_name(String userName) {
		this.userName = userName;
	}
	
	
}

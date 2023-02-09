package com.wissen.response;

public class UserResponse {

	private String status;
	private String message;
	private String username;
	private String emailaddress;
	private String password;
	private String address;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public UserResponse(String status, String message, String username, String emailaddress, String password,
			String address) {
	
		this.status = status;
		this.message = message;
		this.username = username;
		this.emailaddress = emailaddress;
		this.password = password;
		this.address = address;
	}
	public UserResponse() {
	
	}
	
	
	
}

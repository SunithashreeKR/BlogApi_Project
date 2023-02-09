package com.wissen.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class UserDto {

	@NotEmpty
	private String username;
	
	//email should have valid format
	//email should not be empty or null
	@NotEmpty
	@Email
	private String emailaddress;
	
	@NotEmpty
	@Size(min = 8,message = "Password should  have at least 8 character")
	private String password;
	
	@NotEmpty
	@Size(min = 4,message = "Address should have at least 4 character")
	private String address;
	
	
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
	public UserDto(String username, String emailaddress, String password, String address) {
		
		this.username = username;
		this.emailaddress = emailaddress;
		this.password = password;
		this.address = address;
	}
	public UserDto() {

	}
	
}
	
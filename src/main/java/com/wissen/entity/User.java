package com.wissen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "u_id")
	private Integer id;
	
	@Column(name = "u_name")
	private String username;
	
	@Column(name = "u_email_address")
	private String emailaddress;
	
	@Column(name = "u_password")
	private String password;
	
	@Column(name = "u_address")
	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public User(Integer id, String username, String emailaddress, String password, String address) {

		this.id = id;
		this.username = username;
		this.emailaddress = emailaddress;
		this.password = password;
		this.address = address;
	}

	public User() {
	
	}
	
	
}

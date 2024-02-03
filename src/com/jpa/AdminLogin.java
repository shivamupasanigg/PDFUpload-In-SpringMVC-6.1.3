package com.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ADMINLOGIN")
public class AdminLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String Password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	@Override
	public String toString() {
		return "AdminLogin [id=" + id + ", username=" + username + ", Password=" + Password + "]";
	}
	
	
	public AdminLogin(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		Password = password;
	}
	public AdminLogin() {
	}
	
	
	
	

}

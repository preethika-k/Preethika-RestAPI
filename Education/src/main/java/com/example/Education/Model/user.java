package com.example.Education.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {
	
	@Id
	private int id;
	private String email;
	private String password;
	private String username;
	private String mobilenumber;
	private String userrole;
	
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", email=" + email + ", password=" + password + ", username=" + username
				+ ", mobilenumber=" + mobilenumber + ", userrole=" + userrole + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	

}
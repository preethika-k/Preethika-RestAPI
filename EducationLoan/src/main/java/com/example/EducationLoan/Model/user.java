package com.example.EducationLoan.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loan")
public class user {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable=false,unique=true,name="email")
	private String email;
	private String password;
	private String username;
	@Column(nullable=false,unique=true,name="mobile_number")
	private String mobileNumber;
	private String userRole;
	
	public user() {}

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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public user(int id, String email, String password, String username, String mobileNumber, String userRole) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", email=" + email + ", password=" + password + ", username=" + username
				+ ", mobileNumber=" + mobileNumber + ", userRole=" + userRole + "]";
	}
	
	

}
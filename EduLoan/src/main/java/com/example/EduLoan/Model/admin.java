package com.example.EduLoan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class admin {
	@Id
	private String email;
	private String password;
	private String mobilenumber;
	private String userrole;
	
	public admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "admin [email=" + email + ", password=" + password + ", mobilenumber=" + mobilenumber + ", userrole="
				+ userrole + "]";
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

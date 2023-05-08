package com.example.user1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Model")
public class MuseumModel {
@Id
 private int mid;
 private String mname;
 private String mlocation;
 private String theme;
 private int obj;
 private String staff;
 private int checkin;
 private int checkout;
 
@Override
public String toString() {
	return "MuseumModel [mid=" + mid + ", mname=" + mname + ", mlocation=" + mlocation + ", theme=" + theme + ", obj="
			+ obj + ", staff=" + staff + ", checkin=" + checkin + ", checkout=" + checkout + "]";
}
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getMlocation() {
	return mlocation;
}
public void setMlocation(String mlocation) {
	this.mlocation = mlocation;
}
public String getTheme() {
	return theme;
}
public void setTheme(String theme) {
	this.theme = theme;
}
public int getObj() {
	return obj;
}
public void setObj(int obj) {
	this.obj = obj;
}
public String getStaff() {
	return staff;
}
public void setStaff(String staff) {
	this.staff = staff;
}
public int getCheckin() {
	return checkin;
}
public void setCheckin(int checkin) {
	this.checkin = checkin;
}
public int getCheckout() {
	return checkout;
}
public void setCheckout(int checkout) {
	this.checkout = checkout;
}
 
}

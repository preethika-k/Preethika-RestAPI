package com.example.review.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mus")
public class MuseumModel {
@Id
  private String m_name;
  private int m_id;
  private int m_checkin;
  private int m_chectout;
  private int no_of_obj;
  private String staff;
  
public String getM_name() {
	return m_name;
}
public void setM_name(String m_name) {
	this.m_name = m_name;
}
public int getM_id() {
	return m_id;
}
public void setM_id(int m_id) {
	this.m_id = m_id;
}
public int getM_checkin() {
	return m_checkin;
}
public void setM_checkin(int m_checkin) {
	this.m_checkin = m_checkin;
}
public int getM_chectout() {
	return m_chectout;
}
public void setM_chectout(int m_chectout) {
	this.m_chectout = m_chectout;
}
public int getNo_of_obj() {
	return no_of_obj;
}
public void setNo_of_obj(int no_of_obj) {
	this.no_of_obj = no_of_obj;
}
public String getStaff() {
	return staff;
}
public void setStaff(String staff) {
	this.staff = staff;
}
  
}

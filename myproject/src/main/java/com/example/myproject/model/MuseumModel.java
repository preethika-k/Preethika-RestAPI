package com.example.myproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MuseumModel {
 @Id
 
 private  String m_name;
 private  int m_id;
 private  String m_category;
 private int m_checkin;
 private int m_checkout;
 private int m_things;
 private String s_name;
 private String m_count;
 private String o_desc;
 private String exhibit_id;
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
public String getM_category() {
	return m_category;
}
public void setM_category(String m_category) {
	this.m_category = m_category;
}
public int getM_checkin() {
	return m_checkin;
}
public void setM_checkin(int m_checkin) {
	this.m_checkin = m_checkin;
}
public int getM_checkout() {
	return m_checkout;
}
public void setM_checkout(int m_checkout) {
	this.m_checkout = m_checkout;
}
public int getM_things() {
	return m_things;
}
public void setM_things(int m_things) {
	this.m_things = m_things;
}
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
public String getM_count() {
	return m_count;
}
public void setM_count(String m_count) {
	this.m_count = m_count;
}
public String getO_desc() {
	return o_desc;
}
public void setO_desc(String o_desc) {
	this.o_desc = o_desc;
}
public String getExhibit_id() {
	return exhibit_id;
}
public void setExhibit_id(String exhibit_id) {
	this.exhibit_id = exhibit_id;
}

}

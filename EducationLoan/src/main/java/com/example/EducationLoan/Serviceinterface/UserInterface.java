package com.example.EducationLoan.Serviceinterface;

import java.util.List;

import com.example.EducationLoan.Model.user;

public interface UserInterface {

	public List<user> getAllUser();
	public user postAllUser(user id);
	public user putAllUser(user id);
	public void deleteAllUser(int id);
}

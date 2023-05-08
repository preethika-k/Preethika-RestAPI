package com.example.EduLoan.ServiceInterface;

import java.util.List;

import com.example.EduLoan.Model.user;

public interface userInterface {

	public List<user> getAllUser();
	public user postAllUser(user id);
	public user putAllUser(user id);
	public void deleteAllUser(int id);
}

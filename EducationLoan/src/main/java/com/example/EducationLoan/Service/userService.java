package com.example.EducationLoan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationLoan.Model.user;
import com.example.EducationLoan.Repo.userRepo;
import com.example.EducationLoan.Serviceinterface.UserInterface;

@Service
public class userService implements UserInterface {
     @Autowired
	public userRepo ur;
	@Override
	public List<user> getAllUser() {
		
		return ur.findAll();
	}

	@Override
	public user postAllUser(user id) {
		
		return ur.save(id);
	}

	@Override
	public user putAllUser(user id) {
		
		return ur.save(id);
	}

	@Override
	public void deleteAllUser(int id) {
	
		ur.deleteById(id);
	}

}

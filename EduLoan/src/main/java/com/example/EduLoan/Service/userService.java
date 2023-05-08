package com.example.EduLoan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EduLoan.Model.user;
import com.example.EduLoan.Repo.userRepo;
import com.example.EduLoan.ServiceInterface.userInterface;
@Service
public class userService implements userInterface {

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

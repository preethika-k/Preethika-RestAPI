package com.example.user1.service;
import com.example.user1.model.museumlogmodel;
import com.example.user1.repository.museumlogrepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class museumlogservice {

@Autowired
private museumlogrepo lrepo;
public String checkLogin(String username,String psword)
{
	museumlogmodel user= lrepo.findByUsername(username);
	if(user==null)
	{
		return "No user found";
	}
	else
	{
		if(user.getPassword().equals(psword))
		{
			return "Login Succesfull";
		}
		else
		{
			return "Login Failed";
		}
	}
} 
public museumlogmodel addUser(museumlogmodel cl)
{
	return lrepo.save(cl);
}
public List<museumlogmodel> getUser()
{
	return lrepo.findAll();
}
public museumlogmodel putUser(museumlogmodel cl)
{
	return lrepo.save(cl);
}
}

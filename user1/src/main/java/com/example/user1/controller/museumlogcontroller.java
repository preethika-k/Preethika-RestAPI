package com.example.user1.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.user1.service.museumlogservice;
import com.example.user1.model.museumlogmodel;
@RestController
@RequestMapping("/user")
public class museumlogcontroller {
	
	@Autowired
	private museumlogservice lser;
	
	@PostMapping("/log")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=lser.checkLogin(username,password);
		return result;
	}
	@PutMapping("/put")
	public museumlogmodel putUser(@RequestBody museumlogmodel cl)
	{
		return lser.putUser(cl);
	}
	@PostMapping("/adduser")
	public museumlogmodel AddUser(@RequestBody museumlogmodel cl)
	{
		return lser.addUser(cl);
	}
	
	@GetMapping("/showall")
	public List<museumlogmodel> listAll()
	{
		return lser.getUser();
	}
}

package com.example.EducationLoan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EducationLoan.Model.user;
import com.example.EducationLoan.Service.userService;

@RestController
public class userController {
	@Autowired
    public userService us;
	
	@GetMapping("/getuser")
	public List<user> getDetails()
	{
	     return us.getAllUser();	
	}
	@PostMapping("/postuser")
	public user postDetails(@RequestBody user id)
	{
		return us.postAllUser(id);
	}
	@PutMapping("/putuser")
	public user putDetails(@RequestBody user id)
	{
		return us.putAllUser(id);
	}
	@DeleteMapping("/deleteuser")
	public String deleteDetails(@RequestBody int id)
	{
		us.deleteAllUser(id);
		return "deleted";
	}


}

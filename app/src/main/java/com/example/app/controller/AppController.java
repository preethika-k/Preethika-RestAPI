package com.example.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	
	
	@GetMapping("/view")
	public String view(@RequestParam String username)
	{
		return "The username is "+username;
	}
	@GetMapping("/check")
	public String see(@RequestParam String name,@RequestParam String pass)
	{
		if(name.equals("preethi") && pass.equals("2003"))
				{
			         return "Login successfull";
				}
		else
		{
			return "Login failed";
		}
	}
}

	//public String cba(@PathVariable{"username"} String username)
	//{
		//return "The username is "+username;
	//}



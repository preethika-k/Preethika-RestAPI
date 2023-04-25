package com.example.trail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TrailController {

	@ResponseBody
	@RequestMapping(value="/apple",method=RequestMethod.GET)
	public String fruit()
	{
		return "I am an apple";
	}
	@ResponseBody
	@RequestMapping(value="/potato",method=RequestMethod.GET)
	public String vegetable()
	{
		return "I am potato";
	}
}

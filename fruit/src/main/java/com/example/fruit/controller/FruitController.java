package com.example.fruit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController {

	@GetMapping("/abc")
	public String mango()
	{
		return "I like mango fruit";
	}
}

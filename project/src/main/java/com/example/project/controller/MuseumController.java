package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.MuseumModel;
import com.example.project.service.MuseumService;

@RestController
public class MuseumController {

	@Autowired
	public MuseumService mser;
	@PostMapping("/post")
	public MuseumModel addDetails(@RequestBody MuseumModel obj2)
	{
		return mser.saveInfo(obj2);
	}
}

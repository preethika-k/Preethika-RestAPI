package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.Person;
import com.example.app.service.PersonService;

@RestController
public class PersonController {

	@Autowired
     PersonService serobj;
	@PostMapping("/postperson")
	public Person add(@RequestBody Person sname)
	{
		return serobj.addPerson(sname);
	}
	@GetMapping("/getperson")
	public List<Person> get()
	{
		return serobj.getPerson();
	}
}

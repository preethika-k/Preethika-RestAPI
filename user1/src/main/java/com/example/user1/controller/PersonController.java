package com.example.user1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.user1.model.Person;
import com.example.user1.service.PersonService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class PersonController {
  @Autowired
  PersonService serobj;
  @Operation(summary = "post all the students")
  @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Museum data deleted successfully"),
  @ApiResponse(responseCode = "401", description = "Invalid credentials"),
  @ApiResponse(responseCode = "404", description = "Path not found") })

	@PostMapping("/postperson1")
	public Person add(@RequestBody Person sname)
	{
		return serobj.addPerson(sname);
	}
  @Operation(summary = "Get all the students")
  @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Museum data deleted successfully"),
  @ApiResponse(responseCode = "401", description = "Invalid credentials"),
  @ApiResponse(responseCode = "404", description = "Path not found") })

	@GetMapping("/getperson1")
	public List<Person> get()
	{
		return serobj.getPerson();
	}
}

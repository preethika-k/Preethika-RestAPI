package com.example.review.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.review.Service.MuseumService;
import com.example.review.model.MuseumModel;

@RestController
public class MuseumController {
	@Autowired
	public MuseumService reobj;
	
	@PostMapping("/post")
	public MuseumModel addDetails(@RequestBody MuseumModel obj2)
	{
		return reobj.saveInfo(obj2);
	}
	
	@GetMapping("/get")
	public List<MuseumModel>getDetails()
	{
		return reobj.getInfo();
	}
	
	@PutMapping("/put")
	public MuseumModel display(@RequestBody MuseumModel obj3)
	{
		return reobj.UpdateInfo(obj3);
	}
	@DeleteMapping("/delete/{m_id}")
	public String delete(@PathVariable int m_id)
	{
		reobj.DeleteInfo(m_id);
		return "m_id "+m_id+" is deleted from List";
	}
	
	
	
	

}

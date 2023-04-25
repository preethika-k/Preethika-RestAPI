package com.example.review1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.review1.model.MuseumModel;
import com.example.review1.service.MuseumService;

@RestController
public class MuseumController {
 @Autowired
 public MuseumService serobj;
 
 @PostMapping("/post")
 public MuseumModel addDetails(@RequestBody MuseumModel obj2)
 {
	 return serobj.saveInfo(obj2);
 }
 
 @GetMapping("/get")
 public List<MuseumModel> getDetails()
 {
	 return serobj.getInfo();
 }
 @PutMapping("/put")
 public MuseumModel display(@RequestBody MuseumModel obj3)
 {
	 return serobj.UpdateInfo(obj3);
 }
 @DeleteMapping("/delete/{m_id}")
 public String deleteDetails(@PathVariable int m_id)
 {
	 serobj.DeleteInfo(m_id);
	 return "m_id "+m_id+" is deleted completely";
 }
}

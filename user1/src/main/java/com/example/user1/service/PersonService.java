package com.example.user1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user1.model.Person;
import com.example.user1.repository.Personrepo;

@Service
public class PersonService {
     @Autowired
     Personrepo repobj;
     
     //post
 	public Person addPerson(Person sname) {
 		
 		return repobj.save(sname);
 	}

 	//get
 	public List<Person> getPerson() {
 	
 		return repobj.findAll();
 	}
}

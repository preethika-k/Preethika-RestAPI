package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.Person;
import com.example.app.repository.Personrepo;
@Service
public class PersonService {
   @Autowired
    Personrepo repobj;
   
	public Person addPerson(Person sname) {
		
		return repobj.save(sname);
	}

	public List<Person> getPerson() {
	
		return repobj.findAll();
	}

}

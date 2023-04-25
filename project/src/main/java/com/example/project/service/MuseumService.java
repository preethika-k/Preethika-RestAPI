package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.MuseumModel;
import com.example.project.repository.MuseumRepository;

@Service
public class MuseumService {

	@Autowired
	public MuseumRepository mrep;
	//post
	public MuseumModel saveInfo(MuseumModel obj1)
	{
		return mrep.Save;
	}
}

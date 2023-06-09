package com.example.review.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.review.Repo.MuseumRepo;
import com.example.review.model.MuseumModel;

@Service
public class MuseumService {
	@Autowired
	public MuseumRepo serobj;
	
	//post
	public MuseumModel saveInfo(@RequestBody MuseumModel obj1)
	{
		return serobj.save(obj1);
	}
	
	//get
	public List<MuseumModel> getInfo()
	{
		return serobj.findAll();
	}
	
	//put
	public MuseumModel UpdateInfo(MuseumModel in)
	{
		return serobj.saveAndFlush(in);
	}
	//delete
	public void DeleteInfo(int out)
	{
		serobj.deleteById(out);
	}

}

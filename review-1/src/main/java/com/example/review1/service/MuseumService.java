package com.example.review1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.review1.model.MuseumModel;
import com.example.review1.repository.MuseumRepository;

@Service
public class MuseumService {
    @Autowired
    public MuseumRepository repobj;
    //post
    public MuseumModel saveInfo(@RequestBody MuseumModel obj1)
    {
    	return repobj.save(obj1);
    }
    //Get
    public  List<MuseumModel> getInfo()
    {
    	return repobj.findAll();
    }
    //put
    public MuseumModel UpdateInfo(MuseumModel in)
    {
    	return repobj.saveAndFlush(in);
    }
    //delete
    public void DeleteInfo(int out)
    {
    	repobj.deleteById(out);
    }
    
    
}

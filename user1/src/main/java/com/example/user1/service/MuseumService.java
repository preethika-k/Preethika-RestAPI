package com.example.user1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.user1.model.MuseumModel;
import com.example.user1.repository.MuseumRepository;

import jakarta.transaction.Transactional;

@Service
public class MuseumService {
@Autowired
public MuseumRepository repobj;
//post
public MuseumModel saveInfo(MuseumModel obj1)
{
	   return repobj.save(obj1);
}
//Get
public List<MuseumModel> getInfo()
{
	   return repobj.findAll();
}
//put
public MuseumModel UpdateInfo(MuseumModel in)
{
	   return repobj.saveAndFlush(in);
}
//delete
public String deleteById(int m_id)
{
	   repobj.deleteById(m_id);
	   return "deleted";
}
//sorting
public List<MuseumModel> sortData(String a)
{
	return repobj.findAll(Sort.by(a).descending());
}
//pagination
public List<MuseumModel> pagination(int pageno,int pagesize)
{
	Page<MuseumModel> m=repobj.findAll(PageRequest.of(pageno, pagesize));
	return m.getContent();
}
//sorting and paging
public List<MuseumModel> sortpagination(int pageno, int pagesize, String field) 
{
    Page<MuseumModel> paging=repobj.findAll(PageRequest.of(pageno, pagesize,Sort.by(field)));
	return paging.getContent();
}

//delete query
@Transactional
public int deleteMuseumByMname(String mname)
{
	return repobj.deleteMuseumByMname(mname);
}

//update query
@Transactional
public int updateMuseum(String Theme,String mname)
{
	return repobj.updateMuseum(Theme, mname);
}
//fetch by name start

public List<MuseumModel> fetchMuseumByMnamePrefix(String prefix)
{
	return repobj.findByMnameStartingWith(prefix);
}
//fetch by name end
public List<MuseumModel> fetchMuseumByMnameSuffix(String suffix)
{
	  return repobj.findByMnameEndingWith(suffix);
}
//fetch by theme
public List<MuseumModel> fetchMuseumByTheme(String Theme)
{
	return repobj.findByTheme(Theme);
}
//native
@Transactional
public List<MuseumModel> fetchMuseumByStaff(String Staff)
{
	return repobj.fetchMuseumByStaff(Staff);
}
//select query1
public List<MuseumModel> getMuseumByMname(String mname,String obj)
{
	return repobj.getMuseumByMname(mname, obj);
}
//select query2
public List<MuseumModel> getMuseumByMname(String mname)
{
	return repobj.getMuseumByMname(mname);
}

}

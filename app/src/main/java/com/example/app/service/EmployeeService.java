package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.app.model.Employee;
import com.example.app.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
	public EmployeeRepository repobj;
    
    public Employee saveInfo(@RequestBody Employee obj) {
    	return repobj.save(obj);
    }
    
    public List<Employee> getAllemployee()
    {
    	List<Employee>empList=repobj.findAll();
    	return empList;
    }
    public Employee updateInfo(Employee em)
    {
    	return repobj.saveAndFlush(em);
    }
    public void DeleteInfo(int id)
    {
    	repobj.deleteById(id);
    }
    
}

package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.app.model.Employee;
import com.example.app.repository.EmployeeRepository;

import jakarta.transaction.Transactional;



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
  //sorting
	public List<Employee> sort(String no) {
		
		return repobj.findAll(Sort.by(no));
	}
	//query
	public List<Employee> fetchEmployeeByIdNamePrefix(String prefix)
	{
		return repobj.findByNameStartingWith(prefix);
	}
	public List<Employee> fetchEmployeeByNameSuffix(String suffix)
	{
		  return repobj.findByNameEndingWith(suffix);
	}
	public List<Employee> getEmployeeByDepartment(String dept,String name)
	{
		  return repobj.getEmployeeByDepartment(dept,name);
		  
	}
	
	//delete query
	@Transactional
	public int deleteEmployeeByName(String name)
	{
		return repobj.deleteEmployeeByName(name);
	}
	@Transactional
	public int updateEmployee(String department,String name)
	{
		return repobj.updateEmployee(department, name);
	}
	@Transactional
	public List<Employee> fetchEmployeeByEmail(String email)
	{
		return repobj.fetchEmployeeByEmail(email);
	}
	

	
}

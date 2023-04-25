package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.Employee;
import com.example.app.service.EmployeeService;

@RestController
public class EmployeeController {
     @Autowired   //creating object in simple way
    public EmployeeService serobj;
     
    @PostMapping("/emp1")
    public Employee addDetails(@RequestBody Employee obj1)
    {
    	return serobj.saveInfo(obj1);
    }
    
     @GetMapping("/emp")
     public List<Employee> getAllemployee()
     {
    	 List<Employee>empList=serobj.getAllemployee();
		return empList;
     }
     @PutMapping("/put")
     public Employee display(@RequestBody Employee obj2)
     {
    	 return serobj.updateInfo(obj2);
     }
     @DeleteMapping("/delete/{no}")
     public String delete(@PathVariable int no)
     {
    	 serobj.DeleteInfo(no);
    	 return "no "+no+" delete";
     }
     
}

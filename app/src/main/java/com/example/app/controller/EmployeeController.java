package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
     //sorting
     @GetMapping("/sort/{no}")
     public List<Employee> SortDetails(@PathVariable("no") String no)
     {
    	 return serobj.sort(no);
     }
     //query
     @GetMapping("/prefixname")
     public List<Employee> fetchEmployeeByIdNamePrefix(@RequestParam String prefix)
     {
    	 return serobj.fetchEmployeeByIdNamePrefix(prefix);
     }
     
     @GetMapping("/fetchStudentByNameSuffix")
     public List<Employee>fetchEmployeeByNameSuffix(@RequestParam String suffix)
     {
     	return serobj.fetchEmployeeByNameSuffix(suffix);
     }
     @GetMapping("/getStudentByDepartment/{department}/{name}")
     public List<Employee>fetchEmployeeByDepartment(@PathVariable String dept,@PathVariable String name)
     {
     	return serobj.getEmployeeByDepartment(dept,name);
     }
     
     @DeleteMapping("/deletemapping/{name}")
     public String deleteEmployeeByName(@PathVariable String name)
     {
    	 int result=serobj.deleteEmployeeByName(name);
    	 if(result>0)
    		 return "Employee record is deleted";
    	 else
    		 return"No record found";
     }
     
     @PutMapping("/updatebyquery/{dept}/{name}")
     public String updateEmployee(@PathVariable ("dept")String dept,@PathVariable ("name")String name)
     {
     	int result= serobj.updateEmployee(dept,name);
     	if(result>0)
     		return "Student record updated";
     	else
     		return "Problem occured while updating";
     	
     	
     }
     @GetMapping("fetchbymail/{email}")
     public List<Employee> fetchEmployeeByEmail(@PathVariable String email){
     	return serobj.fetchEmployeeByEmail(email);
     }
     
     
     
     }
     
     
     


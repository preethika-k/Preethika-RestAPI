package com.example.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.app.model.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
     
	//positional parameters
	@Query("select s from Employee s where s.dept=?1 and s.name=?2")
	public List<Employee>getEmployeeByDepartment(String dept,String name);
	//named parameters
	@Query("select s from Employee s where s.dept=:dept")
	public List<Employee>getEmployeeByDepartment(String dept);
    
	//delete
	@Modifying
	@Query("delete from Employee s where s.name=?1")
	public int deleteEmployeeByName(String name);
	//update
	@Modifying
	@Query("update Employee s set s.dept=?1 where s.name=?2 ")
	 int updateEmployee(String dept,String name);
     
	
	@Query(value="select*from Employee s where s.email=?1",nativeQuery=true)
	public List<Employee>fetchEmployeeByEmail(String email);

	List<Employee> findByNameStartingWith(String prefix);
	List<Employee> findByNameEndingWith(String suffix);
	List<Employee> findByDept(String dept);
}

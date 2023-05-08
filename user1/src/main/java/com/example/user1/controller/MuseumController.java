package com.example.user1.controller;

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

import com.example.user1.model.MuseumModel;
import com.example.user1.service.MuseumService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class MuseumController {
@Autowired
public MuseumService serobj;
//post

@PostMapping("/postmap")
public MuseumModel addDetails(@RequestBody MuseumModel obj2)
{
	return serobj.saveInfo(obj2);
}
//get

@GetMapping("/getmap")
public List<MuseumModel> getDetails()
{
	return serobj.getInfo();
}
//put

@PutMapping("/putmap")
public MuseumModel display(@RequestBody MuseumModel obj3)
{
	return serobj.UpdateInfo(obj3);
}
//delete

@DeleteMapping("/delete/{mid}")
public String delete(@PathVariable("mid") int mid)
{
	serobj.deleteById(mid);
	return "deleted";
}
//sort

@GetMapping("/sort/{mname}")
public List<MuseumModel> sortVote(@PathVariable("mname") String m)///@RequestParam String field
{
	return serobj.sortData(m);//field
}

//pagination

@GetMapping("/pagination")
public List<MuseumModel> page(@RequestParam int pageno,@RequestParam int pagesize)
{
	return serobj.pagination(pageno, pagesize);
}
//sort and page

@GetMapping("/sortpagination")
public List<MuseumModel> sortpage(@RequestParam int pageno,@RequestParam int pagesize,@RequestParam String field)
{
	return serobj.sortpagination(pageno, pagesize,field);
}

//delete query
@Operation(summary = "delete all the students")
@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Museum data deleted successfully"),
@ApiResponse(responseCode = "401", description = "Invalid credentials"),
@ApiResponse(responseCode = "404", description = "Path not found") })

@DeleteMapping("/deletemapping1/{mname}")
public String deleteMuseumByName(@PathVariable("mname") String mname)
{
	 int result=serobj.deleteMuseumByMname(mname);
	 if(result>0)
		 return "Museum record is deleted";
	 else
		 return"No record found";
}

//update query
@Operation(summary = "update all the Museum")
@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Museum data updated successfully"),
@ApiResponse(responseCode = "401", description = "Invalid credentials"),
@ApiResponse(responseCode = "404", description = "Path not found") })


@PutMapping("/updatebyquery/{Theme}/{mname}")
public String updateMuseum(@PathVariable ("Theme")String Theme,@PathVariable ("mname")String mname)
{
	int res=serobj.updateMuseum(Theme, mname);
	if(res>0)
		return "Museum record updated";
	else
		return "Problem occured while updating";
}

//fetch by name start
@Operation(summary = "fetch all the Museum")
@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Museum data fetched successfully"),
@ApiResponse(responseCode = "401", description = "Invalid credentials"),
@ApiResponse(responseCode = "404", description = "Path not found") })


@GetMapping("/prefixname")
public List<MuseumModel> fetchMuseumModelByMnamePrefix(@RequestParam String prefix)
{
	 return serobj.fetchMuseumByMnamePrefix(prefix);
}
//fetch by name end
@Operation(summary = "fetch all the Museum")
@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Museum data fetched successfully"),
@ApiResponse(responseCode = "401", description = "Invalid credentials"),
@ApiResponse(responseCode = "404", description = "Path not found") })


@GetMapping("/Suffixname")
public List<MuseumModel>fetchMuseumByMnameSuffix(@RequestParam String suffix)
{
	return serobj.fetchMuseumByMnameSuffix(suffix);
}
//fetch by theme
@Operation(summary = "fetch all the Museum by theme")
@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Museum data fetched successfully"),
@ApiResponse(responseCode = "401", description = "Invalid credentials"),
@ApiResponse(responseCode = "404", description = "Path not found") })


@GetMapping("/gettheme")
public List<MuseumModel> fetchMuseumByTheme(@RequestParam String Theme)
{
	return serobj.fetchMuseumByTheme(Theme);
}

//native
@Operation(summary = "fetch all the Museum by staff")
@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Museum data fetched successfully"),
@ApiResponse(responseCode = "401", description = "Invalid credentials"),
@ApiResponse(responseCode = "404", description = "Path not found") })


@GetMapping("fetchbystaff/{Staff}")
public List<MuseumModel> fetchEmployeeByStaff(@PathVariable String Staff){
	return serobj.fetchMuseumByStaff(Staff);
}

//select query1
@Operation(summary = "fetch all the Museum by name and obj")
@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Museum data fetched successfully"),
@ApiResponse(responseCode = "401", description = "Invalid credentials"),
@ApiResponse(responseCode = "404", description = "Path not found") })


@GetMapping("/getMuseumByMname/{mname}/{obj}")
public List<MuseumModel> getMuseumByMname(@PathVariable String mname,@PathVariable String obj)
{
	return serobj.getMuseumByMname(mname, obj);
}

//select query2
@Operation(summary = "fetch all the students by name")
@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Museum data fetched successfully"),
@ApiResponse(responseCode = "401", description = "Invalid credentials"),
@ApiResponse(responseCode = "404", description = "Path not found") })


@GetMapping("/getMuseumByMname/{mname}")
public List<MuseumModel> getMuseumByMname(@PathVariable String mname)
{
	return serobj.getMuseumByMname(mname);
}
}


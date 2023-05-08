package com.example.user1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import com.example.user1.model.MuseumModel;

public interface MuseumRepository extends JpaRepository<MuseumModel, Integer>{
     
//delete
	@Modifying
	@Query("delete from MuseumModel s where s.mname=?1")
	public int deleteMuseumByMname(String mname);
	
//update
	@Modifying
	@Query("update MuseumModel s set s.theme=?1 where s.mname=?2 ")
	public int updateMuseum(String theme,String mname);
	
//native
	@Query(value="select * from Model s where s.staff=?1",nativeQuery=true)
	public List<MuseumModel>fetchMuseumByStaff(String staff);
	
//select query1
	@Query("select s from MuseumModel s where s.mname=?1 and s.obj=?2")
	public List<MuseumModel> getMuseumByMname(String mname,String obj);

//select query2
	@Query("select s from MuseumModel s where s.mname=:mname")
	public List<MuseumModel> getMuseumByMname(String mname);
	
	List<MuseumModel> findByMnameStartingWith(String prefix);
	List<MuseumModel> findByMnameEndingWith(String suffix);
	List<MuseumModel> findByTheme(String Theme);
	
}

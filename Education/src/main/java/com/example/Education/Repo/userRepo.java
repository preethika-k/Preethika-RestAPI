package com.example.Education.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Education.Model.user;

public interface userRepo extends JpaRepository<user, Integer>{
	
	user findByEmail(String email);

}

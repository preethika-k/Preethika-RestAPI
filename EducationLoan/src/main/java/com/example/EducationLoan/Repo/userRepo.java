package com.example.EducationLoan.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationLoan.Model.user;

@Repository
public interface userRepo extends JpaRepository<user, Integer>{

}

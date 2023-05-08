package com.example.user1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user1.model.Person;

@Repository
public interface Personrepo extends JpaRepository<Person, Long>{

}

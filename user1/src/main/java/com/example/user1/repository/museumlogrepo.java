package com.example.user1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user1.model.museumlogmodel;
public interface museumlogrepo extends JpaRepository<museumlogmodel, Integer>{

	museumlogmodel findByUsername(String name);
}

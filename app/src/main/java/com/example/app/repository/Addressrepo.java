package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.model.Address;

@Repository
public interface Addressrepo extends JpaRepository<Address, Long>{

}

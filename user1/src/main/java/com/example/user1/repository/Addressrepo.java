package com.example.user1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user1.model.Address;

@Repository
public interface Addressrepo extends JpaRepository<Address, Long>{

}

package com.example.review1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.review1.model.MuseumModel;

public interface MuseumRepository extends JpaRepository<MuseumModel, Integer> {

}

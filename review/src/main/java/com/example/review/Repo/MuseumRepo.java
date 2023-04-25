package com.example.review.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.review.model.MuseumModel;

public interface MuseumRepo extends JpaRepository<MuseumModel, Integer> {

}

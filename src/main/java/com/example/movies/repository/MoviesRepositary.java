package com.example.movies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movies.entity.Movies;

public interface MoviesRepositary extends JpaRepository<Movies, Integer>{

	

}

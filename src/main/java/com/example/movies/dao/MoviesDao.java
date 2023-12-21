package com.example.movies.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.movies.entity.Movies;
import com.example.movies.repository.MoviesRepositary;
@Repository
public class MoviesDao {
@Autowired
MoviesRepositary movrepo;

public Movies insertMovie(Movies m) {
	movrepo.save(m);
	return m;
}

public Movies findMovie(int m1) {
	
	return movrepo.findById(m1).get();
}

public Movies updateMovie(Movies m2) {
	return movrepo.save(m2);
}

public Movies deleteMovie(int m3) {
	Movies mov=movrepo.findById(m3).get();
	  movrepo.deleteById(m3);
	  return mov;
}

public List<Movies> findAllMovie() {
	return movrepo.findAll();
}
 	}

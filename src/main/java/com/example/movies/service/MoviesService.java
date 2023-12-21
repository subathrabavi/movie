package com.example.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.movies.dao.MoviesDao;
import com.example.movies.entity.Movies;
@Service
public class MoviesService {
	@Autowired
MoviesDao movdao;
	public Movies insertMovie(Movies m) {
		return movdao.insertMovie(m);
	}
	public Movies findMovie(int m1) {
				return movdao.findMovie(m1);
	}
	public Movies updateMovie(Movies m2) {
		return movdao.updateMovie(m2);
	}
	public Movies deleteMovie(int m3) {
		return movdao.deleteMovie(m3);
	}
	public List<Movies> findAllMovie() {
		return movdao.findAllMovie();
	}

}

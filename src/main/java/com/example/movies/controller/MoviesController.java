package com.example.movies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.movies.entity.Movies;
import com.example.movies.service.MoviesService;

@RestController
@CrossOrigin(origins="*")
public class MoviesController {
	@Autowired
	MoviesService movser;

	@PostMapping(value = "/add")
	public Movies insertMovie(@RequestBody Movies m) {
		return movser.insertMovie(m);
	}

	@GetMapping(value = "/find/{m1}")
	public Movies findMovie(@PathVariable int m1) {
		return movser.findMovie(m1);
	}

	@PutMapping(value = "/update")
	public Movies updateMovie(@RequestBody Movies m2) {
		return movser.updateMovie(m2);
	}

	@DeleteMapping(value = "/delete/{m3}")
	public Movies deleteMovie(@PathVariable int m3) {
		return movser.deleteMovie(m3);
	}
	@GetMapping(value="/findall")
	public List<Movies> findAllMovie() {
		return movser.findAllMovie();
	}

}

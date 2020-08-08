package com.capg.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.movie.model.MovieCatelog;
import com.capg.movie.service.MovieCatelogService;

@RestController
public class MovieCatelogController {
	
	@Autowired
	MovieCatelogService service;
	
	@PostMapping("/catelog/add")
	public MovieCatelog addMovieCatelog(@RequestBody MovieCatelog catelog) {
		return service.addCatelog(catelog);
		
	}
	
	
	@GetMapping("/catelog/id/{id}")
	public MovieCatelog getMovieInfo(@PathVariable int id) {
		return service.getCatelog(id);

	}

}

package com.capg.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capg.movie.model.MovieInfo;
import com.capg.movie.service.MovieInfoService;

@RestController
public class MovieInfoController {
	
	@Autowired
	MovieInfoService service;
	
	@GetMapping("info/id/{id}")
	public MovieInfo getMovieInfo(@PathVariable int id) {
		return service.getMovieInfo(id);
		
	}

}

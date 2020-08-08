package com.capg.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.movie.DAO.MovieRatingRepo;
import com.capg.movie.model.MovieRating;

@Service
public class MovieRatingService {
	@Autowired
	MovieRatingRepo repo;
	
	public MovieRating getRating(int id) {
		return repo.getOne(id);
	}
	public MovieRating addRating(MovieRating rating) {
		return repo.save(rating);
	}
	
	

}

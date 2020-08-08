package com.capg.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.movie.model.MovieCatelog;
import com.capg.movie.model.MovieInfo;
import com.capg.movie.model.MovieRating;

@Service
public class MovieInfoService {
	
	@Autowired
	RestTemplate rt;
	
	public MovieInfo getMovieInfo(int id) {
		MovieCatelog catelog=rt.getForObject("http://localhost:8001/catelog/id/"+id, MovieCatelog.class);
		MovieRating rating=rt.getForObject("http://localhost:8101/rating/id/"+id, MovieRating.class);
		MovieInfo info=new MovieInfo(id,catelog.getMovieName(),rating.getRating());
		return info;

	}

}
